package question.chap1;

/**
 *
 * @author hkhoi
 */
public class Q1_1 {

    public boolean isUnique(String str) {
        if (str.length() > 26) {
            return false;	// Pigeon-hole rule.
        }

        boolean[] existed = new boolean[26];
        for (int i = 0; i < str.length(); ++i) {
            int cur = str.charAt(i) - 'a';
            if (existed[cur]) {
                return false;
            } else {
                existed[cur] = true;
            }
        }
        return true;
    }	// Time: O(n)

    public boolean isUnique2(String str) {
        if (str.length() > 26) {
            return false;
        }

        int visited = 0;	// Treat this as an array of bit - length = 32;

        for (int i = 0; i < str.length(); ++i) {
            int pos = str.charAt(i) - 'a';
            if (isOn(visited, pos)) {
                return false;
            } else {
                visited = setOn(visited, pos);
            }
        }

        return true;
    }

    public boolean isOn(int visited, int pos) {
        return (visited & (1 << pos)) != 0;
    }

    public int setOn(int visited, int pos) {
        return (visited | (1 << pos));
    }   // Time: O(n), Space O(1)
}
