package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hkhoi
 */
public class MultithreadingDemo implements Runnable {

    @Override
    public void run() {
        Callme callme = new Callme();
        new ThreadCallme(callme, "HoangKhoi");
        new ThreadCallme(callme, "DepTrai");
        new ThreadCallme(callme, "Fabulous");
    }

    private class ThreadCallme implements Runnable {

        private Callme callme;
        private String msg;
        private Thread thread;

        public ThreadCallme(Callme callme, String msg) {
            this.callme = callme;
            this.msg = msg;
            thread = new Thread(this);
            thread.start();
        }

        @Override
        public void run() {
            synchronized (callme) {
                try {
                    callme.call(msg);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MultithreadingDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
