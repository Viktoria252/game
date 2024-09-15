package lab10.game;

public abstract class Hero implements Healthy, Equipment,
        Inventory, Player {
    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes = new Armor[CLOTHES_COUNT];
    protected Item[] items = new Item[ITEMS_COUNT];

    public Hero(String username, int health) {
        this.setUsername(username);
        this.health = health;
    }

    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.username = username;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    private void loseHealth(int dam){
        this.health -= dam;
    }
    @Override
    public int damage(int value) {
        for (Armor a : clothes) {
            if (a != null && !a.isBroken()) {
                int value2 = a.getDurability();
                if (value >= 0) {
                    a.destroyBy(value);
                    value -= value2;
                }
            }
        }
        if (value > 0) {
            this.loseHealth(value);
        }
        return value;
    }

    @Override
    public boolean isDied() {
        if (this.health <= 0) {return true;}
        return false;
    }

    @Override
    public void recoverHealth(int health) {
        this.health += health;
        if (this.health > MAX_HEALTH) {this.health = MAX_HEALTH;}
    }

    @Override
    public void dress(Armor armor) {
        clothes[armor.getPosition()-1] = armor;
        }

    @Override
    public boolean change(Weapon weapon) {
        return false;
    }

    @Override
    public boolean action(Player player, int dist) {
        return false;
    }

    @Override
    public boolean putInto(Item item, int val) {
        if (0 < val && val < ITEMS_COUNT && items[val - 1] == null) {
            if (item.getClass().getSimpleName().equals("Food")) {
                items[val - 1] = item;
            } else if (item.getClass().getSimpleName().equals("HealthPotion")) {
                items[val - 1] = new HealthPotion(val);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean useItem(int val) {
        return false;
    }
}
