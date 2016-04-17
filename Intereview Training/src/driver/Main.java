package driver;

import ctci.chap9.Q9_6;
import java.util.List;

/**
 *
 * @author hkhoi
 */
public class Main {

    public static void main(String[] args) {
        Q9_6 solve = new Q9_6();
        List<String> result = solve.paraPerm(4);
        
        for (String it : result) {
            System.out.println(it);
        }
        
        System.out.println(result.size());
    }
}
