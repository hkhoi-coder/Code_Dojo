package review.implementation.linkedlist;

/**
 *
 * @author hkhoi
 */
public class LinkNode {

    public LinkNode(int value) {
        this.value = value;
        this.next = null;
    }

    private final int value;
    private LinkNode next;

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }

    public int getValue() {
        return value;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
    
    public void printTest() {
        LinkNode iterator = this;
        while (iterator != null) {
            System.out.print(iterator.value + " ");
            iterator = iterator.next;
        }
        System.out.println();
    }
}
