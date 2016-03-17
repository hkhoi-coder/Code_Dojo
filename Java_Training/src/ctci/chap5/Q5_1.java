package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_1 {
    public int insertBit(int n, int m, int start, int stop) {
        for (int i = start; i <= stop; ++i) {
            int mLastBit = m % 2;
            if (mLastBit == 1) {
                int mask = 1 << i;
                n |= mask;
            } else {
                int mask = ~(1 << i);
                n &= mask;
            }
            m >>= 1;
        }
        return n;
    }
}
