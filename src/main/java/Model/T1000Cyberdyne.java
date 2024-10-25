package Model;

import Tools.RandomNum;

public class T1000Cyberdyne extends Enemy {
    public T1000Cyberdyne(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = RandomNum.nextRandom(350, 500);
        hero.takeDamage(damage);
        System.out.println("-----(Enemy) " + getName() + " attacking the hero " + hero + ", power of hit: " + damage);
    }
}
