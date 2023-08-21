
public class TicTacToe {
    private Player player;
    private final Location[][] board = new Location[3][3];
    private int turn = 0;

    public TicTacToe() {
        initialize();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean move(int row, int column) {
        if ((row >= 0 && row <= 2) && (column >= 0 && column <= 2) && board[row][column].getValue().equals("-")) {
            board[row][column].setValue(player.getValueAssigned());
            turn++;
            return true;
        }
        return false;
    }

    public void switchPlayer(Player p1, Player p2) {
        switch (turn % 2) {
            case 0 -> this.setPlayer(p1);
            case 1 -> this.setPlayer(p2);
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + board[i][j]);
            }
            System.out.println("\n");
        }
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0].equals(board[i][1])) && (board[i][1].equals(board[i][2]))) {
                return true;
            }
            if ((board[0][i].equals(board[1][i])) && (board[1][i].equals(board[2][i]))) {
                return true;
            }
        }
        if ((board[0][0].equals(board[1][1])) && (board[1][1].equals(board[2][2]))) {
            return true;
        }
        if ((board[0][2].equals(board[1][1])) && (board[1][1].equals(board[2][0]))) {
            return true;
        }
        return false;
    }

    public boolean checkTie() {
        if (turn == 9 && !this.checkWin()) {
            return true;
        }
        return false;
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Location();
            }
        }
    }
}
