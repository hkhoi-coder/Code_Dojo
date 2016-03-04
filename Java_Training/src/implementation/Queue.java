package implementation;

/**
 *
 * @author hkhoi
 */
public class Queue extends LinkedList {
    @Override
    public void add(int value) {
        super.add(value);
    }
    
    public int poll() {
        int value = root.getValue();
        removeFirst();
        return value;
    }
}
