package java_api_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author hkhoi
 */
public class Hash implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 5; ++i) {
            hashSet.add(random.nextInt());
        }

        System.out.println(hashSet);

        HashMap<String, Integer> hashMap = new HashMap();
        System.out.println(hashMap.put("Khoi", 18));
    }
}
