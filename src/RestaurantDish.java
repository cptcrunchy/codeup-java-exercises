public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        setCostInCents(costInCents);
        setNameOfDish(nameOfDish);
        setWouldRecommend(wouldRecommend);
    }

    public RestaurantDish(int costInCents) {
        this(costInCents, "No name provided", true);
    }

    public RestaurantDish(String nameOfDish) {
        this(0, nameOfDish, true);
    }

    public void eat() {
        System.out.println("Nom nom nom!");
    }
}
