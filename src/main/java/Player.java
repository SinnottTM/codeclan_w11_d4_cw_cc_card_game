import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<PlayingCard> hand;

    public Player(String name) {
        this.name = name;
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

    public String getName() {
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public ArrayList<PlayingCard> getHand(){
        return this.hand;
    }

    public void setHand(ArrayList<PlayingCard> newHand){
        this.hand = newHand;
    }
}