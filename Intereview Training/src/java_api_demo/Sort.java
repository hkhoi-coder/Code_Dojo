package java_api_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hkhoi
 */
public class Sort implements Runnable {

    @Override
    public void run() {
        Integer[] array = {19,63,27,469,16,238,74,68,719,827,36,4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        List<Integer> myList = Arrays.asList(array);
        myList.sort(Collections.reverseOrder());
        System.out.println(myList);
    }
}
