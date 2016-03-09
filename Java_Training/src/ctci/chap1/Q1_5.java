package ctci.chap1;

/**
 *
 * @author hkhoi
 */
public class Q1_5 {

    public String compress(String str) {
        char previous = 0;
        int counter = 0;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); ++i) {
            char current = str.charAt(i);
            if (current == previous) {
                ++counter;
            } else {
                if (previous != 0) {
                    builder.append(counter).append(previous);
                }
                previous = current;
                counter = 1;
            }
        }
        if (previous != 0) {
            builder.append(counter).append(previous);
        }
        return str.length() < builder.length() ? str : builder.toString();
    }
}
