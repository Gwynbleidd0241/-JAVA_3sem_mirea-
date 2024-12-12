public class Animal<E> {
    private E v;

    public Animal(E v) {
        this.v = v;
    }

    public E getValue() {
        return this.v;
    }
}
