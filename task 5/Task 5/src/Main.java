public class Main {
    public static void main(String[] args) {

        GenericLinkedList<Double> list=new GenericLinkedList<>();
        list.addFirst(10.5);
        list.addFirst(12.5);
        list.addFirst(13.5);
        list.printElements();

    }
}