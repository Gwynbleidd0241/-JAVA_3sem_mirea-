interface State {
    void handle(Context context);
}

class NewOrderState implements State {
    @Override
    public void handle(Context context) {
        System.out.print("Новый заказ поступил ->");
        context.setState(new ProcessingState());
    }
}

class ProcessingState implements State {
    @Override
    public void handle(Context context) {
        System.out.print(" Заказ готовится->");
        context.setState(new ShippedState());
    }
}

class ShippedState implements State {
    @Override
    public void handle(Context context) {
        System.out.println(" Отправлен заказчику");
    }
}

class Context {
    private State state;

    public Context() {
        this.state = new NewOrderState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.handle(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Context order = new Context();
        order.nextState();
        order.nextState();
        order.nextState();
    }
}
