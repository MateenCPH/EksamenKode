package Task3notDone;

public class Card {

    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rankToString(rank) + " of " + suit + "\n";
    }

    private String rankToString(int rank) {
        switch (rank) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Es";
            default:
                return Integer.toString(rank);
        }
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
