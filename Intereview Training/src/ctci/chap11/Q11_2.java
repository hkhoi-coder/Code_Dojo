package ctci.chap11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author hkhoi
 */
public class Q11_2 {
    
    public void anagramSort(String[] strings) {
        
        TreeMap<String, LinkedList<String>> map = new TreeMap<>();
        
        for (String it : strings) {
            char[] charArray = it.toCharArray();
            Arrays.sort(charArray);
            
            String key = new String(charArray);
            
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }
            
            map.get(key).add(it);
        }
        
        int index = 0;
        for (Map.Entry<String, LinkedList<String>> it : map.entrySet()) {
            LinkedList<String> linkedList = it.getValue();
            for (String value : linkedList) {
                strings[index] = value;
                index += 1;
            }
        }
    }
}
