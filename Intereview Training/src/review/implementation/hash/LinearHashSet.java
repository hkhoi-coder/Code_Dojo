package review.implementation.hash;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class LinearHashSet implements MyHashSet {

    private final int arraySize;
    private final Integer[] array;
    private int size;

    public LinearHashSet(int arraySize) {
        this.arraySize = arraySize;
        this.array = new Integer[arraySize];
        this.size = 0;
    }
    
    @Override
    public boolean put(int key) {
        
        if (size >= arraySize) {
            return false;
        }
        
        int index = hash(key);

        for (int i = 0; i < arraySize; ++i) {
            int curIndex = index + i;
            curIndex %= arraySize;

            if (array[curIndex] == null) {
                array[curIndex] = key;
                size += 1;
                break;
            } else if (array[curIndex] == key) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(int key) {
        int index = hash(key);
        for (int i = 0; i < arraySize; ++i) {
            int curIndex = index + i;
            curIndex %= arraySize;
            
            if (array[curIndex] != null && array[curIndex] == key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(int key) {
        int index = hash(key);
        for (int i = 0; i < arraySize; ++i) {
            int curIndex = index + i;
            curIndex %= arraySize;
            if (array[curIndex] == key) {
                array[curIndex] = null;
                size -= 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return "LinearHashSet{" + "array=" + Arrays.toString(array) + '}';
    }
    
    private int hash(int key) {
        return key % arraySize;
    }
}
