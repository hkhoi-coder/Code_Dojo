package question.chap3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import support.q3_7.*;
/**
 *
 * @author hkhoi
 */
public class Q3_7 {

    private final LinkedList<Animal> queue = new LinkedList<>();

    public void enqueue(Animal animal) {
        queue.add(animal);
    }

    public Animal dequeueAny() {
        return queue.poll();
    }

    public Dog dequeueDog() {
        ListIterator<Animal> iterator = queue.listIterator(0);
        while (iterator.hasNext()) {
            Animal temp = iterator.next();
            if (temp.getType() == Animal.Type.DOG) {
                iterator.remove();
                return (Dog) temp;
            }
        }
        return null;
    }

    public Cat dequeueCat() {
        ListIterator<Animal> itertor = queue.listIterator(0);
        while (itertor.hasNext()) {
            Animal cur = itertor.next();
            if (cur.getType() == Animal.Type.CAT) {
                itertor.remove();
                return (Cat) cur;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Q3_7{" + "queue=" + queue + '}';
    }
}
