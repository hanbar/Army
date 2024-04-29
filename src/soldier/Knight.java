package soldier;

import behavior.Defensive;

public class Knight extends Soldier implements Defensive {
    public Knight(String name, int damage, Type type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + this.name + " here. Damage is " + this.damage + ", type " + this.type);
    }

    @Override
    public void defend() {
        System.out.println("Knight " + this.name + " is defending.");
    }

    public void flankEnemy() {
        System.out.println("Knight " + this.name + " is flanking the enemy...");
    }
}
