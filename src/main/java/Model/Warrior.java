package Model;

public final class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior " + name + " attack enemy!");
    }
}
