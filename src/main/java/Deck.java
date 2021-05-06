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

    public void dealCard(ArrayList<Player> players) {

        for (Player player : players) {

            PlayingCard dealtCard = this.cards.remove(0);
            player.addCard(dealtCard);
        }

    }
}
