package question.chap1;

import java.util.Arrays;

/**
 *
 * @author hkhoi
 */
public class Q1_3 {

    public boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] existed = new int[26];
        for (int i = 0; i < str1.length(); ++i) {
            int pos = str1.charAt(i) - 'a';
            ++existed[pos];
        }

        for (int i = 0; i < str2.length(); ++i) {
            int pos = str2.charAt(i) - 'a';
            --existed[pos];
            if (existed[pos] < 0) {
                return false;
            }
        }

        for (int i : existed) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }	// Time: O(n), Space: O(1)

    public boolean isPermutation2(String str1, String str2) {
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        
        return Arrays.equals(str1CharArray, str2CharArray);
    }	// Time O(nlogn), Space O(n)
}
