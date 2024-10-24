package AnimalImplemet;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(5,20);
        dog.move();
        System.out.println("AnimalImplemet.Dog age is " + dog.toHumanAge());

        Animal sheep = new Sheep(5,26);
        sheep.move();
        System.out.println("AnimalImplemet.Sheep age is " + sheep.toHumanAge());
    }
}
