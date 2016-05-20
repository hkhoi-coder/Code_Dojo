package driver;

import design_pattern.factory.Zombie;
import design_pattern.factory.ZombieFactory;

/**
 *
 * @author hkhoi
 */
public class Main {

    public static void main(String[] args) {
        ZombieFactory zombieFactory = new ZombieFactory();
        Zombie zombie = zombieFactory.makeZombie(ZombieFactory.ZombieType.JOCKEY);
        
        zombie.roar();
    }
}
