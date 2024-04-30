package soldier;

import behavior.Adaptable;
import behavior.Type;

public class HorseRider extends Soldier implements Adaptable {
    public HorseRider(String name, int damage, Type type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + this.getName() + " here. Damage is " + this.getDamage() + ", type " + this.getType());
    }

    @Override
    public void adapt() {
        System.out.println("HorseRider " + this.getName() + " is adapting.");
    }

    public void cutOffEnemy() {
        System.out.println("HorseRider " + this.getName() + " is cutting the enemy off...");
    }
}
