package design_pattern.factory;

/**
 *
 * @author hkhoi
 */
public class ZombieFactory {
    
    public static enum ZombieType {
        BOOMER, CHARGER, JOCKEY
    }
    
    public Zombie makeZombie(ZombieType type) {
        switch (type) {
            case BOOMER:
                return new Boomer();
            case CHARGER:
                return new Charger();
            case JOCKEY:
                return new Jockey();
        }
        
        return null;
    }
}
