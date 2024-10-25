package Model;

import lombok.Getter;
import lombok.Setter;

abstract public class Hero {
    @Getter
    @Setter
    protected int health;

    @Getter
    protected String name;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0 ? true : false;
    }

    public void takeDamage(int damage) {
        if (health >= damage) {
            health -= damage;
        } else {
            health = 0;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    abstract public void attackEnemy(Enemy enemy);

}
