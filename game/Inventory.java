package lab10.game;

public interface Inventory {
    static final int ITEMS_COUNT = 5;
    boolean putInto(Item item, int val);
    boolean useItem(int val);
}
