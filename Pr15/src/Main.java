import java.io.*;
import java.net.*;
import java.util.*;

public class Main {
    private static final int PORT = 1717;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("HTTP-сервер запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"), true);

        String line = in.readLine();
        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        if (method.equals("GET") && path.startsWith("/convert")) {
            handleConversionRequest(path, out);
        } else {
            handleNotFound(out);
        }

        out.flush();
    }

    private static void handleConversionRequest(String path, PrintWriter out) {
        try {
            Map<String, String> queryParams = parseQueryParams(path);
            double value = Double.parseDouble(queryParams.get("value"));
            String fromUnit = queryParams.get("from");
            String toUnit = queryParams.get("to");

            double result = convertUnits(value, fromUnit, toUnit);
            sendHttpResponse(out, 200,
                    "<html><body><h1>Бяка готова</h1>" +
                            "<p> Лазаренко Сергей Александрович ИКБО-10-23</p>" +
                            "<p><b>Результат:</b> " + value + " " + fromUnit + " = " + result + " " + toUnit + "</p>" +
                            "</body></html>"
            );
        } catch (Exception e) {
            sendHttpResponse(out, 400,
                    "<html><body><h1>Ошибка запроса</h1>" +
                            "<p>Проверьте правильность введённых параметров.</p>" +
                            "<p>Лазаренко Сергей Александрович ИКБО-10-23</p>" +
                            "</body></html>"
            );
        }
    }

    private static Map<String, String> parseQueryParams(String path) {
        Map<String, String> queryParams = new HashMap<>();
        String[] parts = path.split("\\?");
        if (parts.length > 1) {
            String[] params = parts[1].split("&");
            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue.length == 2) {
                    queryParams.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return queryParams;
    }

    private static double convertUnits(double value, String from, String to) {
        Map<String, Double> lengthConversions = Map.of(
                "metersToKilometers", 0.001,
                "kilometersToMeters", 1000.0,
                "metersToCentimeters", 100.0,
                "centimetersToMeters", 0.01
        );

        String key = from + "To" + to.substring(0, 1).toUpperCase() + to.substring(1);
        if (lengthConversions.containsKey(key)) {
            return value * lengthConversions.get(key);
        } else {
            throw new IllegalArgumentException("Unsupported conversion");
        }
    }

    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404,
                "<html><body><h1>404 Страница не найдена</h1>" +
                        "<p>Лазаренко Сергей Александрович ИКБО-10-23</p>" +
                        "</body></html>"
        );
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html; charset=UTF-8");
        out.println("Content-Length: " + body.getBytes().length);
        out.println();
        out.println(body);
    }
}
