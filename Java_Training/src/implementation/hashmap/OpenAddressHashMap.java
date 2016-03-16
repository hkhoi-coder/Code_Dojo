package implementation.hashmap;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class OpenAddressHashMap {
    
    private Entry[] entries;
    private int used = 0;
    private static final int SIZE = 10;
    
    public OpenAddressHashMap() {
        entries = new Entry[SIZE];
    }
    
    public void put(int key, int value) throws Exception {
        ++used;
        if (used <= SIZE) {
            int pos = HashFunction(key);
            for (int i = pos; i < pos + SIZE; ++i) {
                Entry cur = entries[i % SIZE];
                if (cur == null) {
                    entries[i % SIZE] = new Entry(key, value);
                    return;
                } else if (cur.key == key) {
                    entries[i % SIZE].value = value;
                    return;
                }
            }
        } else {
            throw new Exception("Out of capacity");
        }
    }
    
    public void remove(int key) {
        int pos = HashFunction(key);
        for (int i = pos; i < pos + SIZE; ++i) {
            Entry cur = entries[i % SIZE];
            if (cur == null) {
                return;
            } else if (cur.key == key) {
                entries[i % SIZE] = null;
                return;
            }
        }
    }
    
    public int get(int key) {
        int pos = HashFunction(key);
        int result = Integer.MIN_VALUE;
        for (int i = pos; i < pos + SIZE; ++i) {
            Entry cur = entries[i % SIZE];
            if (cur == null) {
                break;
            } else if (cur.key == key) {
                result = cur.value;
                break;
            }
        }
        return result;
    }
    
    private int HashFunction(int key) {
        return (key % SIZE);
    }
    
    @Override
    public String toString() {
        return "OpenAddressHashMap{" + "entries=" + Arrays.toString(entries) + '}';
    }
    
    private class Entry {
        
        private int key;
        private int value;
        
        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
        
        @Override
        public String toString() {
            return "Entry{" + "key=" + key + ", value=" + value + '}';
        }
    }
}
