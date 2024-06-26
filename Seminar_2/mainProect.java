package Seminar_2;

public class mainProect {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Петя");
        Human human2 = new Human("Леша");
        Human human3 = new Human("Саша");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
