import java.util.Scanner;

public class TicTacToeTest {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        System.out.print("Player one enter your name: ");
        game.setPlayerOneName(input.nextLine());
        System.out.print("Player two enter your name: ");
        game.setPlayerTwoName(input.nextLine());
        System.out.printf("[%s] You are 0's\n", game.getPlayerOneName());
        System.out.printf("[%s] You are X's\n\n", game.getPlayerTwoName());
        game.displayBoard();

        while (game.maxTurns >= 0) {
            // --- Player One ---
            System.out.printf("[%s] Enter your move: ", game.getPlayerOneName());
            game.setMove(input.nextLine());
            checkForAcceptableMoves(game);
            game.setMoveOnBoard(game.getMove(), game.getPlayerOneName());
            game.displayBoard();
            if (game.checkForWin()) {
                break;
            }
            game.maxTurns--;
            // --- Player One ---

            // Last turn becomes 0 here
            if (game.maxTurns == 0) {
                System.out.println("Nobody wins.");
                break;
            }

            // --- Player Two ---
            System.out.printf("[%s] Enter your move: ", game.getPlayerTwoName());
            game.setMove(input.nextLine());
            checkForAcceptableMoves(game);
            game.setMoveOnBoard(game.getMove(), game.getPlayerTwoName());
            game.displayBoard();
            if (game.checkForWin()) {
                break;
            }
            game.maxTurns--;
            // --- Player Two ---
        }
        System.out.println("Would you like to play again?[y/n]: ");
        String playAgain = input.nextLine();

        if (playAgain.trim().toLowerCase().equals("y") || playAgain.trim().toLowerCase().equals("yes")) {
            TicTacToeTest.main(new String[0]);
        } else {
            System.exit(0);
        }
    }

    // Check for move that is acceptable and move that has already been made
    public static String checkForAcceptableMoves(TicTacToe game) {
        if (game.isAcceptable(game.getMove())) {
            while (game.isAcceptable(game.getMove())) {
                System.out.println("Not an acceptable move.");
                System.out.print("Please enter another: ");
                game.setMove(input.nextLine());
            }
        }
        if (game.isAMoveAlreadyMade(game.getMove())) {
            while (game.isAMoveAlreadyMade(game.getMove())) {
                System.out.printf("The move %s has already been made\n", game.getMove());
                System.out.print("Enter another move: ");
                game.setMove(input.nextLine());
            }
        }
        return game.getMove();
    }
}
