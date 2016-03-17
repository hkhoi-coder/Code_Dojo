package implementation.sort;

/**
 *
 * @author hkhoi
 */
public class InsertionSort {
    private int steps = 0;
    
    public void execute(int[] args) {
        for (int i = 1; i < args.length; ++i) {
            int j = i - 1;
            int cur = args[i];
            while (j >= 0 && args[j] > cur) {
                args[j + 1] = args[j];
                j -= 1;
                ++steps;
            }
            
            args[j + 1] = cur;
        }
        System.out.println("Steps = " + steps);
    }
}
