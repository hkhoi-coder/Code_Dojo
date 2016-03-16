package driver;

import ctci.chap5.Q5_1;
import implementation.bit.IntBit;

/**
 *
 * @author hkhoi
 */
public class Main {
    public static void main(String[] args) {
        String num0 = "10000000000";
        String num1 = "10011";
        
        int bin0 = Integer.parseInt(num0, 2);
        int bin1 = Integer.parseInt(num1, 2);
        
        
        Q5_1 solve = new Q5_1();
        int solution = solve.insertBit(bin0, bin1, 2, 6);
        
        System.out.println(Integer.toBinaryString(solution));
    }
}
