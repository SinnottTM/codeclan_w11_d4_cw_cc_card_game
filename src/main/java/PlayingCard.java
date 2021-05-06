public class PlayingCard {

    private Suit suit;
    private Rank rank;

    public PlayingCard(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getRankValue() {
        return this.rank.getValue();
    }

    public void setRankValue(int newValue){
        this.rank.setValue(newValue);
    }
}
