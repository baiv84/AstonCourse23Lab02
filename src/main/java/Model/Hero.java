package Model;

import lombok.Getter;

abstract class Hero {
    @Getter
    protected String name;

    public Hero(String name) {
        this.name = name;
    }

    abstract void attackEnemy(Enemy enemy);
}
