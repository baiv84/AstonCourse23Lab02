package Model;

import Tools.RandomNum;
import lombok.Getter;

public class Hero {
    @Getter
    protected String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy(Enemy enemy) {
        int damage = RandomNum.nextRandom(20, 50);
        enemy.takeDamage(damage);
        System.out.println("HERO: Enemy - " + enemy + " took damage - " + damage);
    }
}
