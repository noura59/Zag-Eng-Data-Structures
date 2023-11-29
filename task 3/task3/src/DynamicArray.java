public class DynamicArray {

    int []  array;
    int size =0;
     int lastItem =0;
    public DynamicArray(int n){
        array = new int [n];
        size = n;

    }
    public DynamicArray(){
        array = new int [50];
        size = 50;

    }
    public void insert (int element){
        if (lastItem ==size){
            size *=2;
            int [] newArray = new int [size];
            copyArray(array, newArray);
            array = newArray ;
        }
        array[lastItem] = element;
        lastItem++;
    }
    private void copyArray(int[] array, int[] newArray){
        for (int i =0;i < lastItem; i++)
            newArray[i] = array[i];
        lastItem--;

    }
    public void printArray(){
        for (int i=0;i<size;i++){
            System.out.print(array[i] + " ");
            System.out.println();
        }
    }
    public void removeAt(int index){
        if (index<0 || index >=size){
            throw new IllegalStateException("not valid index");
        }
        for (int i = index; i< size -1 ; i++){
            array[i] = array[i+1];

        }

    }
    public int indexOf(int item){
        for (int i =0;i< size;i++){
            if (item == array[i])
                return i;


        }
        return -1;
    }
    public int at(int index){
        if (index <0 || index >=size){
            throw new IllegalStateException("not valid index");
        }
        return array[index];

        }
        public int maxElement(){
        int max = array[0];
        for (int i=1; i<size ;i++){
            if (array[i]> max ){
                max = array[i];
            }
        }
        return max ;
    }
    public int minElement(){
        int min = array[0];
        for (int i=1; i<size ;i++){
            if (array[i]< min){
                min = array[i];
            }
        }
        return min ;
    }
    public void remove(int item){
        int index = indexOf(item) ;
        if (index !=-1){
            removeAt(index);
        }
    }

}
