package Task3notDone;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    protected ArrayList<Card> deck;

    public Game() {
          Deck fullDeck = new Deck();
          deck = fullDeck.getCards();
//        this.myDeck = new ArrayList<>();
//        deck.makeDeck(myDeck);
    }

    public int drawCard(){
        Random random = new Random();
        if (!deck.isEmpty()){
            return random.nextInt(deck.size());
        }else{
            System.out.println("The deck is empty");
            return 0;
        }
    }

    public void removeCard(Card card){
        deck.remove(card);
    }
}
