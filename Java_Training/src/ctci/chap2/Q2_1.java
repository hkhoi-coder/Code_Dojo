package ctci.chap2;

import implementation.LinkedList;
import java.util.HashSet;

/**
 *
 * @author hkhoi
 */
public class Q2_1 extends LinkedList {

    public void removeDuplicatedUnsorted() {
        if (root == null || root == tail) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(root.getValue());
        
        Node iterator = root;
        while (iterator.getNext() != null) {
            int cur = iterator.getNext().getValue();
            if (set.contains(cur)) {
                iterator.removeNext();
            } else {
                set.add(cur);
                iterator = iterator.getNext();
            }
        }
    }
    
    public void removeDuplicatedNoBuffer() {
        if (root == null || root == tail) {
            return;
        }
        
        Node iterator = root;
        while (iterator != null) {
            Node subIterator = iterator;
            while (subIterator.getNext() != null) {
                int cur = subIterator.getNext().getValue();
                if (cur == iterator.getValue()) {
                    subIterator.removeNext();
                } else {
                    subIterator = subIterator.getNext();
                }
            }
            iterator = iterator.getNext();
        }
    }
    
    public void removeDuplicatedSorted() {
        if (root == null || tail == root) {
            return;
        }
        
        Node camper = root;
        Node runner = root;
        
        while (camper != null) {
            while (runner != null && runner.getValue() == camper.getValue()) {
                runner = runner.getNext();
            }
            
            camper.setNext(runner);
            camper = runner;
        }
    }
}
