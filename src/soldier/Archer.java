package soldier;

import behavior.Offensive;
import behavior.Type;

public class Archer extends Soldier implements Offensive {
    public Archer(String name, int damage, Type type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + super.getName() + " here. Damage is " + super.getDamage() + ", type " + super.getType());
    }

    @Override
    public void attack() {
        System.out.println("Archer " + super.getName() + " is attacking.");
    }

    public void showerWithArrows() {
        System.out.println("Archer " + super.getName() + " is showering the enemy with arrows...");
    }
}
