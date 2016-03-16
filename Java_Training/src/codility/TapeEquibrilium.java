/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author hkhoi
 */
public class TapeEquibrilium {

    public int solution(int[] a) {
        // write your code in Java SE 8
        int len = a.length;
        int[] mem0 = new int[len];

        mem0[0] = a[0];
        int revSum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < len; ++i) {
            mem0[i] = mem0[i - 1] + a[i];
        }
        for (int i = len - 1; i > 0; --i) {
            revSum += a[i];
            //         System.out.println("revSum = " + revSum + ", mem0 = " + mem0[i - 1]);
            int temp = Math.abs(revSum - mem0[i - 1]);
            min = Math.min(min, temp);
        }

        return min;
    }
}
