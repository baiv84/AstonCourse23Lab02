package Model;

import lombok.Getter;
import lombok.Setter;

public class Enemy {
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

    @Override
    public String toString() {
        return name;
    }
}
