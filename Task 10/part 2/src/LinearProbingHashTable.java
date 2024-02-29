class LinearProbingHashTable {
private int[] keys;
private String[] values;
private int capacity;
private int size;

public LinearProbingHashTable(int capacity) {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new String[capacity];
        size = 0;
        }

private int hash(int key) {
        return key % capacity;
        }

public void put(int key, String value) {
        if (size == capacity) {
        throw new IllegalStateException("HashTable is full");
        }
        int index = hash(key);
        while (keys[index] != 0 && keys[index] != key) {
        index = (index + 1) % capacity;
        }
        if (keys[index] == key) {
        values[index] = value;
        } else {
        keys[index] = key;
        values[index] = value;
        size++;
        }
        }

public String get(int key) {
        int index = hash(key);
        while (keys[index] != 0) {
        if (keys[index] == key) {
        return values[index];
        }
        index = (index + 1) % capacity;
        }
        return null;
        }

public void remove(int key) {
        int index = hash(key);
        while (keys[index] != 0) {
        if (keys[index] == key) {
        keys[index] = 0;
        values[index] = null;
        size--;
        return;
        }
        index = (index + 1) % capacity;
        }
        }

public int size() {
        return size;
        }
        }

