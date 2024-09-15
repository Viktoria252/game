package lab10.game;

import java.util.Arrays;

public class Knight extends Hero {
    private static final int MAX_STREHGTH = 100;
    private int strength;
    private int forcePower = 1;

    public Knight(String username, int health, int strength) {
        super(username, health);
        this.strength = strength;
    }

    @Override
    public boolean change(Weapon weapon) {
        if (weapon.getClass().getSimpleName().equals("Sword")) {
            this.weapon = weapon;
            return true;
        }
        return false;
    }

    @Override
    public boolean action(Player player, int dist) {
        if (this.strength > 0 && weapon != null && dist <= weapon.getDistance() + 1) {
            player.damage((int) (this.forcePower * weapon.getPower()));
            return  true;
        } else if (dist == 1) {
            player.damage(this.forcePower);
            return true;
        } return false;
    }

    @Override
    public boolean useItem(int val) {
        if (0 < val && val < ITEMS_COUNT
                && items[val - 1] != null && !items[val - 1].isUsed()) {
            if (items[val - 1].getClass().getSimpleName().equals("Food")) {
                this.strength += items[val - 1].getCount();
                items[val - 1].use();
                items[val - 1] = null;
                if (this.strength > MAX_STREHGTH) {
                    this.strength = MAX_STREHGTH;
                } return true;
            } else if  (items[val - 1].getClass().getSimpleName().equals("HealthPotion")) {
                this.health += items[val - 1].getCount();
                items[val - 1].use();
                items[val - 1] = null;
                if (this.health > MAX_HEALTH) {
                    this.health = MAX_HEALTH;
                } return true;
            } return true;
        } return false;
    }

    @Override
    public String toString() {
        String aboutWeapon;
        String aboutItems = "";
        if (weapon == null) {
            aboutWeapon = "no";
        } else {aboutWeapon = weapon.toString();}
        for (Item i : items) {
                if (i != null) {
                    aboutItems += i.toString() + "; ";}
        }
        if (aboutItems.equals("")) {
            aboutItems = "no";
        }
        return this.getClass().getSimpleName() + ": " + this.getUsername() + ", health: " + this.health + 
                ", weapon: " + aboutWeapon + ", inventory: " + aboutItems + Arrays.toString(clothes);
    }

}
