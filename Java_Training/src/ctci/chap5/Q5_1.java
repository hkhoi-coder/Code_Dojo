package ctci.chap5;

import implementation.bit.IntBit;

/**
 *
 * @author hkhoi
 */
public class Q5_1 {
    public int insertBit(int num0, int num1, int start, int end) {
        IntBit intBit = new IntBit();
        int mask = intBit.trimLeft(num1, (end - start + 1));
        mask <<= start;
        return num0 | mask;
    }
}
