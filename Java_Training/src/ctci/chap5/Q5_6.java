package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_6 {
    public int bitSwap(int num) {        
        int result = 0;
        int count = 0;
        
        while (num != 0) {
            int mask = num % 2;
            num >>= 1;
            mask = mask * 2 + num % 2;
            num >>= 1;
            mask <<= count;
            count += 2;
            result |= mask;
        }
        
        return result;
    }
}
