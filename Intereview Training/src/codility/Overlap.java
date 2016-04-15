package codility;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class Overlap {
    
    public int overlap(int left0, int right0, int left1, int right1) {
        if (right0 < left1 || right1 < left0) {
            return 0;
        }
        
        int[] array = {left0, right0, left1, right1};
        Arrays.sort(array);
    
        return Math.abs(array[1] - array[2]);
    }
}
