package question.chap1;

/**
 *
 * @author hkhoi
 */
public class Q1_8 {

    public boolean isRotation(String arg0, String arg1) {
        if (arg0.length() != arg1.length()) {
            return false;
        }

        arg0 = arg0 + arg0;
        return (arg0.contains(arg1));
    }
}
