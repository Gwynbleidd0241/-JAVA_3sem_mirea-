abstract class DeliveryService {
    public abstract Order createOrder(String item);
}

abstract class Order {
    protected String item;

    public Order(String item) {
        this.item = item;
    }

    public abstract void deliver();
}

class PizzaDelivery extends DeliveryService {
    @Override
    public Order createOrder(String item) {
        return new PizzaOrder(item);
    }
}

class PizzaOrder extends Order {
    public PizzaOrder(String item) {
        super(item);
    }

    @Override
    public void deliver() {
        System.out.println("Доставляем пиццу " + item);
    }
}

class GroceryDelivery extends DeliveryService {
    @Override
    public Order createOrder(String item) {
        return new GroceryOrder(item);
    }
}

class GroceryOrder extends Order {
    public GroceryOrder(String item) {
        super(item);
    }

    @Override
    public void deliver() {
        System.out.println("Доставляем продукт " + item);
    }
}

public class Main {
    public static void main(String[] args) {
        DeliveryService pizzaService = new PizzaDelivery();
        Order pizzaOrder = pizzaService.createOrder("Четырые сыра");
        pizzaOrder.deliver();

        DeliveryService groceryService = new GroceryDelivery();
        Order groceryOrder = groceryService.createOrder("Хлеб");
        groceryOrder.deliver();
    }
}