import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackOnQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    @Override
    public String toString() {
        return q1.toString();
    }
}
