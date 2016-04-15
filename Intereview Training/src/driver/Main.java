package driver;

import review.implementation.hash.LinearHashSet;


/**
 *
 * @author hkhoi
 */
public class Main {

    public static void main(String[] args) {
        LinearHashSet linear = new LinearHashSet(10);
        for (int i = 0 ; i < 15; ++i) {
            System.out.println(i + " " + linear.put(i));
        }
        
        System.out.println(linear);
    }
}
