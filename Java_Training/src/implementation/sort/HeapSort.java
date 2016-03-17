package implementation.sort;

/**
 *
 * @author hkhoi
 */
public class HeapSort {

    public void sort(int[] array) {
        int startAt = (array.length - 2) / 2;
        int size = array.length;
        for (int i = startAt; i >= 0; --i) {
            heapify(array, i, size);
        }
        while (size != 0) {
            extractHeap(array, size);
            size -= 1;
        }
    }

    private void heapify(int[] array, int parentIndex, int size) {
        int pos = parentIndex;
        while (pos >= 0) {
            pos = unitHeapify(array, pos, size);
        }
    }

    private int unitHeapify(int[] array, int pos, int size) {
        int leftChildIndex = pos * 2 + 1;
        if (leftChildIndex >= size) {
            return -1;
        }
        int rightChildIndex = leftChildIndex + 1;
        int leftChildValue = array[leftChildIndex];
        int rightChildValue = Integer.MIN_VALUE;
        if (rightChildIndex < size) {
            rightChildValue = array[rightChildIndex];
        }

        int max = Math.max(leftChildValue, rightChildValue);
        if (array[pos] < max) {
            if (leftChildValue > rightChildValue) {
                swap(array, leftChildIndex, pos);
                return leftChildIndex;
            } else {
                swap(array, rightChildIndex, pos);
                return rightChildIndex;
            }
        }
        return -1;
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private void extractHeap(int[] array, int size) {
        swap(array, 0, size - 1);
        heapify(array, 0, size - 1);
    }
}
