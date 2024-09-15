package lab10.game;

public class Main {
    public static void main(String[] args) {
        Knight knight1 = new Knight("rabbit", 35, 35);
        Knight knight2 = new Knight("turtle", 25, 25);
        knight1.putInto(new Food(4), 2);
        knight1.useItem(2);
        knight1.useItem(1);
        knight1.change(new Sword(3));
        knight1.dress(new Helmet(10));
        knight1.dress(new Boots(10));
        knight1.dress(new Dress(10));
        knight2.action(knight1, 2);
        System.out.println(knight1);
        System.out.println(knight2);
    }
}
