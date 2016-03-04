package multithread;

/**
 *
 * @author hkhoi
 */
public class Callme {
    public void call(String str) throws InterruptedException {
        System.out.print("[" + str);
        Thread.sleep(1300);
        System.out.println("]");
    }
}
