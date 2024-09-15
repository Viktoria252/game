package lab10.game;

public abstract class BaseWeapon implements Weapon{
    protected double power;
    public BaseWeapon(double power) {
        this.setPower(power);
    }

    public void setPower(double power) {
        if (power <= MAX_VALUE && power >= MIN_VALUE) {
            this.power = power;
            }
        else {
            throw new IllegalArgumentException("Not valid argument");
            }
    }

    @Override
    public int getDistance() {
        return 0;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", power: " + this.getPower() + ", distance: " + this.getDistance();
    }
}
