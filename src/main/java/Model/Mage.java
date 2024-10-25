package Model;

import Tools.RandomNum;

public final class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(100, 150);
        enemy.takeDamage(damage);
        System.out.println("+++++(Hero) " + getName() + " kicks the enemy " + enemy + ", power of hit: " + damage);
    }
}

