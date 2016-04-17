package ctci.chap2;

import review.implementation.linkedlist.LinkNode;

/**
 *
 * @author hkhoi
 */
public class Q2_4 {

    public LinkNode partition(LinkNode root, int pivot) {
        LinkNode iterator = root;

        LinkNode beforeRoot = null;
        LinkNode beforeTail = null;
        LinkNode afterRoot = null;
        LinkNode afterTail = null;

        while (iterator != null) {
            LinkNode cur = iterator;
            iterator = iterator.getNext();

            cur.setNext(null);

            if (cur.getValue() < pivot) {
                if (beforeRoot == null) {
                    beforeRoot = cur;
                    beforeTail = cur;
                } else {
                    beforeTail.setNext(cur);
                    beforeTail = beforeTail.getNext();
                }
            } else if (cur.getValue() > pivot) {
                if (afterRoot == null) {
                    afterRoot = cur;
                    afterTail = cur;
                } else {
                    afterTail.setNext(cur);
                    afterTail = afterTail.getNext();
                }
            } else if (afterRoot == null) {
                afterRoot = cur;
                afterTail = cur;
            } else {
                cur.setNext(afterRoot);
                afterRoot = cur;
            }
        }

        if (beforeTail != null) {
            beforeTail.setNext(afterRoot);
            return beforeRoot;
        } else {
            return afterRoot;
        }
    }
}
