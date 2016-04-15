package support.codility;

/**
 *
 * @author hkhoi
 */
public class Interval {

    private final int first;

    private final int second;

    public Interval(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Interval{" + "first=" + first + ", second=" + second + '}';
    }
}
