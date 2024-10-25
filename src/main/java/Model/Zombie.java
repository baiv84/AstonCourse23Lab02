package Model;

import Tools.RandomNum;

public class Zombie extends Enemy {
    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = RandomNum.nextRandom(60, 90);
        hero.takeDamage(damage);
        System.out.println("-----(Enemy) " + getName() + " attacking the hero " + hero + ", power of hit: " + damage);
    }

    @Override
    public boolean reincarnate() {
        int carma = RandomNum.nextRandom(0, 100) % 2;
        if (carma == 1) {
            System.out.println("ZOMBIE REINCARNATION !!!!!");
            setHealth(100);
        }
        return isAlive();
    }
}
