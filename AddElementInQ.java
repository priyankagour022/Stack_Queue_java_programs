
// import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

public class AddElementInQ {
    public static void main(String[] args) {
        // Queue<String> string = new PriorityQueue<>();
        // string.add("Hello");
        // string.add("World");
        // System.out.println(string);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        System.out.println(q);
        q.remove();
        System.out.println(q);

    }
}
