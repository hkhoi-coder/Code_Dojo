package concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hkhoi
 */
public class ExtendThread extends Thread {
    private final int time;

    public ExtendThread(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < time; ++i) {
            System.out.println(i);
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExtendThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
