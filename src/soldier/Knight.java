package soldier;

import behavior.Defensive;

public class Knight extends Soldier implements Defensive {
    public Knight(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + this.name + " here. Damage is " + this.damage + ", type " + TYPE);
    }

    @Override
    public void defend() {
        System.out.println("Knight " + this.name + " is defending.");
    }

    public void flankEnemy() {
        System.out.println("Knight " + this.name + " is flanking the enemy...");
    }
}
