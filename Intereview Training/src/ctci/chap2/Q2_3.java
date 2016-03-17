package ctci.chap2;

import implementation.LinkedList;

/**
 *
 * @author hkhoi
 */
public class Q2_3 extends LinkedList {
    public void removeMid(Node mid) {
        while (mid.getNext().getNext() != null) {
            mid.setValue(mid.getNext().getValue());
            mid = mid.getNext();
        }
        mid.setValue(mid.getNext().getValue());
        tail = mid;
        tail.setNext(null);
    }
}
