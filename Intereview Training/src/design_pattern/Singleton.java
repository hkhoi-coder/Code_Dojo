package design_pattern;

/**
 *
 * @author hkhoi
 */
public class Singleton {

    private static Singleton instance;
    
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    private Singleton() {
        // Prevent new instances
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
}
