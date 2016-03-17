package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_5 {
    public int bitConversion(int a, int b) {
        int max = Math.max(a, b);
        int count = 0;
        
        while (max > 0) {
            if (a % 2 != b % 2) {
                ++count;
            }
            a >>= 1;
            b >>= 1;
            max >>= 1;
        }
        
        return count;
    }
}
