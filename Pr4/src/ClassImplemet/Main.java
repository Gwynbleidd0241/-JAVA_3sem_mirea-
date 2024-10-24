package ClassImplemet;

public class Main {

    abstract static class Animal{

        private int _age;
        private int _size;

        public Animal(int age, int size) {
            this._age = age;
            this._size = size;
        }

        public abstract int toHumanAge();

        public int get_age() {
            return _age;
        }

        public void set_age(int _age) {
            this._age = _age;
        }

        public int get_size() {
            return _size;
        }

        public void set_size(int _size) {
            this._size = _size;
        }
    }

    public static class Dog extends Animal implements  Movable{
        public Dog(int _age, int _size) {
            super(_age, _size);
        }

        @Override
        public int toHumanAge(){
            return super.get_age() * 7;
        }

        @Override
        public void move(){
            System.out.println("Dog move");
        }
    }
    public static class Sheep extends Animal implements Movable {
        public Sheep(int _age, int _size) {
            super(_age, _size);
        }

        @Override
        public int toHumanAge(){
            return (int) (get_age() * 4.3);
        }

        @Override
        public void move(){
            System.out.println("Sheep move");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog(5,20);
        dog.move();
        System.out.println("Dog age is " + dog.toHumanAge());

        Sheep sheep = new Sheep(5,26);
        sheep.move();
        System.out.println("Sheep age is " + sheep.toHumanAge());
    }
}
