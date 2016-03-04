package question.chap2;

import implementation.LinkedList;

/**
 *
 * @author hkhoi
 */
public class Q2_2 extends LinkedList{
    public int kLastElement(int k) {
        if (k == 0) {
            return tail.getValue();
        }
        
        Node camper = root;
        Node runner = root;
        
        for (int i = 0; i < k; ++i) {
            runner = runner.getNext();
        }
        while (runner.getNext() != null) {
            runner = runner.getNext();
            camper = camper.getNext();
        }
        
        return camper.getValue();
    }
}
