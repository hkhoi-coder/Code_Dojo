package misc;

/**
 *
 * @author hkhoi
 */
public class HanoiTower implements Runnable {

    private final int num;

    public HanoiTower(int num) {
        this.num = num;
    }
    
    @Override
    public void run() {
        solve(num, 'A', 'B', 'C');
    }

    private void solve(int num, char c, char c0, char c1) {
        if (num == 1) {
            move(c, c1);
        } else {
            solve(num - 1, c, c1, c0);
            move(c, c1);
            solve(num - 1, c0, c, c1);
        }
    }

    private void move(char c, char c1) {
        System.out.println("Move a disk from " + c + " to " + c1);
    }
}
