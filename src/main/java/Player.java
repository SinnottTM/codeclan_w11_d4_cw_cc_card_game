import java.util.ArrayList;

public class Player {

    private ArrayList<PlayingCard> hand;

    public Player() {
        this.hand = new ArrayList<PlayingCard>();
    }

    public int countHand() {
        return this.hand.size();
    }

    public void addCard(PlayingCard card) {
        this.hand.add(card);
    }

    public PlayingCard getCard() {
        return this.hand.get(0);
    }
}