package lab10.game;

public interface Weapon {
    static final double MAX_VALUE = 5.0;
    static final double MIN_VALUE = 1.0;
    double getPower();
    int getDistance();
}
