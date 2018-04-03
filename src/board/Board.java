package board;

import player.Player;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<String> letters;

    public  Board(){
        letters=new ArrayList<String>();
    }

    public synchronized void  addWord(Player player, String word){
        letters.add(word);
        System.out.println("Player " + player.getName() + " submited the word " + word );

    }
}
