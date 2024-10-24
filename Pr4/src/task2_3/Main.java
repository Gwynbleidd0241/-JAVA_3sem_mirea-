package task2_3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 15;
        int b = 3;

        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a - b = " + calculator.subtract(a, b));
        System.out.println("a * b = " + calculator.multiply(a, b));
        System.out.println("a / b = " + calculator.divide(a, b));
        System.out.println("a % b = " + calculator.modulus(a, b));
    }
}
