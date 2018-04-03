package player;

import game.Game;

import java.util.List;
import java.util.Queue;

public class Player implements Runnable {
    private String name;
    private Game game;
    public Player(String name){
        this.name=name;
    }
    private  boolean createSubmitWord() throws InterruptedException {
        List extracted = game.getBag().extractLetters(1);
        if (extracted.isEmpty()) {
            return false;
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            word.append(extracted.get(0));
        }
        game.getBoard().addWord(this, word.toString());
        Thread.sleep(300);
        return true;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public void run() {
        int i;
        while (game.getBag().getLetters().isEmpty()==false) {
            char letter = game.getBag().extractLetters(1).get(0);
            String word = new String();
            for (i = 0; i <= 9; i++)
                word = word + letter;
            game.getBoard().addWord(this, word);
        }

    }

    @Override
    public String toString() {
        return "It's player's " + this.getName() + "  turn.";
    }
    //implement the run() method, that will repeatedly create and submit words
    //implement the toString() method
}