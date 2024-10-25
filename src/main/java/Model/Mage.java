package Model;

import Tools.RandomNum;

public final class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(100, 150);
        enemy.takeDamage(damage);
        System.out.println("MAGE: Enemy - " + enemy + " took damage - " + damage);
    }
}
