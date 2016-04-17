package ctci.chap9;

/**
 *
 * @author hkhoi
 */
public class Q9_2 {
    
    public int waysToMove(int x, int y) {
        int[][] ways = new int[y][x];
        
        for (int i = 0; i < y; ++i) {
            for (int j = 0; j < x; ++j) {
                if (i == 0 || j == 0) {
                    ways[i][j] = 1;
                } else {
                    ways[i][j] = ways[i][j - 1] + ways[i - 1][j];
                }
            }
        }
        
        return ways[y - 1][x - 1];
    }
}
