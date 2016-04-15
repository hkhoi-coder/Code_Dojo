package concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hkhoi
 */
public class ImplementRunnable implements Runnable {

    private final int time;
    
    private final Thread thread;
    
    public ImplementRunnable(int time) {
        this.time = time;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < time; ++i) {
            System.out.println(i);
            try {
                thread.sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImplementRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}