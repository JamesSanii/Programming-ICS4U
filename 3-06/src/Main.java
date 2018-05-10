
public class Main {
	public static void main(String[] args) {
		TicTacTow game = new TicTacTow();
		System.out.println("Can you beat the unbeatable tic-tac-toe game");
		game.showGame();
		game.placement("X");
		game.showGame();
		game.placement("X");
		game.showGame();

	}
}
