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
//        // Создание окна
//        JFrame frame = new JFrame("Простое GUI"); // Заголовок окна
//        frame.setSize(300, 200); // Размер окна
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие окна завершает программу
//        frame.setLayout(new FlowLayout()); // Компоновка элементов
//
//        // Добавление метки
//        JLabel label = new JLabel("Нажмите кнопку");
//        frame.add(label);
//
//        // Создание кнопки
//        JButton button = new JButton("Нажми меня");
//        frame.add(button);
//
//        // Обработка нажатия на кнопку
//        button.addActionListener(e -> label.setText("Кнопка нажата!"));
//
//        // Отображение окна
//        frame.setVisible(true);
//    }
//}