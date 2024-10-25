package Model;

import Tools.RandomNum;

public final class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(200, 300);
        enemy.takeDamage(damage);
        System.out.println("+++++(Hero) " + getName() + " kicks the enemy " + enemy + ", power of hit: " + damage);

    }
}
