public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        System.out.println("the size of the list is :" + list.size());
        System.out.println("the max value of the list is :" + list.max());
        System.out.println("the min value of the list is :" + list.min());

        list.printElements();

    }
}