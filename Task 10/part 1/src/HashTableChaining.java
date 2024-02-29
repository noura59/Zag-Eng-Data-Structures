import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTableChaining {
    private class Node {
        private int key;
        private String value;


        public Node(int key,String value) {
            this.value = value;
            this.key = key;
        }


    }
    private LinkedList<Node> [] table;

    public HashTableChaining(int value) {
        table=new LinkedList[value];


    }
    private int hash(int key){
        return key % table.length;
    }
    public void put(int key,String value){
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
    public String get(int key){
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
    public void remove(int key){
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
