package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_6 {
    public int bitSwap(int num) {
        int result = 0;
        int pos = 0;
        while (num != 0) {
            int lastBit0 = num % 2;
            num >>= 1;
            int lastBit1 = num % 2;
            num >>= 1;
            
            int mask = lastBit0 * 2 + lastBit1;
            mask <<= pos;
            pos += 2;
            result |= mask;
        }
        
        return result;
    }
}
