package ctci.chap9;

/**
 *
 * @author hkhoi
 */
public class Q9_1 {

    public int waysToStep(int step) {
        int[] ways = new int[step + 1];

        ways[0] = 1;
        for (int i = 1; i <= 3; ++i) {
            for (int j = i; j < ways.length; ++j) {
                ways[j] += ways[j - i];
            }
        }

        return ways[step];
    }
}
