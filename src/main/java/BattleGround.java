import Model.*;
import Tools.RandomNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleGround {
    public void main() {

        List<Enemy> enemies = new ArrayList<>(Arrays.asList(
                new T800Cyberdyne("Arnold Schwarzenegger", 500),
                new T1000Cyberdyne("Robert Patrick", 700),
                new Zombie("Michael Jackson", 90)
        ));

        List<Hero> heroes = new ArrayList<>(Arrays.asList(
                new Warrior("Cynthia Rothrock", 1500),
                new Archer("Paul Young", 1700),
                new Mage("Goodwin", 1900)
        ));

        int heroIndex = RandomNum.nextRandom(0, heroes.size()-1);
        Hero hero = heroes.get(heroIndex);

        System.out.println("\n*****************************");
        System.out.println("Hero to fight: " + hero);
        System.out.println("*****************************\n");

        while (hero.isAlive() && enemies.size() > 0) {
            int enemyIndex = RandomNum.nextRandom(0, enemies.size()-1);
            Enemy enemy = enemies.get(enemyIndex);
            hero.attackEnemy(enemy);

            if (!enemy.isAlive()) {
                boolean secondChance = enemy.reincarnate();
                if (!secondChance) {
                    enemies.remove(enemy);
                    continue;
                }
            }

            enemy.attackHero(hero);
            System.out.println("\n");

        }

        System.out.println("\nBATTLE RESULT:");
        if (!hero.isAlive()) {
            System.out.println("Hero was killed -((");
        }

        if (enemies.size() == 0) {
            System.out.println("Hero win ALL enemies -))");
        }
    }
}
