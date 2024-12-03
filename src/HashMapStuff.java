import java.util.HashMap;

public class HashMapStuff {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "apple");
        map.put("two", "orange");
        map.put("three", "pear");
        map.put("four", "apple");
        map.put("five", "apple");
        System.out.println(map);
        map.remove("four");
        System.out.println(map);
        map.remove("six");
        System.out.println(map);

    }
}
