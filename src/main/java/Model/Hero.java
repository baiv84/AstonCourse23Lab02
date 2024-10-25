package Model;

import lombok.Getter;

public class Hero {
    @Getter
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println("Hero " + name + " attack enemy!");
    }
}
