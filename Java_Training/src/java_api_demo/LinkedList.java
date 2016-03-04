package java_api_demo;

/**
 *
 * @author hkhoi
 */
public class LinkedList implements Runnable {

    @Override
    public void run() {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.add(1, 99);
        
        list.addFirst(Integer.SIZE);
        list.addLast(Integer.SIZE);
        
        while (!list.isEmpty()) {
            System.out.print(list.poll() + " ");
        }
        System.out.println("");
    }    
}