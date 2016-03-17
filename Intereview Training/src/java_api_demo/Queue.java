package java_api_demo;

import java.util.ArrayDeque;

/**
 *
 * @author hkhoi
 */
public class Queue implements Runnable {

    @Override
    public void run() {
        java.util.Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        
        System.out.println(queue);
    }
}
