package Model;

import lombok.Getter;

abstract public class Hero {
    @Getter
    protected String name;

    public Hero(String name) {
        this.name = name;
    }

    abstract public void attackEnemy(Enemy enemy);
}
