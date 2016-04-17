package ctci.chap9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hkhoi
 */
public class Q9_6 {
    
    public List<String> paraPerm(int n) {
        List<String> result = new ArrayList<>();
        
        perm(n, n, "", result);
        
        return result;
    }

    private void perm(int open, int close, String buffer, List<String> result) {
        
        if (open < 0 || close < open) {
            return;
        }
        
        if (open == 0 && close == 0) {
            result.add(buffer);
        }
        
        perm(open - 1, close, buffer + "(", result);
        perm(open, close - 1, buffer + ")", result);
    }   // This shit costs O(2^n)
}
