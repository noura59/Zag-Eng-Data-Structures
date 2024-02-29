public class Main {
    public static void main(String[] args) {

                HashTableChaining hashTable = new HashTableChaining(10);


                hashTable.put(1, "Value1");
                hashTable.put(2, "Value2");
                hashTable.put(11, "Value3");
                hashTable.put(21, "Value4");


                System.out.println("Value for key 2: " + hashTable.get(2));
                System.out.println("Value for key 11: " + hashTable.get(11));


                hashTable.remove(2);
                System.out.println("Value for key 2 after removal: " + hashTable.get(2));


                System.out.println("Size of the hash table: " + hashTable.size());
            }
        }



