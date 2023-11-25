import java.util.Random;

public class General {
    public static int reverseInteger(int number){
        int reversedNumber = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber ;
    }
    public static int getRandom(int value ){
        return (int)(Math.random() * value);
    }
    public static int getRandom(int min , int max){
        return (int)(min + ((max - min) * Math.random()));
    }


    private static final char[] CHARACTER_POOL = {'N' };
    public static char randomCharacter(){
        Random random = new Random();
        int randomIndex =  random.nextInt(CHARACTER_POOL.length);
        return CHARACTER_POOL[randomIndex];
    }


    public static <T> void Array(T[] array){
        for (T element : array){
            System.out.println();

        }
    }

}
