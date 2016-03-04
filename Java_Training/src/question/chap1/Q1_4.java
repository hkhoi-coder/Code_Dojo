package question.chap1;

/**
 *
 * @author hkhoi
 */
public class Q1_4 {
    public void replaceSpace(char[] str, int len) {  // String with expanded space
        // Count the number of spaces
        int numSpaces = 0;
        for (int i = 0; i < len; ++i) {
        	char currentChar = str[i];
        	if (currentChar == ' ') {
        		++numSpaces;
        	}
        }

        int lastNewIndex = len + 2 * numSpaces - 1;
        int lastOldIndex = len - 1;

        for (int i = lastOldIndex; i >= 0; --i) {
        	char currentChar = str[i];
        	if (currentChar != ' ') {
        		str[lastNewIndex--] = currentChar;
        	} else {
        		str[lastNewIndex--] = '0';
        		str[lastNewIndex--] = '2';
        		str[lastNewIndex--] = '%';
        	}
        }
    }
}   // Time: O(n), Space: O(n)
