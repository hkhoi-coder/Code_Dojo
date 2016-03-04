package question.chap2;

import implementation.LinkedList;

/**
 *
 * @author hkhoi
 */
public class Q2_7 extends LinkedList {
    public boolean isPalindrome() {
        String str = linkedListToString(this);
        return isStringPalindrome(str);
    }

    private String linkedListToString(LinkedList aThis) {
        StringBuilder builder = new StringBuilder();
        for (int it : aThis) {
            builder.append(it);
        }
        return builder.toString();
    }

    private boolean isStringPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
