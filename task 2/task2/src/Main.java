public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = General.reverseInteger(number);
        System.out.println("Reversed number" + reversedNumber);


        int value = 200;
        int randomValue = General.getRandom(value);
        System.out.println("randomValue" + randomValue);

        int min = 1;
        int max = 100;
        int random = General.getRandom(min , max );
        System.out.println("random" + random);


        char randomLetter = General.randomCharacter();
        System.out.println("randomLetter" + randomLetter);



        Integer[] integerArray = {1,2,3,4};
        System.out.print("IntegerArray:" );

        General.Array(integerArray);
        



    }
}