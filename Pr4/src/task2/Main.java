package task2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 10.5;
        double b = 3.0;

        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a - b = " + calculator.substract(a, b));
        System.out.println("a * b = " + calculator.multiply(a, b));
        System.out.println("a / b = " + calculator.divide(a, b));
        System.out.println("a % b = " + calculator.modulus(a, b));
    }
}

