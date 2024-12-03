import java.util.LinkedList;

public class LinkedListSuff {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        System.out.println(linkedList);
        linkedList.addFirst("Z");
        System.out.println(linkedList);
        linkedList.addLast("X");
        System.out.println(linkedList);
        System.out.println(linkedList.get(3));
    }
}
