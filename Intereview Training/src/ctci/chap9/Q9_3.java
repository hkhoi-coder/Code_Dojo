package ctci.chap9;

/**
 *
 * @author hkhoi
 */
public class Q9_3 {

    public int magicIndex(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i < array[i]) {
                break;
            } else if (i == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
