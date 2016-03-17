package driver;

import implementation.sort.HeapSort;
import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {17,34,691,73,264,916,29,83,7,46,1};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
