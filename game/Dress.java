package lab10.game;

public class Dress extends BaseArmor{
    private int DRESS_POSITION = 2;
    public Dress(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return DRESS_POSITION;
    }
}
