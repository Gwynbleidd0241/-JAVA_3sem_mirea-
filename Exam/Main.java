import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args){
//        System.out.println("Hello World");
//        System.exit(1);
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("It's alive! It's alive!");
//    }
//}
// ---------------------------------------------------------------
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[] {1,2,3,4,5};
//        int [] [] array = new int[1][2];
//        System.out.println(Arrays.toString(arr));
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        int a = 5;
//        if (a == 4) {
//            System.out.println("It is a real number");
//        } else {
//            System.out.println("It is not a real number");
//        }
//        System.out.println("It is " + ((a == 4) ? "a real number" : "not a real number"));
//    }
//}
// ---------------------------------------------------------------
//class Car {
//    String model;
//
//    public Car(String model) {
//        this.model = model;
//    }
//    @Override
//    public String toString(){
//        return "Engine of " + model;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Car Car = new Car("Tesla");
//        System.out.println(Car);
//    }
//}
// ---------------------------------------------------------------
// Работа со списками(Создание третьего из чередующихся значений двух других списков)
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> list2 = Arrays.asList(6,7,8,9,10, 12);
//
//        List<Integer> list3 = mergeAllElements(list1, list2);
//        System.out.println(list3);
//    }
//
//    public static <T> List<T> mergeAllElements(List<T> list1, List<T> list2) {
//        List<T> result = new ArrayList<>();
//
//        int maxSize = Math.max(list1.size(), list2.size());
//        for (int i = 0; i < maxSize; i++) {
//            if (i < list1.size()) {result.add(list1.get(i));}
//            if (i < list2.size()) {result.add(list2.get(i));}
//        }
//        return result;
//    }
//}
// ---------------------------------------------------------------
// Факториал
//import java.math.BigInteger;
//
//public class Main{
//    public static BigInteger factorial(int value) {
//        BigInteger factorial = BigInteger.ONE;
//        for(int i = 1; i <= value; i++){
//            factorial =  factorial.multiply(BigInteger.valueOf(i));
//        }
//        return factorial;
//    }
//
//    public static void main(String[] args) {
//        int value = 1202;
//        System.out.println("Factorial of " + value + " is " + factorial(value));
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        int message;
//        Scanner scan = new Scanner(System.in);
//        if(scan.hasNextInt()) {
//            message = scan.nextInt();
//            System.out.println(message);
//        } else {
//            System.out.println("Invalid input");
//        }
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args){
//        Car car = new Car("Toyota", 2021);
//        System.out.println(car.model);
//
//    }
//}
//
//class Car {
//    String model;
//    int year;
//
//    public Car(String model, int year) {
//        this.model = model;
//        this.year = year;
//    }
//
//    public String getModel() {
//        return model;
//    }
//    public int getYear() {
//        return year;
//    }
//}
// ---------------------------------------------------------------
// Записи в Java
//record Product(String name, double price) {}
//
//public class Main {
//    public static void main(String[] args) {
//        Product product1 = new Product("BMW", 10.0);
//        System.out.println(product1);
//    }
//}
// ---------------------------------------------------------------
// Запечатанные классы в Java
//public sealed class Main permits Circle, Triangle {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
//
//final class Circle extends Main{}
//final class Triangle extends Main{}
// ---------------------------------------------------------------
// Конструктор через this
//public class Main{
//    public static void main(String[] args) {
//        Person person1 = new Person("Bob", 18);
//        Person person2 = new Person( "Alice");
//        person1.display();
//        person2.display();
//    }
//}
//
//class Person{
//    String name;
//    int age;
//
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(String name) {
//        this(name, 18);
//    }
//
//    public void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}
// ---------------------------------------------------------------
// Использование родительского конструктора через super(ПРИ НАСЛЕДОВАНИИ КОНСТРУКТОРЫ НЕ НАСЛЕДУЮТСЯ!)
//class Animal {
//    String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//}
//
//class Dog extends Animal {
//    String surname;
//
//    public Dog(String surname, String name) {
//        super(name);
//        this.surname = surname;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Bilan", "Dima");
//        System.out.println(dog.surname);
//        System.out.println(dog.name);
//    }
//}
// ---------------------------------------------------------------
// Cоздание объектов через фабричный метода
//class Biba {
//    String name;
//
//    public Biba(String name) {
//        this.name = name;
//    }
//}
//class BibaFactory {
//    public static Biba createBiba(String name) {
//        return new Biba(name);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Biba biba = BibaFactory.createBiba("Dima");
//        System.out.println(biba.name);
//    }
//}
// ---------------------------------------------------------------
// Рефлексия
//class Car {
//    private String name;
//    private int age;
//
//    public Car(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void displayInfo() {
//        System.out.println("Name: " + name + " fAge: " + age);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        try {
//            Class<?> carClass = Class.forName("Car");
//            Car car = (Car) carClass.getDeclaredConstructor(String .class, int .class).newInstance("Honda", 2019);
//            car.displayInfo();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
// ---------------------------------------------------------------
// Тригометрические методы класса Math в Java
//public class Main {
//    public static void main(String[] args) {
//        double angleDegrees = 30.0;
//
//        double angleRadians = Math.toRadians(angleDegrees);
//
//        double sinValue = Math.sin(angleRadians);
//        double cosValue = Math.cos(angleRadians);
//
//        System.out.println(sinValue);
//        System.out.println(cosValue);
//    }
//}
// ---------------------------------------------------------------
// Экспоненциальные методы класа Math в Java
//public class Main {
//    public static void main(String[] args) {
//        double v = 2.0;
//
//        double vExp = Math.exp(v);
//        double vLn = Math.log10(vExp);
//        double vlog = Math.log(vExp);
//
//        System.out.println(vExp);
//        System.out.println(vLn);
//        System.out.println(vlog);
//    }
//}
// ---------------------------------------------------------------
// Aссоциация (Один класс использует другой, но они могут существовать отдельно)
//class University {
//    private String name;
//
//    public University(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Student {
//    private String name;
//    private University university;
//
//
//    public Student(String name, University university) {
//        this.name = name;
//        this.university = university;
//    }
//
//    public void display() {
//        System.out.println(name + " учится в " + university.getName());
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        University uni = new University("Harvard");
//        Student Dima = new Student("Dima", uni);
//        Dima.display();
//    }
//}
// ---------------------------------------------------------------
// Агрегация (Слабый тип ассоциации, когда один объект включает в себя другой, но не владеет им полностью)
//class Teacher {
//    private String name;
//
//    public Teacher(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class School {
//    private String name;
//    private List<Teacher> teachers;
//
//    public School(String name, List<Teacher> teachers) {
//        this.name = name;
//        this.teachers = teachers;
//    }
//
//    public void showTeachers() {
//        System.out.println("Школа " + name + " имеет учителей:");
//        for (Teacher t : teachers) {
//            System.out.println("- " + t.getName());
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Teacher t1 = new Teacher("Mr. Smith");
//        Teacher t2 = new Teacher("Ms. Johnson");
//
//        School school = new School("Green High", List.of(t1, t2));
//        school.showTeachers();
//    }
//}
// ---------------------------------------------------------------
// Композиция (сильный тип ассоциацици, когда один объект владеет другим и управляет его жизненным циклом)
//class Heart {
//    public void beat() {
//        System.out.println("Сердце бьется...");
//    }
//}
//
//class Person {
//    private Heart heart;
//
//    public Person() {
//        this.heart = new Heart();
//    }
//
//    public void live(){
//        heart.beat();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.live();
//    }
//}
// ---------------------------------------------------------------
// Наследование (Отношение(is-a), когда один класс расширяет другой)
//class Animal {
//    public void makeSound() {
//        System.out.println("Животное издаёт звук...");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Собака лает: Гав-гав!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal myDog = new Dog();
//        myDog.makeSound();
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        int num = 42;
//
//        Integer numObj = Integer.valueOf(num);
//        System.out.println(numObj);
//
//        int number = numObj.intValue();
//        System.out.println(number);
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        String s = "23";
//        int sInt = Integer.parseInt(s);
//        Integer sInteger = Integer.valueOf(s);
//        int ss =  sInteger.intValue();
//        System.out.println(sInteger);
//        System.out.println(sInt);
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Integer a = 5;
//        Integer b = 10;
//
//        int result = a.compareTo(b);
//        System.out.println(result);
//        if (result < 0) {
//            System.out.println(a + " меньше " + b);
//        } else if (result == 0) {
//            System.out.println("ravno");
//        } else if (result > 0) {
//            System.out.println("bolshe");
//        }
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        String s = "Welcome".replace('e', 'a');
//        String w = "Welcome".replaceFirst("el", "al");
//        String e = "Welcome".replaceAll("e", "al");
//        System.out.println(s + " " + w + " " + e);
//        String [] tokens = "Java#HTML#CSS".split("#");
//        for (String token : tokens) {
//            System.out.println(token);
//        }
//
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        char[] chars = "Java".toCharArray();
//        for (char c : chars) {
//            System.out.println(c);
//        }
//
//        String str = new String(new char[]{'a', 'b', 'c'});
//        System.out.println(str);
//
//        String str1 = String.valueOf(new char[]{'a', 'b', 'c'});
//        System.out.println(str1);
//    }
//}
// ---------------------------------------------------------------
//StringBuilder (такой же как и StringBuffer, только второй потокобезопасный и синхронизированный)
//public class Main {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//
//        sb.append("!");
//        sb.insert(1, 'a');
//        sb.replace(1,2, "ab");
//        sb.reverse();
//        System.out.println(sb);
//    }
//}
// ---------------------------------------------------------------
// Пример использования интерфейсов
//interface Printable {
//    void print();
//}
//
//class TextDocument implements Printable {
//    @Override
//    public void print() {
//        System.out.println("Text Document");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Printable td = new TextDocument();
//        td.print();
//    }
//}
// ---------------------------------------------------------------
//class Person implements Comparable<Person> {
//    int age;
//    String name;
//
//    public Person(String name, int age) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int compareTo(Person other) {
//        return Integer.compare(this.age, other.age);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 30));
//        people.add(new Person("Bob", 20));
//        people.add(new Person("Charlie", 25));
//
//        System.out.println("Before sorting:");
//        System.out.println(people);
//
//        Collections.sort(people);
//        System.out.println("After sorting:");
//        System.out.println(people);
//    }
//}
// ---------------------------------------------------------------
//class Person implements Cloneable {
//    String name;
//    public Person(String name) {
//        this.name = name;
//    }
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone(); // поверхностная копия
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            Person p1 = new Person("John");
//            Person p2 = (Person) p1.clone();
//            System.out.println("Cloned person: " + p2.name);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }
//}
// ---------------------------------------------------------------
//abstract class Animal {
//    String name;
//
//    Animal(String name) {
//        this.name = name;
//    }
//    //Абстрактный метод
//    abstract void eat();
//    // Конкретный метод с реализацией
//    void makeSound() {
//        System.out.println("I'm sound");
//    }
//}
//
//class Dog extends Animal {
//
//    Dog(String name) {
//        super(name);
//    }
//
//    @Override
//    void eat() {
//        System.out.println("I'm soundddddd");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal dog = new Dog("Dog");
//        dog.eat();
//    }
//}
// ---------------------------------------------------------------
// Множественное наследование
//interface A {
//    default void eat() {
//        System.out.println("eatA");
//    }
//}
//
//interface B {
//    default void eat() {
//        System.out.println("eatB");
//    }
//}
//
//class Person implements A, B {
//    @Override
//    public void eat() {
//        A.super.eat();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.eat();
//    }
//}
// ---------------------------------------------------------------
// Пример выбрасывания ошибки через throw
//public class Main {
//    public static void main(String[] args) {
//        int age = 15;
//        if (age < 18) {
//            throw new IllegalArgumentException("Возраст должен быть 18+!");
//        }
//        System.out.println("Доступ разрешён");
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[]  args){
//        try{
//            int a = 10/0;
//        } catch (ArithmeticException e){
//            System.out.println(e);
//        }
//    }
//}
// ---------------------------------------------------------------
//class AgeException extends Exception{
//    public AgeException(String message){
//        super(message);
//    }
//}
//
//public class Main {
//    public static void checkAge(int age) throws AgeException{
//        if(age < 18) {
//            throw new AgeException("Age must be at least 18");
//        }
//        System.out.println("Age is " + age);
//    }
//    public static void main(String[] args) {
//        try{
//            checkAge(15);
//        } catch (AgeException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
// ---------------------------------------------------------------
// Пример try-with-resourses(После записи автоматически закроет файл)
//public class Main {
//    public static void main(String[] args) {
//        try(FileWriter writer = new FileWriter("output.txt")) {
//            writer.write("Hellow");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
// ---------------------------------------------------------------
//enum Day {
//    MONDAY("Понедельник", false),
//    TUESDAY("Вторник", false),
//    WEDNESDAY("Среда", false),
//    THURSDAY("Четверг", false),
//    FRIDAY("Пятница", false),
//    SATURDAY("Суббота", true),
//    SUNDAY("Воскресенье", true);
//
//
//    private final String name;
//    private final boolean isWeekend;
//
//    Day(String name, boolean isWeekend) {
//        this.name = name;
//        this.isWeekend = isWeekend;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isWeekend() {
//        return isWeekend;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Day today = Day.FRIDAY;
//
//        System.out.println(today.getName());
//        System.out.println((today.isWeekend()) ? "Да" : "Нет");
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Простое GUI");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//
//        JLabel label = new JLabel("Нажмите кнопку");
//        frame.add(label);
//
//        JButton button = new JButton("Нажми меня");
//        frame.add(button);
//
//        button.addActionListener(e -> label.setText("Кнопка нажата!"));
//
//        frame.setVisible(true);
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Пример JPanel");
//        frame.setSize(400, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//
//        panel.add(new JButton("Кнопка 1"));
//        panel.add(new JButton("Кнопка 2"));
//        panel.add(new JButton("Кнопка 3"));
//
//        frame.add(panel, BorderLayout.CENTER);
//        frame.setVisible(true);
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setSize(200, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JButton button = new JButton("Load");
//        JLabel label = new JLabel("Wait...");
//
//        button.addActionListener(e -> label.setText("Кнопка нажата"));
//        frame.setLayout(new FlowLayout());
//        frame.add(button);
//        frame.add(label);
//        frame.setVisible(true);
//    }
//}
// ---------------------------------------------------------------
//class Box <T> {
//    private T value;
//    public Box(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Box <String> box = new Box<>("Hello");
//        String s = box.getValue();
//    }
//}
// ---------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        System.out.println(list);
//
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "ser");
//        System.out.println(map);
//
//        HashSet<String> set = new HashSet<>();
//        set.add("Hello");
//        System.out.println(set);
//    }
//}
// ---------------------------------------------------------------
// Задача с билета про кости
//class DiceGame {
//    private Random random = new Random();
//
//    public int rollDice(){
//        return random.nextInt(6) + 1 + random.nextInt(6) + 1;
//    }
//
//    public void playGame(String[] players){
//        String winner = "";
//        int highestScore = 0;
//
//
//        for(String player : players){
//            int score = rollDice();
//            System.out.println(player + " выбросил " + score);
//
//            if(score > highestScore){
//                winner = player;
//                highestScore = score;
//            }
//        }
//
//        System.out.println("Победитель: " + winner + " с результатом " + highestScore);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[] players = {"Alice", "Dima", "Sasha"};
//        DiceGame game = new DiceGame();
//        game.playGame(players);
//    }
//}
// ---------------------------------------------------------------
// Билет №1
//class ReverseProcessor {
//    public void processInput(InputStream inputStream, OutputStream outputStream) {
//        Scanner scanner = new Scanner(inputStream);
//        List<String> lines = new ArrayList<>();
//
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            if (line.isEmpty()) {
//                break;
//            }
//            lines.add(line);
//        }
//
//        scanner.close();
//
//        List<String> reversedLines = new ArrayList<>();
//        for(String line : lines) {
//            reversedLines.add(new StringBuilder(line).reverse().toString());
//        }
//
//        Collections.reverse(reversedLines);
//
//        for(String line : reversedLines) {
//            System.out.println(line);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ReverseProcessor reverseProcessor = new ReverseProcessor();
//        reverseProcessor.processInput(System.in, System.out);
//    }
//}
// ---------------------------------------------------------------
// Билет №7
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LinkedList<Integer> list = new LinkedList<>();
//
//        String input = scanner.nextLine();
//        scanner.close();
//
//        for(String s : input.split("->")) {
//            list.add(Integer.parseInt(s.trim()));
//        }
//
//        printReverse(list, list.size() - 1);
//    }
//
//    public static void printReverse(List<Integer> list, int index) {
//        if (index < 0) return;
//
//        System.out.print(list.get(index));
//        if(index > 0) {
//            System.out.print(" -> ");
//        }
//
//        printReverse(list, index - 1);
//    }
//}
// ---------------------------------------------------------------
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int totalWordCount = 0;
//
//        while(true){
//            String line = scanner.nextLine().trim();
//
//            if(line.isEmpty()) break;
//
//            String[] words = line.split("[\\s\\p{Punct}]+");
//
//            int wordCount = 0;
//            for(String word : words){
//                if(!word.isEmpty()){
//                    wordCount++;
//                }
//            }
//
//            totalWordCount += wordCount;
//        }
//        scanner.close();
//        System.out.println("Общее количество слов: " + totalWordCount);
//    }
//}
// ---------------------------------------------------------------
//class Product{
//    private String name;
//    private double price;
//    private int grade;
//
//    public Product(String name, double price, int grade){
//        this.name = name;
//        this.price = price;
//        this.grade = grade;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Самый высокий телевизор", 500.0, 1));
//        products.add(new Product("Самый высокий шкаф", 700.5, 2));
//        products.add(new Product("Обычный стол", 300.0, 2));
//        products.add(new Product("Самый высокий стол", 450.0, 3));
//        products.add(new Product("Самый высокий компьютер", 1000.0, 1));
//
//        double maxPrice = 0;
//        Product maxProduct = null;
//
//        for(Product product : products){
//            if ((product.getGrade() == 1 || product.getGrade() == 2) &&
//                    product.getName().toLowerCase().contains("самый высокий")) {
//                if(product.getPrice() > maxPrice){
//                    maxPrice = product.getPrice();
//                    maxProduct = product;
//                }
//            }
//        }
//
//        if(maxProduct != null){
//            System.out.println("Самый дорогой товар: " + maxProduct.getName());
//            System.out.println("Цена: " + maxPrice);
//        } else {
//            System.out.println("Подходящих товаров не найдено.");
//        }
//    }
//}
// ---------------------------------------------------------------
//abstract class Employee {
//    protected String name;
//    protected double salary;
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public abstract double calculeteBonus();
//}
//
//interface Reportable {
//    void generateReport();
//}
//
//class Manager extends Employee implements Reportable {
//    private int completedProjects;
//
//    public Manager(String name, double salary, int completedProjects) {
//        super(name, salary);
//        this.completedProjects = completedProjects;
//    }
//
//    @Override
//    public double calculeteBonus() {
//        return 100 * completedProjects;
//    }
//
//    @Override
//    public void generateReport() {
//        System.out.println("Отчёт для менеджера: " + name);
//        System.out.println("Базовая зарплата: " + salary);
//        System.out.println("Общий бонус: " + calculeteBonus());
//        System.out.println("Итоговая зарплата: " + (salary + calculeteBonus()));
//    }
//}
//
//class Developer extends Employee {
//    private int linesOfCode;
//
//    public Developer(String name, double salary, int linesOfCode) {
//        super(name, salary);
//        this.linesOfCode = linesOfCode;
//    }
//
//    @Override
//    public double calculeteBonus() {
//        return (linesOfCode / 1000) * 0.5;
//    }
//
//    public void printDeveloperInfo() {
//        System.out.println("Разработчик: " + name);
//        System.out.println("Базовая зарплата: " + salary);
//        System.out.println("Количество написанных строк кода: " + linesOfCode);
//        System.out.println("Общий бонус: " + calculeteBonus());
//        System.out.println("Итоговая зарплата: " + (salary + calculeteBonus()));
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Manager manager = new Manager("Manager", 1000, 1);
//        manager.generateReport();
//
//        System.out.println();
//
//        Developer developer = new Developer("Developer", 1000, 1);
//        developer.printDeveloperInfo();
//    }
//}
// ---------------------------------------------------------------
// Функциональное программирование
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        int sumOfSquares= numbers.stream()
//                .map(num -> num * num)
//                .reduce(0, Integer::sum);
//        System.out.println(sumOfSquares);
//    }
//}
// ---------------------------------------------------------------
// билет 35
//import java.util.Stack;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Main {
//    public static void splitStack(Stack<Integer> stack) {
//        Queue<Integer> queue = new LinkedList<>();
//
//        while (!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//
//        for (int num : queue) {
//            if (num < 0) {
//                stack.push(num);
//            }
//        }
//
//        for (int num : queue) {
//            if (num >= 0) {
//                stack.push(num);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(-1);
//        stack.push(4);
//        stack.push(-5);
//        stack.push(2);
//        stack.push(-6);
//
//        splitStack(stack);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//    }
//}
// ---------------------------------------------------------------
// билет 23
//public class Main {
//    public static boolean isPowerOfTwo(int n) {
//        if (n == 1) {
//            return true;
//        }
//        if (n % 2 != 0 || n < 1) {
//            return false;
//        }
//        return isPowerOfTwo(n / 2);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        if (isPowerOfTwo(N)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//        scanner.close();
//    }
//}
// ---------------------------------------------------------------
// билет 5
//public class Main {
//    public static String normalizePath(String path) {
//        String[] parts = path.split("/");
//        Deque<String> stack = new ArrayDeque<>();
//
//        for (String part : parts) {
//            if (part.equals("..")) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                } else {
//                    stack.push("..");
//                }
//            } else if (!part.isEmpty() && !part.equals(".")) {
//                stack.push(part);
//            }
//        }
//
//        List<String> normalizedParts = new ArrayList<>(stack);
//        Collections.reverse(normalizedParts);
//        return String.join("/", normalizedParts);
//    }
//
//    public static void main(String[] args) {
//        String path = "MIREA/JAVA_5_2/src/./../../task_ 5_1/../../../course/prog";
//        System.out.println(normalizePath(path));
//    }
//}
// ---------------------------------------------------------------
// Билет 17
// class Atlethe {
//     private String name;
//     private int t;

//     public Atlethe(String name, int t) {
//         this.name = name;
//         this.t = t;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getT() {
//         return t;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Atlethe> atlethe = new ArrayList<Atlethe>();
//         atlethe.add(new Atlethe("Eлена", 330));
//         atlethe.add(new Atlethe("Павел", 265));
//         atlethe.add(new Atlethe("Иван", 285));
//         atlethe.add(new Atlethe("Катя", 320));
//         atlethe.add(new Atlethe("Филипп", 440));
//         atlethe.add(new Atlethe("Матвей", 395));


//         int minT = 5000;
//         Atlethe minAtlethe = null;

//         for(Atlethe atlethe2 : atlethe) {
//             if(atlethe2.getT() < minT) {
//                 minT = atlethe2.getT();
//                 minAtlethe = atlethe2;
//             }
//         }

//         if(minAtlethe != null) {
//             System.out.println("Самый быстрый в марафоне -> " + minAtlethe.getName() + " co временем " + minAtlethe.getT()/60 +  " часа и " + minAtlethe.getT() % 60 + " минут");
//         }
//     }
// }
