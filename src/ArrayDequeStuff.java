import java.util.ArrayDeque;

public class ArrayDequeStuff {
    public static void main(String[] args) {
        ArrayDeque<String> a = new ArrayDeque<>();
        a.addLast("Apple");
        a.addLast("Orange");
        a.addLast("Banana");
        a.addFirst("Mango");
        a.addLast("Pineapple");
        System.out.println(a);
        System.out.println(a.pop());
        System.out.println(a);
    }
}
