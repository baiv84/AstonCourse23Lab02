package Model;

import Tools.RandomNum;

public final class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(60, 90);
        enemy.takeDamage(damage);
        System.out.println("ARCHER: Enemy - " + enemy + " took damage - " + damage);
    }
}
