package lab10.game;

public interface Armor {
    static final int MIN_VALUE = 5;
    static final int MAX_VALUE = 50;
    boolean isBroken();
    int destroyBy(int dest);
    int getPosition();
    int getDurability();
}
