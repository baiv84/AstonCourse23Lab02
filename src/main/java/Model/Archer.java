package Model;

import Tools.RandomNum;

public final class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(60, 90);
        enemy.takeDamage(damage);
        System.out.println("+++++(Hero) " + getName() + " kicks the enemy " + enemy + ", power of hit: " + damage);
    }
}
