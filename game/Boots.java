package lab10.game;

public class Boots extends BaseArmor{
    private int BOOTS_POSITION = 1;

    public Boots(int durability) {
        super(durability);
    }

    @Override
    public int getPosition() {
        return BOOTS_POSITION;
    }
}
