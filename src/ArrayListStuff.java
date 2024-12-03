import java.util.ArrayList;

public class ArrayListStuff {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        System.out.println(al.get(2));
        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
