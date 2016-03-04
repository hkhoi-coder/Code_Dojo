package implementation.sort;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class MergeSort {
    private int steps = 0;

    public void run(int[] array) {
        ++steps;
        if (array.length <= 1) {
            return;
        }
        
        int mid = array.length / 2;
        
        int[] sub1 = Arrays.copyOfRange(array, 0, mid);
        int[] sub2 = Arrays.copyOfRange(array, mid, array.length);
        
        run(sub1);
        run(sub2);
        merge(array, sub1, sub2);
    }
    
    public void execute(int[] array) {
        run(array);
        System.out.println("Steps = " + steps);
    }
    
    private void merge(int[] master, int[] sub1, int[] sub2) {
        int i1 = 0, i2 = 0;
        for (int i = 0; i < master.length; ++i) {
            if (i1 >= sub1.length) {
                master[i] = sub2[i2++];
            } else if (i2 >= sub2.length) {
                master[i] = sub1[i1++];
            } else {
                if (sub1[i1] < sub2[i2]) {
                    master[i] = sub1[i1++];
                } else {
                    master[i] = sub2[i2++];
                }
            }
        }
    }
}
