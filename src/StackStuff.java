import java.util.Stack;

public class StackStuff {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(4);
        System.out.println("Stack after pushes: " + stack);
        System.out.println(stack.pop());
        System.out.println("Stack after pushes: " + stack);
        System.out.println(stack.get(2));
    }
}
