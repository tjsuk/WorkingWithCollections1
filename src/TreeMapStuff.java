import java.util.TreeMap;

public class TreeMapStuff {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(6,"f");
        tm.put(1,"a");
        tm.put(2,"b");
        tm.put(4,"d");
        tm.put(5,"e");
        tm.put(3,"c");
        tm.put(3,"d");
        System.out.println(tm);
        System.out.println(tm.containsKey(1));
        System.out.println(tm.containsValue("b"));
        tm.remove(3);
        System.out.println(tm);

    }
}
