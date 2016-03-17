package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_5 {
    public int bitConversion(int data, int target) {
        int count = 0;
        
        int max = Math.max(data, target);
        
        while (max != 0) {
            boolean lastBitData = data % 2 == 0;
            boolean lastBitTarget = target % 2 == 0;
            
            if (lastBitData != lastBitTarget) {
                ++count;
            }
            
            target >>= 1;
            data >>= 1;
            max >>= 1;
        }
        
        return count;
    }
}
