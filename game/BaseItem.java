package lab10.game;

public abstract class BaseItem implements Item {
    protected int count;
    protected boolean using = false;

    public BaseItem(int count) {
        this.setCount(count);
    }

    public void setCount(int count) {
        if (count <= MAX_VALUE && count >= MIN_VALUE) {
            this.count = count;
        }
        else {
            throw new IllegalArgumentException("Not valid argument");
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public int use() {
        this.using = true;
        return 0;
    }

    @Override
    public boolean isUsed() {
        return using;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", count: " + this.getCount() + ", isUsed: " + this.isUsed();
    }
}
