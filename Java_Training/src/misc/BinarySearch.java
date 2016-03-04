package misc;

/**
 *
 * @author hkhoi
 */
public class BinarySearch implements Runnable {

    private final int[] data;
    private final int target;

    public BinarySearch(int[] data, int target) {
        this.data = data;
        this.target = target;
    }

    @Override
    public void run() {
        System.out.println(BinarySearchImp(0, data.length - 1));
    }

    private int BinarySearchImp(int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midValue = data[mid];
        
        if (midValue == target) {
            return mid;
        }
        
        if (target < midValue) {
            return BinarySearchImp(left, mid - 1);
        } else {
            return BinarySearchImp(mid + 1, right);
        }
    }
}
