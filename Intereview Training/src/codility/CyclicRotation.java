/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 * https://codility.com/demo/results/trainingS7RNYQ-BTP/
 * @author hkhoi
 */
public class CyclicRotation {

    public int[] solution(int[] a, int k) {

        if (k == 0 || a.length == 0) {
            return a;
        }

        int len = a.length;
        k %= len;

        int div = len - k;
        rotate(a, 0, div - 1);
        rotate(a, div, len - 1);
        rotate(a, 0, len - 1);

        return a;
    }

    public void rotate(int[] a, int from, int to) {
        while (from < to) {
            int temp = a[from];
            a[from] = a[to];
            a[to] = temp;
            ++from;
            --to;
        }
    }
}
