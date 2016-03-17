package implementation.non_linear;

/**
 *
 * @author hkhoi
 */
public class BinarySearchNode extends BinaryNode {

    public BinarySearchNode(int value) {
        super(value);
    }

    public void add(int value) {
        BinaryNode iterator = this;
        while (true) {
            if (value <= this.value) {
                if (iterator.left == null) {
                    iterator.left = new BinarySearchNode(value);
                    break;
                } else {
                    iterator = iterator.left;
                }
            } else if (iterator.right == null) {
                iterator.right = new BinarySearchNode(value);
                break;
            } else {
                iterator = iterator.right;
            }
        }
    }
}
