package implementation.sort;

/**
 *
 * @author hkhoi
 */
public class QuickSort {

    private int steps = 0;
    
    public void execute(int[] array) {
        partition(array, 0, array.length - 1);
        System.out.println("Counter = " + steps);
    }

    private void partition(int[] array, int left, int right) {
        ++steps;
        
        if (left >= right) {
            return;
        }
        
        int pivot = array[(left + right) / 2];
        
        int iLeft = left, iRight = right;
        while (iLeft < iRight && array[iLeft] != array[iRight]) {
            while (array[iLeft] < pivot) {
                ++iLeft;
            }
            while (array[iRight] > pivot) {
                --iRight;
            }   
            if (iLeft < iRight) {
                int temp = array[iLeft];
                array[iLeft] = array[iRight];
                array[iRight] = temp;
            }
        }
        
        partition(array, left, iLeft);
        partition(array, iLeft + 1, right);
    }
}
