package Task3notDone;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards){
        this.cards = new ArrayList<>();
        //makeDeck();
        //shuffleDeck();
    }

    public void makeDeck(ArrayList<Card> cards){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits){
            for (int rank = 1; rank <= 14; rank++){
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        System.out.println(cards);
    }

    private void shuffleDeck(){
        Collections.shuffle(cards);
        System.out.println(cards);
    }

    /*public Card drawCard(){
        if (!cards.isEmpty()){
            return cards.remove(cards.size() - 1);
        }else{
            System.out.println("The deck is empty");
            return null;
        }
    }*/
}
