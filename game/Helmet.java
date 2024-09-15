package lab10.game;

public class Helmet extends BaseArmor{
    private int HELMET_POSITION = 3;

    public Helmet(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }
}
