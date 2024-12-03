import java.util.TreeSet;

public class TreeSetStuff {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Banana"); // no duplication
        treeSet.add("Pineapple");
        treeSet.add("Cherry");
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        treeSet.remove("Banana");
        System.out.println(treeSet);
    }
}
