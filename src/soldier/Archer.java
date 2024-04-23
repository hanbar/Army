package soldier;

import behavior.Offensive;

public class Archer extends Soldier implements Offensive {
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + this.name + " here. Damage is " + this.damage + ", type " + TYPE);
    }

    @Override
    public void attack() {
        System.out.println("Archer " + this.name + " is attacking.");
    }

    public void showerWithArrows() {
        System.out.println("Archer " + this.name + " is showering the enemy with arrows...");
    }
}
