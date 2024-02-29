import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();


        HashMap<Character, Integer> frequencyMap = new HashMap<>();


        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);

            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }


        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + ":" + frequencyMap.get(ch));
        }
    }
}
