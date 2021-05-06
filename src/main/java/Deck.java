import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<PlayingCard> cards;

    public Deck() {
        this.cards = new ArrayList<PlayingCard>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public PlayingCard removeFirstCard(){
        return this.cards.remove(0);
    }

    public void populateDeck() {

        for (Suit suit : Suit.values()) {

            for (Rank rank : Rank.values()) {

                PlayingCard card = new PlayingCard(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public boolean linearSearch(PlayingCard searchCard) {
        for (PlayingCard card : this.cards) {
            if(card == searchCard) {
                return true;
            }
        }
        return false;
    }

    public PlayingCard findCard(int index) {
        return this.cards.get(index);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }


}
