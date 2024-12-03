import java.util.LinkedHashSet;

public class LinkedHashSetStuff {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Pineapple");
        linkedHashSet.add("Cherry");
        System.out.println(linkedHashSet);
        linkedHashSet.add("Satsuma");
        linkedHashSet.add("Pear");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Satsuma");
        System.out.println(linkedHashSet);
    }
}
