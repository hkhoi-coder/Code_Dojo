package implementation.sort;

/**
 *
 * @author hkhoi
 */
public class BubbleSort {
    
    private int steps = 0;
    
    public void execute(int[] array) {
        for (int i = array.length - 2; i >=0; --i) {
            for (int j = 0; j <= i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                ++steps;
            }
        }
        
        System.out.println("Steps = " + steps);
    }
}
