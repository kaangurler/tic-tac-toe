import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final TicTacToe ticTacToe = new TicTacToe();
    private Player p1;
    private Player p2;

    public void menu() {
        this.preGameSelection();
        while (!ticTacToe.checkWin() && !ticTacToe.checkTie()) {
            ticTacToe.switchPlayer(p1, p2);
            System.out.println("Turn: " + ticTacToe.getPlayer());
            ticTacToe.displayBoard();
            do {
                System.out.println("Row-Column(0-1-2)");
            } while (!ticTacToe.move(scanner.nextInt(), scanner.nextInt()));
        }
        ticTacToe.displayBoard();
        this.gameResult();
    }

    private void gameResult() {
        System.out.print("GAME OVER. ");
        if (ticTacToe.checkWin()) {
            System.out.println(ticTacToe.getPlayer() + " has won");
        } else {
            System.out.println("Game has tied");
        }
    }

    private void preGameSelection() {
        String name;
        System.out.print("Name of P1: ");
        name = scanner.next();
        p1 = new Player(name, "X");
        System.out.print("Name of P2: ");
        name = scanner.next();
        p2 = new Player(name, "O");
    }
}
