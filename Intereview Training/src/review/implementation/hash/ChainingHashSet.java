package review.implementation.hash;

import java.util.LinkedList;

/**
 *
 * @author hkhoi
 */
public class ChainingHashSet implements MyHashSet {

    private final LinkedList<Integer>[] arrayLinkedList;
    private int size;
    private final int arraySize;

    public ChainingHashSet(int arraySize) {
        this.arraySize = arraySize;
        size = 0;
        arrayLinkedList = new LinkedList[arraySize];
        
        for (int i = 0; i < arrayLinkedList.length; ++i) {
            arrayLinkedList[i] = new LinkedList<>();
        }
    }
    
    @Override
    public boolean put(int key) {
        int index = hash(key);
        LinkedList<Integer> curLinkedList = arrayLinkedList[index];

        for (int it : curLinkedList) {
            if (it == key) {
                return false;
            }
        }

        curLinkedList.add(key);
        size += 1;

        return true;
    }

    @Override
    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> curLinkedList = arrayLinkedList[index];
        return curLinkedList.contains(key);
    }

    @Override
    public int size() {
        return size;
    }

    private int hash(int key) {
        return key % arraySize;
    }

    @Override
    public boolean remove(int key) {
        int index = hash(key);
        LinkedList<Integer> curLinkedList = arrayLinkedList[index];
        for (Integer it : curLinkedList) {
            if (it.equals(key)) {
                curLinkedList.remove(it);
                size -= 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ChainingHashMap{" + "arrayLinkedList=" + arrayLinkedList + '}';
    }
}
