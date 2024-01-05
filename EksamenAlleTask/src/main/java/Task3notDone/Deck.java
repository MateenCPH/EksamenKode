package Task3notDone;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    protected ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        makeDeck(cards);
        //shuffleDeck();
    }

    public void makeDeck(ArrayList<Card> cards){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits){
            for (int rank = 1; rank <= 13; rank++){
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        System.out.println(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    /*private void shuffleDeck(){
        Collections.shuffle(cards);
        System.out.println(cards);
    }*/

}
