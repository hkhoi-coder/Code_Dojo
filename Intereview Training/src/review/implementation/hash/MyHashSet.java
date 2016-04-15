package review.implementation.hash;

/**
 *
 * @author hkhoi
 */
public interface MyHashSet {
    public boolean put(int key);
    public boolean contains(int key);
    public boolean remove(int key);
    public int size();
}
