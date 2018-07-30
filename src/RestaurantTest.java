public class RestaurantTest {

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish("Spaghetti and Meatballs");
//        dish.setNameOfDish("Spaghetti");
//        dish.setCostInCents(30000);
//        dish.setWouldRecommend(false);

        System.out.println(dish.getNameOfDish());
        System.out.println(dish.getCostInCents());
        System.out.println(dish.isWouldRecommend());
        dish.eat();
    }
}
