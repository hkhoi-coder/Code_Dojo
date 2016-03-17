package ctci.chap5;

/**
 *
 * @author hkhoi
 */
public class Q5_2 {

    public String convertRealToBin(double num) {
        StringBuilder builder = new StringBuilder("0.");

        while (num != 0.0) {
            num *= 2;
            int get = (int) num;
            builder.append(get);
            if (builder.length() > 32) {
                return "ERROR";
            }
            num -= get;
        }

        return builder.toString();
    }
}
