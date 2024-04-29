package soldier;

import behavior.Adaptable;

public class HorseRider extends Soldier implements Adaptable {
    public HorseRider(String name, int damage, Type type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + this.name + " here. Damage is " + this.damage + ", type " + this.type);
    }

    @Override
    public void adapt() {
        System.out.println("HorseRider " + this.name + " is adapting.");
    }

    public void cutOffEnemy() {
        System.out.println("HorseRider " + this.name + " is cutting the enemy off...");
    }
}
