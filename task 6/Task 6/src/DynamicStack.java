import java.util.NoSuchElementException;

public class DynamicStack {
    int[] array;
    int size = 0;
    int count = 0;

    public DynamicStack(int size) {
        this.size = size;
        array = new int[size];

    }

    public DynamicStack() {
        size = 100;
        array = new int[size];

    }

    public void push(int value) {
        if (size == count)
            createNewArray();
        array[count] = value;
        count++;
    }

    private void createNewArray() {
        size *= 2;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++)
            newArray[i] = array[i];
        array = newArray;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException();

        return array[count - 1];
    }

    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException();

        count--;
        return array[count];
    }
}