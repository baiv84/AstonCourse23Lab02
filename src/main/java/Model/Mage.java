package Model;

public final class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Mage " + name + " attack enemy!");
    }
}