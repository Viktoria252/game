package lab10.game;

public interface Healthy {
    static final int  MAX_HEALTH = 100;
    boolean isDied();
    void recoverHealth(int health);
}
