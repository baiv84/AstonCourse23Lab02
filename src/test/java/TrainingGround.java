import Model.*;
import org.junit.Assert;
import org.junit.Test;

public class TrainingGround {
    @Test
    public void main() {
        Enemy enemy = new Enemy("Heroku Saki", 1000);

        Hero hero = new Hero("John Lord");
        Warrior warrior = new Warrior("Cynthia Rothrock");
        Archer archer = new Archer("Paul Young");
        Mage mage = new Mage("Goodwin");

        hero.attackEnemy(enemy);
        warrior.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        mage.attackEnemy(enemy);
    }
}
