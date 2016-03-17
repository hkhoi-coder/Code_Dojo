package support.q3_7;

/**
 *
 * @author hkhoi
 */
public class Dog implements Animal {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return Type.DOG;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + '}';
    }
}
