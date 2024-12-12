public class Main {
    public static void main(String[] args) {
        Animal<Integer>Integer = new Animal<>(10);
        System.out.println("Целочисленный типочек " + Integer.getValue());
        Animal<String>String = new Animal<>("10");
        System.out.println("Строковый типочек " + String.getValue());
        Animal<Boolean> Boolean = new Animal<>(true);
        System.out.println(Boolean.getValue());
    }
}
