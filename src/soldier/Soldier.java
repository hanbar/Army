package soldier;

import behavior.Type;

public abstract class Soldier {
    private String name;
    private int damage;
    private final Type type;

    public Soldier(String name, int damage, Type type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public abstract void report();

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public Type getType() {
        return type;
    }
}
