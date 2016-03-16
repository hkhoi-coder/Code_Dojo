package misc;

/**
 *
 * @author hkhoi
 */
public class MED implements Runnable {
    
    private final String str1;
    private final String str2;

    public MED(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
    
    @Override
    public void run() {
        int[][] result = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length() + 1; ++i) {
            for (int j = 0; j < str2.length() + 1; ++j) {
                if (i == 0) {
                    result[i][j] = j;
                } else if (j == 0) {
                    result[i][j] = i;
                } else {
                    int choice1 = result[i - 1][j] + 1;
                    int choice2 = result[i][j - 1] + 1;
                    int choice3 = result[i - 1][j - 1];
                    if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
                        choice3 += 2;
                    }
                    
                    result[i][j] = Math.min(choice1, Math.min(choice2, choice3));
                }
            }
        }
        
        // For testing
        for (int i = 0; i < str1.length() + 1; ++i) {
            for (int j = 0; j < str2.length() + 1; ++j) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
