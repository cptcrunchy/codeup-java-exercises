import util.Input;

import java.util.Arrays;

public class TicTacToe {
    public static String[][] board = {
            {"   ", "  A  ", "  B  ", "  C  "},
            {" 1 ", " --- ", " --- ", " --- "},
            {" 2 ", " --- ", " --- ", " --- "},
            {" 3 ", " --- ", " --- ", " --- "}
    };
    public static Input input = new Input();
    public static String[] moves = {"1a","1b","1c","2a","2b","2c","3a","3b","3c"};
    public static final String playerOne = " -X- ";
    public static final String playerTwo = " -0- ";
    public static String playerOneChoice;
    public static String playerTwoChoice;
    public static int totalTurns = 0;

    //           1a = board[1][1]
    //           1b = board[1][2]
    //           1c = board[1][3]
    //           2a = board[2][1]
    //           2b = board[2][2]
    //           2c = board[2][3]
    //           3a = board[3][1]
    //           3b = board[3][2]
    //           3c = board[3][3]

    public static void main(String[] args) {
        gameBoard();
        System.out.println("\n[PLAYER ONE] You are 0's");
        System.out.println("[PLAYER TWO] You are X's\n");

        while(totalTurns <= 9) {
            System.out.print("[PLAYER ONE] Enter your choice: ");
            playerOneChoice = input.getString();

            updateBoard(playerOneChoice, playerOne);

            System.out.print("[PLAYER TWO] Enter your choice: ");
            playerTwoChoice = input.getString();

            updateBoard(playerTwoChoice, playerTwo);

            totalTurns++;
        }
    }

    public static void gameBoard() {
        for (String[] row : board) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void updateBoard(String position, String player) {
        for (String move : moves) {
            if (position.equals(move)) {
                if (move.equals("1a")) {
                    board[1][1] = player;
                } else if (move.equals("1b")) {
                    board[1][2] = player;
                } else if (move.equals("1c")) {
                    board[1][3] = player;
                } else if (move.equals("2a")) {
                    board[2][1] = player;
                } else if (move.equals("2b")) {
                    board[2][2] = player;
                } else if (move.equals("2c")) {
                    board[2][3] = player;
                } else if (move.equals("3a")) {
                    board[3][1] = player;
                } else if (move.equals("3b")) {
                    board[3][2] = player;
                } else if (move.equals("3c")) {
                    board[3][3] = player;
                }
            }
        }
        gameBoard();
    }
}
