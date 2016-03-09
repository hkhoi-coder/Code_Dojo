/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 * https://codility.com/demo/results/trainingYPK3DC-KVG/
 * @author hkhoi
 */
public class OddOccurences {
        public int solution(int[] A) {
        int result = 0;
        
        for (int i : A) {
            result = result ^ i;   
        }
        
        return result;
    }
}
