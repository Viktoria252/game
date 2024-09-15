package lab10.game;

public interface Player {
    String getUsername();
    int getHealth();
    int damage(int value);
    boolean action(Player player, int dist);
}
