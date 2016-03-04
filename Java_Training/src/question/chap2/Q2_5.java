package question.chap2;

import implementation.LinkedList;

/**
 *
 * @author hkhoi
 */
public class Q2_5 {
    public LinkedList sumLinkedList(LinkedList arg0, LinkedList arg1) {
        int num0 = linkedListToInteger(arg0);
        int num1 = linkedListToInteger(arg1);

        return integerToLinkedList(num0 + num1);
    }
    
    private LinkedList integerToLinkedList(int num) {
        LinkedList result = new LinkedList();
        
        while (num > 0) {
            result.add(num % 10);
            num /= 10;
        }
        
        return result;
    }

    private int linkedListToInteger(LinkedList arg1) {
        int result = 0;
        int mul = 1;
        for (int it : arg1) {
            result += (it * mul);
            mul *= 10;
        }
        return result;
    }

    public LinkedList sumLinkedList2(LinkedList arg0, LinkedList arg1) {
        LinkedList.Node iterator0 = arg0.getNode(0);
        LinkedList.Node iterator1 = arg1.getNode(0);
        LinkedList result = new LinkedList();
        int carrier = 0;
        
        while (iterator0 != null || iterator1 != null) {
            int num0 = iterator0 != null ? iterator0.getValue() : 0;
            int num1 = iterator1 != null ? iterator1.getValue() : 0;
            
            int rawSum = carrier + num0 + num1;
            int currentDigit = rawSum % 10;
            carrier = rawSum / 10;
            
            result.add(currentDigit);
            
            if (iterator0 != null) {
                iterator0 = iterator0.getNext();
            }
            if (iterator1 != null) {
                iterator1 = iterator1.getNext();
            }
        }
        
        return result;
    }
}
