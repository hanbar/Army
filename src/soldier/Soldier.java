package soldier;

public abstract class Soldier {
    protected String name;
    protected int damage;
    protected final Type type;

    public enum Type {
        ADAPTABLE, DEFENSIVE, OFFENSIVE
    }

    public Soldier(String name, int damage, Type type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public abstract void report();
}
