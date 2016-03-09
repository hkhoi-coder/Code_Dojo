/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *https://codility.com/demo/results/trainingKQEZVY-S9X/
 * @author hkhoi
 */
public class BinaryGap {

    public int solution(int n) {
        boolean bitOpen = false;
        int gap = 0;
        int gapSoFar = 0;

        while (n != 0) {
            if (n % 2 != 0) {
                // The last bit is 1
                bitOpen = true;
                gapSoFar = Math.max(gap, gapSoFar);
                gap = 0;
            } else if (bitOpen) {
                gap += 1;
            }

            n >>= 1;        // shift right one bit   
        }
        return gapSoFar;
    }
}
