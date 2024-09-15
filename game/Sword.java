package lab10.game;

public class Sword extends BaseWeapon{
    private int SWORD_DISTANCE = 2;

    public Sword(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return SWORD_DISTANCE;
    }
}
