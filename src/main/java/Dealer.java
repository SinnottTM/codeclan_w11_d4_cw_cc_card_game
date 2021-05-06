import java.util.ArrayList;

public class Dealer {

    private Deck deck;

    public Dealer(){
        this.deck = new Deck();
        this.deck.populateDeck();
        this.deck.shuffle();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public void dealCard(ArrayList<Player> players) {

        for (Player player : players) {

            PlayingCard dealtCard = this.deck.removeFirstCard();
            player.addCard(dealtCard);
        }
    }

}
