package Model;

public final class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Archer " + name + " attack enemy!");
    }
}
