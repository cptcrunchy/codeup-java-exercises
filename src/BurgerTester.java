public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools burger = new BurgerTools();

        burger.setMostPopularTopping("Lettuce");
        burger.setAverageDaysBeforeExpiration(100);
        burger.setTemperatureWhenCooked(200);
        burger.grill();
    }
}
