import java.util.ArrayList;
import java.util.HashMap;

public class TicTacToe {
    public String[][] board = {
            {"   ", "  A  ", "  B  ", "  C  "},
            {" 1 ", " --- ", " --- ", " --- "},
            {" 2 ", " --- ", " --- ", " --- "},
            {" 3 ", " --- ", " --- ", " --- "}
    };
    public int maxTurns = 9;
    public ArrayList<String> currentMoves = new ArrayList<>();
    private String playerOneName;
    private String playerTwoName;
    private String move;
    private final String[] acceptableMoves = {"1a", "1b", "1c", "2a", "2b", "2c", "3a", "3b", "3c"};
    private final String winO = " -0-  -0-  -0- ";
    private final String winX = " -X-  -X-  -X- ";

    public String getPlayerOneName() {
        return playerOneName;
    }

    public void setPlayerOneName(String playerOneName) {
        this.playerOneName = playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public void setPlayerTwoName(String playerTwoName) {
        this.playerTwoName = playerTwoName;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    public void displayBoard() {
        for (String[] row : this.board) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public boolean isAcceptable(String move) {
        boolean flag = true;
        for (int i = 0; i < acceptableMoves.length; i++) {
            if (move.equals(acceptableMoves[i])) {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isAMoveAlreadyMade(String move) {
        boolean flag = false;
        if (currentMoves.contains(move)) {
            flag = true;
        }
        return flag;
    }

    public void setMoveOnBoard(String move, String player) {
        if (player.equals(this.playerOneName)) {
            player = " -0- ";
        } else {
            player = " -X- ";
        }

        currentMoves.add(move);
        switch (move) {
            case "1a":
                board[1][1] = player;
                break;

            case "1b":
                board[1][2] = player;
                break;

            case "1c":
                board[1][3] = player;
                break;

            case "2a":
                board[2][1] = player;
                break;

            case "2b":
                board[2][2] = player;
                break;

            case "2c":
                board[2][3] = player;
                break;

            case "3a":
                board[3][1] = player;
                break;

            case "3b":
                board[3][2] = player;
                break;

            case "3c":
                board[3][3] = player;
                break;
        }
    }

    public boolean checkForWin() {
        HashMap<String, String> winningMoves = new HashMap<>();
        winningMoves.put("top", board[1][1]+board[1][2]+board[1][3]);
        winningMoves.put("right", board[1][3]+board[2][3]+board[3][3]);
        winningMoves.put("bottom", board[3][1]+board[3][2]+board[3][3]);
        winningMoves.put("left", board[1][1]+board[2][1]+board[3][1]);
        winningMoves.put("middle", board[1][2]+board[2][2]+board[3][2]);
        winningMoves.put("xLeftToRight", board[1][1]+board[2][2]+board[3][3]);
        winningMoves.put("xRightToLeft", board[1][3]+board[2][2]+board[3][1]);

        if (winningMoves.containsValue(this.winO)) {
            System.out.printf("\n|======%s is the WINNER!======|\n", this.playerOneName);
            return true;
        } else if (winningMoves.containsValue(this.winX)) {
            System.out.printf("\n|======%s is the WINNER!======|\n", this.playerTwoName);
            return true;
        }

        return false;
    }
}
