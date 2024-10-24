package AnimalImplemet;

public class Sheep extends Animal {
    public Sheep(int _age, int _size) {
        super(_age, _size);
    }

    @Override
    public int toHumanAge(){
        return (int) (get_age() * 4.3);
    }

    @Override
    public void move(){
        System.out.println("AnimalImplemet.Sheep move");
    }
}
