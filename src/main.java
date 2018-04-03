import bag.Bag;
import board.Board;
        import game.Game;
        import player.Player;

public class main {
    public static void main(String args[]) {
        Game game = new Game();
        game.setBag(new Bag());
        game.setBoard(new Board());
        game.addPlayer(new Player("Player 1"));
        game.addPlayer(new Player("Player 2"));
        game.addPlayer(new Player("Player 3"));
        game.start();
    }
}
