import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Dealer dealer;

    public Game() {
        this.players = new ArrayList<>();
        this.dealer = new Dealer();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public int countPlayers() {
        return this.players.size();
    }

    public Player playGame() {
        if (players.size() == 0) {
            return null;
        }
        this.dealer.dealCard(this.players);
        return calculateWinner();
    }

//    Method for two player game, works, checks draws

//    public Player calculateWinner2Player() {
//        int cardValue1 = players.get(0).getCard().getRank().getValue();
//        int cardValue2 = players.get(1).getCard().getRank().getValue();;
//        Player winner = null;
//        if (cardValue1 > cardValue2) {
//            winner = players.get(0);
//        } else if (cardValue1 < cardValue2){
//            winner = players.get(1);
//        } else {
//            playGame();
//        }
//        return winner;
//    }

    public Player calculateWinner() {
        Player winner = new Player("Test");
        ArrayList multipleWinners = new ArrayList();
        int winningNum = 0;
        for (Player player : this.players) {
            if (player.getCard().getRankValue() == winningNum) {
                multipleWinners.add(player);}

            if (player.getCard().getRankValue() > winningNum) {
                winner.setHand(player.getHand());
                winner.setName(player.getName());
                winningNum = player.getCard().getRankValue();
                    if (multipleWinners.size() > 0) {
                        playGame();
                    }
            }
        } return winner;
    }
}


//        int max = Collections.max(cardValues);
//
//        if (maxNums.size() > 1){
//            playGame();
//        }
//        return this.players.get(cardValues.indexOf(max));
//    }
