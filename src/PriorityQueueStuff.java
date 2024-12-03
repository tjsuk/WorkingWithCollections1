import java.util.PriorityQueue;

public class PriorityQueueStuff {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Banana(1)");
        pq.add("Orange(3)");
        pq.add("Banana(4)");
        System.out.println(pq);
        pq.add("Cherry(5)");
        pq.add("Banana(6)");
        pq.add("Apple(7)");
        pq.add("Apple(2)");
        pq.add("Orange(8)");
        pq.add("Orange(9)");
        pq.add("Orange(10)");
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
