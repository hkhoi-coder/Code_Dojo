package review.question;

/**
 *
 * @author hkhoi
 */
public class R_1_5 {
    
    public String compress(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        if (string == null || string.isEmpty()) {
            return "";
        }
        
        char pre = string.charAt(0);
        int counter = 1;
        
        for (int i = 1; i < string.length(); ++i) {
            char cur = string.charAt(i);
            if (cur == pre) {
                ++counter;
            } else {
                stringBuilder
                        .append(counter)
                        .append(pre);
                counter = 1;
                pre = cur;
            }
        }
        
        stringBuilder
                .append(counter)
                .append(pre);
        
        return stringBuilder.toString();
    }
}
