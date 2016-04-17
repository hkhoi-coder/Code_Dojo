package java_api_demo;

/**
 *
 * @author hkhoi
 */
public class LinkedList implements Runnable {

    @Override
    public void run() {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.removeFirst();
    }    
}