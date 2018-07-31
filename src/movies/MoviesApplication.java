package movies;

import util.Input;

public class MoviesApplication {
    public static Input input = new Input();
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        String keepGoing;
        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");
            System.out.print("Enter your choice: ");
            String choice = input.getString();

            keepGoing = showMovies(choice);
        } while (keepGoing.equals("y") || keepGoing.equals("yes"));
    }

    public static String showMovies(String userChoice) {
        for (Movie movie: movies) {
            String name = movie.getName();
            String category = movie.getCategory();

            if (userChoice.equals("1")) {
                System.out.printf("%s --- %s\n", name, category);
            } else if (userChoice.equals("2") && category.equals("animated")) {
                System.out.printf("%s --- %s\n", name, category);
            } else if (userChoice.equals("3") && category.equals("drama")) {
                System.out.printf("%s --- %s\n", name, category);
            } else if (userChoice.equals("4") && category.equals("horror")) {
                System.out.printf("%s --- %s\n", name, category);
            } else if (userChoice.equals("5") && category.equals("scifi")) {
                System.out.printf("%s --- %s\n", name, category);
            }
        }

        System.out.print("Would you like to see another category? [y/n]: ");
        return input.getString();
    }
}