package AnimalImplemet;

public class Dog extends Animal {
    public Dog(int _age, int _size) {
        super(_age, _size);
    }

    @Override
    public int toHumanAge(){
        return super.get_age() * 7;
    }

    @Override
    public void move(){
        System.out.println("AnimalImplemet.Dog move");
    }
}
