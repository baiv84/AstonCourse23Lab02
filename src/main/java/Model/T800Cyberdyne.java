package Model;

import Tools.RandomNum;

public class T800Cyberdyne extends Enemy {
    public T800Cyberdyne(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = RandomNum.nextRandom(200, 300);
        hero.takeDamage(damage);
        System.out.println("-----(Enemy) " + getName() + " attacking the hero " + hero + ", power of hit: " + damage);
    }

}
