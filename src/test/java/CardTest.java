import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    PlayingCard card;

    @Before
    public void before(){
        card = new PlayingCard(Suit.HEARTS, Rank.SEVEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canSetSuit(){
        card.setSuit(Suit.CLUBS);
        assertEquals(Suit.CLUBS, card.getSuit());}

    @Test
    public void cannotHaveWrongSuit(){
        PlayingCard wrongSuit = new PlayingCard(Suit.HEARTS, Rank.QUEEN);
            assertNotEquals(Suit.CLUBS, wrongSuit.getSuit());}

    @Test
    public void canGetCardRank(){
        assertEquals(Rank.SEVEN, card.getRank());}

    @Test
    public void canSetCardRank(){
        card.setRank(Rank.ACE);
        assertEquals(Rank.ACE, card.getRank());}

    @Test
    public void cannotHaveWrongRank(){
        PlayingCard wrongRank = new PlayingCard(Suit.HEARTS, Rank.QUEEN);
        assertNotEquals(Rank.EIGHT, wrongRank.getRank());}

    @Test
    public void canGetTheValueOfARank(){
        assertEquals(7, card.getRankValue());}

    @Test
    public void canSetTheValueOfARank(){
        card.setRankValue(8);
        assertEquals(8, card.getRankValue());}



}
