import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        public Node (int v) {
            value = v;
        }
        int value ;
        Node nextNode;
    }
    private Node first;
    private Node last;
    private int size =0 ;
    public void addFirst(int item){
        Node node = new Node (item);
        if (isEmpty())
            first = last = node ;
        else {
            node.nextNode = first;
            first = node ;
        }
        size++ ;
    }
    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first = last = node ;
        else{
            last.nextNode = node ;
            last = node ;
        }
        size++ ;
    }
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("empty list") ;
        if (first ==last) {
            first = last = null;
        } else {
            Node temp = first ;
            first = first.nextNode;
            temp.nextNode = null;
        }
        size--;
    }
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("empty list") ;
        if (first ==last) {
            first = last = null;
        } else {
            Node beforeLast = getBeforeLast () ;
            last = beforeLast;
            last.nextNode = null;
        }
        size--;

    }
    private boolean isEmpty() {
        return first == null;
    }
    private Node getBeforeLast() {
        Node beforeLast = first ;
        Node current = first ;
        while (current.nextNode !=null){
            beforeLast = current ;
            current = current.nextNode;
        }
        return beforeLast;
    }
    public int indexOf(int item) {
        Node current = first ;
        int index =0;
        while (current != null) {
            if (current.value == item)
                return index ;
            index++;
            current = current.nextNode ;
        }
        return -1 ;
    }
    public boolean contains (int value) {
        int index = indexOf(value) ;
        return index != -1 ;

    }
    public int size() {
        return size;
    }
    public void printElements(){
        Node current = first ;
        while (current != null){
            System.out.println(current.value + "");
            current = current.nextNode ;
        }
        System.out.println() ;
    }
    public int max(){
        if (first == null){
            throw new RuntimeException("empty list");
        }
        int max = first.value;
        Node current = first.nextNode;
        while (current != null){
            if (current.value > max){
                max = current.value;
            }
            current = current.nextNode;
        }
        return max ;
    }
    public int min(){
        if (first == null){
            throw new RuntimeException("empty list");
        }
        int min = first.value;
        Node current = first.nextNode;
        while (current != null){
            if (current.value < min){
                min = current.value;
            }
            current = current.nextNode;
        }
        return min ;
    }
}
