import Model.Archer;
import Model.Hero;
import Model.Warrior;
import org.junit.Assert;
import org.junit.Test;

public class TrainingGround {
    @Test
    public void main() {
        Hero hero = new Hero("John Lord");
        hero.attackEnemy();

        Warrior warrior = new Warrior("Cynthia Rothrock");
        warrior.attackEnemy();

        Archer archer = new Archer("Paul Young");
        archer.attackEnemy();
    }
}
