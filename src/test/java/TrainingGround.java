import Model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TrainingGround {
    @Test
    public void main() {
        Enemy enemy = new Enemy("Heroku Saki", 1000);

        Warrior warrior = new Warrior("Cynthia Rothrock");
        Archer archer = new Archer("Paul Young");
        Mage mage = new Mage("Goodwin");

        warrior.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        mage.attackEnemy(enemy);


    }
}
