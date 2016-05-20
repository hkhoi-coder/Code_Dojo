package java_api_demo;

import java.util.GregorianCalendar;

/**
 *
 * @author hkhoi
 */
public class Calendar implements Runnable {

    @Override
    public void run() {
        java.util.Calendar calendar = new GregorianCalendar(2008, 0, 23);
        calendar.add(java.util.Calendar.WEEK_OF_MONTH, 40);
        
        System.out.printf("%d, %d : %d\n",
                calendar.get(java.util.Calendar.DAY_OF_MONTH),
                calendar.get(java.util.Calendar.MONTH) + 1,
                calendar.get(java.util.Calendar.YEAR));
    }    
}
