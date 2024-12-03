import java.util.HashSet;
import java.util.Set;

public class HashSetStuff {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println(set);
        set.add("Pineapple");
        set.add("Cherry");
        System.out.println(set);
        set.add("Satsuma");
        System.out.println(set);
        set.remove("Banana");
        System.out.println(set);
        System.out.println(set.contains("Cherry"));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

    }
}
