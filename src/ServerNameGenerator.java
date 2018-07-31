import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjs = {"abrupt", "stiff", "tense", "wide-eyed", "broad", "wealthy", "envious", "resolute", "clammy", "violent"};
    public static String[] nouns = {"engine", "oven", "reaction", "point", "glove", "chess", "reward", "aftermath", "nose", "van"};
    public static Random rand = new Random();

    public static String getElement(String[] array) {
        int randNum = rand.nextInt(9);
        return array[randNum];
    }

    public static void main(String[] args) {
        String adj = getElement(adjs);
        String noun = getElement(nouns);

        System.out.println("Here is your server name: ");
        System.out.printf("%s-%s", adj, noun);
    }
}