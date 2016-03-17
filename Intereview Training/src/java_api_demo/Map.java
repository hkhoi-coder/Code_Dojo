package java_api_demo;

import java.util.HashMap;

/**
 *
 * @author hkhoi
 */
public class Map implements Runnable {

    @Override
    public void run() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Diep", 8);
        map.put("Khoi", 18);
                
        System.out.println(map);
    }
}
