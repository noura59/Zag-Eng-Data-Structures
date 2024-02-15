import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        int M = scanner.nextInt();


        int[] freq = new int[M + 1];


        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            freq[num]++;
        }


        for (int i = 1; i <= M; i++) {
            System.out.println(freq[i]);
        }
    }
}

