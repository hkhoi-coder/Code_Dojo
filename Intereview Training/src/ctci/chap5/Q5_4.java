package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_4 {
    public boolean isPowerOfTwo(int a) {
        return (a & (a - 1)) == 0;
    }
}
