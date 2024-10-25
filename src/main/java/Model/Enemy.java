package Model;

import lombok.Getter;
import lombok.Setter;

abstract public class Enemy implements Mortal {
    @Getter
    @Setter
    private int health;

    @Getter
    private String name;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (health >= damage) {
            health -= damage;
        } else {
            health = 0;
        }
    }

    public boolean reincarnate() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return health > 0 ? true : false;
    }

    abstract public void attackHero(Hero hero);

}
