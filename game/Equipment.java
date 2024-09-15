package lab10.game;

public interface Equipment {
    static final int CLOTHES_COUNT = 3;
    boolean change(Weapon weapon);

    void dress(Armor armor);
}
