package Model;

import Tools.RandomNum;

public final class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(200, 300);
        enemy.takeDamage(damage);
        System.out.println("WARRIOR: Enemy - " + enemy + " took damage - " + damage);
    }
}
