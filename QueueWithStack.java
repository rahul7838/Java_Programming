import java.util.Stack;

public class QueueWithStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void enque(int value) {
        s1.push(value);
    }

    public int deque() {
        while (!s1.empty()) {
            int temp = s1.pop();
            s2.push(temp);
        }
        int ans = s2.pop();
        while (!s2.empty()) {
            int temp = s2.pop();
            s1.push(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        QueueWithStack q = new QueueWithStack();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
    }
}
