package com.example.Pr16.controller;

import com.example.Pr16.model.SearchResult;
import com.example.Pr16.model.User;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthController {

    private User registeredUser;
    private boolean isAuthenticated = false;

    // OMDb API Configuration
    private static final String OMDB_API_URL = "http://www.omdbapi.com/";
    private static final String API_KEY = "b078e1c3";

    @GetMapping("/")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, Model model) {
        if (username.isEmpty() || password.isEmpty()) {
            model.addAttribute("error", "Имя пользователя и пароль не должны быть пустыми!");
            return "register";
        }
        registeredUser = new User(username, password);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (registeredUser == null ||
                !registeredUser.getUsername().equals(username) ||
                !registeredUser.getPassword().equals(password)) {
            model.addAttribute("error", "Неверное имя пользователя или пароль!");
            return "login";
        }
        isAuthenticated = true;
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {
        if (!isAuthenticated) {
            return "redirect:/login";
        }
        model.addAttribute("username", registeredUser.getUsername());
        return "home";
    }

    @PostMapping("/home")
    public String handleHomePost(@RequestParam("formType") String formType,
                                 @RequestParam(value = "query", required = false) String query,
                                 Model model) {
        if (!isAuthenticated) {
            return "redirect:/login";
        }

        model.addAttribute("username", registeredUser.getUsername());

        if ("search".equals(formType)) {
            if (query == null || query.trim().isEmpty()) {
                model.addAttribute("error", "Ключевое слово не должно быть пустым!");
                return "home";
            }

            try {
                List<SearchResult> results = performMovieSearch(query);
                model.addAttribute("query", query);
                model.addAttribute("results", results);
            } catch (Exception e) {
                model.addAttribute("error", "Произошла ошибка при выполнении поиска. Пожалуйста, попробуйте позже.");
                e.printStackTrace();
            }
        }

        return "home";
    }

    /**
     * Метод для выполнения поиска фильмов через OMDb API.
     * @param query Ключевое слово для поиска.
     * @return Список результатов поиска.
     * @throws Exception В случае ошибок при выполнении HTTP-запроса или парсинга ответа.
     */
    private List<SearchResult> performMovieSearch(String query) throws Exception {
        // Кодирование ключевого слова
        String encodedQuery = URLEncoder.encode(query, "UTF-8");

        // Формирование полного URL запроса
        String urlString = OMDB_API_URL + "?s=" + encodedQuery + "&apikey=" + API_KEY;

        // Выполнение HTTP-запроса
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(2000);
        conn.setReadTimeout(2000);

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("HTTP запрос не удался. Код ответа: " + responseCode);
        }

        // Чтение ответа
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder responseBuilder = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            responseBuilder.append(inputLine);
        }
        in.close();
        conn.disconnect();

        // Парсинг JSON-ответа
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(responseBuilder.toString());
        JsonNode searchResults = rootNode.path("Search");

        List<SearchResult> results = new ArrayList<>();
        if (searchResults.isArray()) {
            for (JsonNode movie : searchResults) {
                String title = movie.path("Title").asText("N/A");
                String year = movie.path("Year").asText("N/A");
                String imdbID = movie.path("imdbID").asText("N/A");

                // Создаем новый SearchResult для фильма
                SearchResult result = new SearchResult(title, List.of("IMDB ID: " + imdbID), year);
                results.add(result);
            }
        }

        return results;
    }

    @GetMapping("/error")
    public String handleError(Model model) {
        model.addAttribute("error", "Ошибка: данный запрос не поддерживается.");
        return "error";
    }
}
