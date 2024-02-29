import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 3, 4,2,2,5,2};
        int mostRepeatedElement = findMostRepeatedElement(input);
        System.out.println("Most repeated element: " + mostRepeatedElement);
    }

    public static int findMostRepeatedElement(int[] arr) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        int maxFrequency = 0;
        int mostRepeatedElement = 0;
        for (int num : arr) {
            int frequency = frequencyMap.get(num);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostRepeatedElement = num;
            }
        }

        return mostRepeatedElement;
    }
}
