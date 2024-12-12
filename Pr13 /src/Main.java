interface DrawAPI {
    void drawShape(String shape, int x, int y, int size);
}

class RedColor implements DrawAPI {
    public void drawShape(String shape, int x, int y, int size) {
        System.out.println("Нарисован " + shape + " [цвет: красный, размеры: " + size + ", x: " + x + ", y: " + y + "]");
    }
}

class GreenColor implements DrawAPI {
    public void drawShape(String shape, int x, int y, int size) {
        System.out.println("Нарисован " + shape + " [цвет: зеленый, размеры: " + size + ", x: " + x + ", y: " + y + "]");
    }
}

abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawShape("Круг", x, y, radius);
    }
}

class Square extends Shape {
    private int x, y, size;

    public Square(int x, int y, int size, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw() {
        drawAPI.drawShape("Квадрат", x, y, size);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(1, 2, 3, new RedColor());
        Shape greenSquare = new Square(3, 2, 1, new GreenColor());

        redCircle.draw();
        greenSquare.draw();
    }
}
