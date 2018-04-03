package game;

import bag.Bag;
import board.Board;
import player.Player;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Game {
    private Bag bag;
    private Board board;
    private Dictionary dictionary;
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public Bag getBag() {
        return bag;
    }
    public void start () {
        int i;
        for (i = 0; i < getPlayers().size(); i++) {
                new Thread(getPlayers().get(i)).start();
            }


    }

    public List<Player> getPlayers() {
        return players;
    }
    //Create getters and setters
    //Create the method that will start the game: start one thread for each player
}