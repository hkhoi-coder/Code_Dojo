package implementation.sort;

/**
 *
 * @author hkhoi
 */
public class SelectionSort {

    private int steps = 0;
    
    public void execute(int[] data) {
        for (int i = 0; i < data.length; ++i) {
            int index = i;
            int min = data[i];
            
            for (int j = i; j < data.length; ++j) {
                if (data[j] < min) {
                    min = data[j];
                    index = j;
                }
                ++steps;
            }
            
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
            
            
        }
        
        System.out.println("Steps = " + steps);
    }
}
