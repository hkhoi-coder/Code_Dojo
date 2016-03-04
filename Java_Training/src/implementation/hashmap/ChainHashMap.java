package implementation.hashmap;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author hkhoi
 */
public class ChainHashMap {
    
    private static final int SIZE = 10;
    private LinkedList<Entry>[] data;
    
    public ChainHashMap() {
        data = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; ++i) {
            data[i] = new LinkedList();
        }
    }
    
    public void put(int key, int value) {
        int index = HashFunction(key);
        LinkedList<Entry> current = data[index];
        
        for (Entry it : current) {
            if (it.key == key) {
                it.value = value;
                return;
            }
        }
        
        current.add(new Entry(key, value));
    }
    
    public void remove(int key) {
        int index = HashFunction(key);
        LinkedList<Entry> current = data[index];
        
        int tempIndex = 0;
        int removeIndex = -1;
        
        for (Entry it : current) {
            if (it.key == key) {
                removeIndex = tempIndex;
                break;
            }
            ++tempIndex;
        }
        
        if (removeIndex != -1) {
            current.remove(removeIndex);
        }
    }
    
    public int get(int key) {
        int index = HashFunction(key);
        LinkedList<Entry>    current = data[index];
        for (Entry it : current) {
            if (it.key == key) {
                return it.value;
            }
        }
        
        return Integer.MIN_VALUE;
    }
    
    private int HashFunction(int key) {
        return (key) % SIZE;
    }
    
    private class Entry {
        private int key;
        private int value;
        
        public Entry(int key, int value) {
            this.key= key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" + "key=" + key + ", value=" + value + '}';
        }
    }

    @Override
    public String toString() {
        return "ChainHashMap{" + "data=" + Arrays.toString(data) + '}';
    }
}
