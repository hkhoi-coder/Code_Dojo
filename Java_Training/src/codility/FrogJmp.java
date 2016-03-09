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
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        return (int) Math.ceil(((double) Y - X) / D);
    }
}
