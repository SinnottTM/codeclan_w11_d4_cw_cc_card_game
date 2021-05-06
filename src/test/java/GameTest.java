import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
public class GameTest {

    private Game game;

    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;

    private ArrayList<Player> players;

    @Before
    public void setUp(){
        game = new Game();
        player1 = new Player("Alex");
        player2 = new Player("Tim");
        player3 = new Player("Ted");
        player4 = new Player("Alexis");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
    }
    @Test
    public void hasFourPlayers(){
        assertEquals(4, game.countPlayers());
    }
    @Test
    public void canDealCardsToPlayers(){
        game.getDealer().dealCard(game.getPlayers());
        assertEquals(1, player1.countHand());
        assertEquals(1, player2.countHand());
        assertEquals(1, player3.countHand());
        assertEquals(1, player4.countHand());
        assertEquals(48, game.getDealer().getDeck().countCards());
    }
    @Test
    public void canCalcWinner(){
        game.playGame();
        System.out.println(player1.getName()+ " " + player1.getCard().getRankValue() + " " + player1.getCard().getSuit());
        System.out.println(player2.getName()+ " " + player2.getCard().getRankValue() + " " + player2.getCard().getSuit());
        System.out.println(player3.getName()+ " " + player3.getCard().getRankValue() + " " + player3.getCard().getSuit());
        System.out.println(player4.getName()+ " " + player4.getCard().getRankValue() + " " + player4.getCard().getSuit());
        System.out.println(game.calculateWinner().getName());
    }
}