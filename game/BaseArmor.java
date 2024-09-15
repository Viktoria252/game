package lab10.game;

public abstract class BaseArmor implements Armor{
    protected int durability;

    public BaseArmor(int durability) {
        this.setDurability(durability);
    }

    public void setDurability(int durability) {
        if (durability <= MAX_VALUE && durability >= MIN_VALUE) {
            this.durability = durability;
        }
        else {
            throw new IllegalArgumentException("Not valid argument");
        }
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public boolean isBroken() {
        if (this.durability == 0) {
            return true;
        }
        return false;
    }


    @Override
    public int destroyBy(int dest) {
        if (this.durability < dest) {
            this.durability = 0;
        }
        else {this.durability -= dest;}
        return durability;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public String toString() {
        return this.getPosition() + " : " + this.getClass().getSimpleName() + ", durability: "
                + durability + ", isBroken: " + this.isBroken();
    }
}
