package Task3notDone;

import java.util.ArrayList;

public class Game {
    private Deck deck;
    private ArrayList<Card> cards;

    public Game() {
        this.deck = new Deck(cards);
        this.cards = new ArrayList<>();
        deck.makeDeck(cards);
    }

    public Card drawCard(){
        if (!cards.isEmpty()){
            return cards.remove(cards.size() - 1);
        }else{
            System.out.println("The deck is empty");
            return null;
        }
    }
}
