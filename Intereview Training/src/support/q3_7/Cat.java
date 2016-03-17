package support.q3_7;

/**
 *
 * @author hkhoi
 */
public class Cat implements Animal {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return Type.CAT;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + '}';
    }
}
