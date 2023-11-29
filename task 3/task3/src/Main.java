public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(2);

        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.printArray();


        array.removeAt(1);
        array.printArray();

        int index = array.indexOf(3);
        System.out.println("Index of 3:" + index);

        int item = array.at(2);
        System.out.println("Item at index 2:" + item);

        int max = array.maxElement();
        System.out.println("max element:" + max);

        int min = array.minElement();
        System.out.println("min element:" + min);

        array.remove(3);
        array.printArray();
    }
}