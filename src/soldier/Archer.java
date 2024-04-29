package soldier;

import behavior.Offensive;

public class Archer extends Soldier implements Offensive {
    public Archer(String name, int damage, Type type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.name + " here. Damage is " + super.damage + ", type " + super.type);
    }

    @Override
    public void attack() {
        System.out.println("Archer " + super.name + " is attacking.");
    }

    public void showerWithArrows() {
        System.out.println("Archer " + super.name + " is showering the enemy with arrows...");
    }
}
