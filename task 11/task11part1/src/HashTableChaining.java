import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTableChaining<K,V> {
    private class Node {
        private K key;
        private V value;


        public Node(K key,V value) {
            this.value = value;
            this.key = key;
        }


    }
    private LinkedList<Node> [] table;

    public HashTableChaining(int  value) {
        table=(LinkedList<Node>[]) new LinkedList[value];


    }
    private int hash(K key){

        return key.hashCode() % table.length;
    }
    public void put(K key,V value){
        Node node=new Node(key , value);
        int index =hash(key);
        if (table[index]==null)
            table[index]=new LinkedList<>();

        for(Node e: table[index])
            if(e.key==key){
                e.value = value;
                return;
            }

        table[index].add(node);

    }
    public V get(K key){
        int index =hash(key);
        if(table[index]==null)
            return null;
        else {
            for (Node e:table[index]){
                if(e.key == key)
                    return e.value;
            }
        }
        return null;
    }
    public void remove(K key){
        int index=hash(key);
        if(table[index]==null)
            throw new NoSuchElementException("this key not exit");
        else {
            for (Node e:table[index]){
                if(e.key == key) {

                    table[index].remove(e);

                    return;
                }

            }

        }
        throw new NoSuchElementException("this key not exit");
    }
    public int size() {
        int count = 0;
        for (LinkedList<Node> list : table) {
            if (list != null)
                count += list.size();
        }
        return count;
    }


}