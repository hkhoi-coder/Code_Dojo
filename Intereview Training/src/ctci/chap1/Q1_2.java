package ctci.chap1;

/**
 *
 * @author hkhoi
 */
public class Q1_2 {
    
    public void reverseString(char[] str) {
        int i = 0;
        int j = str.length - 1;
        
        char temp;
        while (i < j) {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            
            ++i;
            --j;
        }
    }
}
