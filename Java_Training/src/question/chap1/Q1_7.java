package question.chap1;

import java.util.ArrayList;

/**
 *
 * @author hkhoi
 */
public class Q1_7 {

    public void setZero(int[][] matrix) {
        ArrayList<Integer> cols = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
                // For each cell on that row
            }
            // For each row of the matrix
        }
        
        // Fill rows with zeros
        for (int it : rows) {
            for (int i = 0; i < matrix[0].length; ++i) {
                matrix[it][i] = 0;
            }
        }
        
        for (int it : cols) {
            for (int i = 0; i < matrix.length; ++i) {
                matrix[i][it] = 0;
            }
        }
    }
}
