import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        LinkedListStack item = new LinkedListStack();
        item.puch(1);
        item.puch(2);
        item.puch(3);
        System.out.println(item.pop());
        System.out.println(item.pop());
        System.out.println(item.peek());

        System.out.println(reverse("abcdef"));


        System.out.println(Expression.isValid("(("));
        System.out.println(Expression.isValid("(([]))"));


    }
    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        String reverse = "";

        for (int i=0 ;i<s.length(); i++)
            stack.push(s.charAt(i));

        while (!stack.isEmpty()){
            reverse += stack.pop();
        }
        return reverse ;
    }
}