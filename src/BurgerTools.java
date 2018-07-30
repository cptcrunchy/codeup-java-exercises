public class BurgerTools {
    private String mostPopularTopping;
    private int averageDaysBeforeExpiration;
    private int temperatureWhenCooked;

    public String getMostPopularTopping() {
        return mostPopularTopping;
    }

    public int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }

    public int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }

    public void setMostPopularTopping(String mostPopularTopping) {
        this.mostPopularTopping = mostPopularTopping;
    }

    public void setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration) {
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
    }
    public void setTemperatureWhenCooked(int temperatureWhenCooked) {
        this.temperatureWhenCooked = temperatureWhenCooked;
    }

    public void grill () {
        System.out.println("Grilling burger");
    }
}
