package implementation.bit;

/**
 *
 * @author hkhoi
 */
public class IntBit {
    public int setBit(int num, int position) {
        return (num | (1 << position));
    }
    
    public int clearBit(int num, int position) {
        return (num & ~(1 << position));
    }
    
    public int toggle(int num, int position) {
        return (num ^ (1 << position));
    }
    
    public boolean isOn(int num, int position) {
        int temp = num & (1 << position);
        return temp != 0;
    }
    
    public int lowBit(int num) {
         return (num & -num);
    }
    
    public boolean isPowerOfTwo(int num) {
        int temp = num & (num - 1);
        return temp == 0;
    }
    
    public int createFullBit(int num) {
        return (1 << num) - 1;
    }
    
    public int trimLeft(int num, int numKeep) {
        int mask = createFullBit(numKeep);
        return num & mask;
    }
}
