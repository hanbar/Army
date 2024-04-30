package soldier;

import behavior.Defensive;
import behavior.Type;

public class Knight extends Soldier implements Defensive {
    public Knight(String name, int damage, Type type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + this.getName() + " here. Damage is " + this.getDamage() + ", type " + this.getType());
    }

    @Override
    public void defend() {
        System.out.println("Knight " + this.getName() + " is defending.");
    }

    public void flankEnemy() {
        System.out.println("Knight " + this.getName() + " is flanking the enemy...");
    }
}
