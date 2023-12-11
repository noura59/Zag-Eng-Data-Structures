import java.util.Stack;

public class Expression {
    public static boolean isValid(String expression){
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<expression.length();i++){
            char ch =expression.charAt(i);
            if (isOpenBracket(ch))
                stack.push(ch);
            else if (isCloseBracket(ch)) {
                char left = stack.pop();
                if(!isMatch(left,ch))
                    return false;

            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatch(char left, char right) {
        return left=='('&&right==')' ||
                left=='['&&right==']' ||
                left=='{'&&right=='}' ||
                left=='<'&&right=='>' ;
    }

    private static boolean isCloseBracket(char ch) {
        return (ch ==')' || ch== ']' || ch== '}' || ch== '>' );
    }

    private static boolean isOpenBracket(char ch) {
        return (ch =='(' || ch== '[' || ch== '{' || ch== '<' );

    }
}
