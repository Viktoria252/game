package lab10.game;

public interface Item {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 10;
    int use();
    boolean isUsed();
    int getCount();
}
