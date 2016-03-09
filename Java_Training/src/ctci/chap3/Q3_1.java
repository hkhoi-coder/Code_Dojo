package ctci.chap3;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class Q3_1 {

    private final int[] pointers;
    private final int[] upperBound;
    private final int[] lowerBound;
    private final int[] data;
    private final int[] size;

    private final int div;
    private final int capacity;

    public Q3_1(int capacity, int div) {
        this.capacity = capacity;
        this.div = div;

        pointers = new int[div];
        for (int i = 0; i < div; ++i) {
            pointers[i] = i * capacity / div - 1;
        }

        upperBound = new int[div];
        for (int i = 0; i < div - 1; ++i) {
            upperBound[i] = (i + 1) * (capacity / div);
        }
        upperBound[div - 1] = capacity;

        lowerBound = new int[div];
        for (int i = 0; i < div; ++i) {
            lowerBound[i] = pointers[i] + 1;
        }

        data = new int[capacity];
        size = new int[div];
    }

    public boolean push(int value, int stackNum) {
        if (pointers[stackNum] + 1 < upperBound[stackNum]) {
            data[++pointers[stackNum]] = value;
            ++size[stackNum];
            return true;
        }
        
        return false;
    }

    public int pop(int stackNum) {
        if (pointers[stackNum] >= lowerBound[stackNum]) {
            --size[stackNum];
            return data[pointers[stackNum]--];
        }
        return Integer.MIN_VALUE;
    }

    public boolean isEmpty(int stackNum) {
        return size[stackNum] == 0;
    }

    public String printStack(int stackNum) {
        StringBuilder builder = new StringBuilder();

        int root = stackNum * (capacity / div);
        for (int i = 0; i < size[stackNum]; ++i) {
            builder.append(data[root + i]).append(' ');
        }

        return builder.toString();
    }

    public String print() {
        return Arrays.toString(data);
    }

    @Override
    public String toString() {
        return "Q3_1{" + "pointers=" + Arrays.toString(pointers) + "\nupperBound=" + Arrays.toString(upperBound) + "\nlowerBound=" + Arrays.toString(lowerBound) + "\ndata=" + Arrays.toString(data) + "\nsize=" + Arrays.toString(size) + "\ndiv=" + div + ", capacity=" + capacity + '}';
    }
    
    
}
