
import java.util.*;

public class Player
{
    //properties
    private Deck drawPile = new Deck();
    private Deck discardPile = new Deck();;
    private String name = "";

    public Player(int playNum)
    {
        name = "Player " + String.valueOf(playNum);
    }
    //draws a card
    public Card draw()
    {
        return drawPile.deal();
    }
    
    //discard
    public void discard(Card card)
    {
        discardPile.addCard(card);
    }

    //gain a card
    public void getCard(Card card)
    {
        drawPile.addCard(card);
    }

    //restock
    public void restock()
    {
        //shuffle discard
        discardPile.shuffleDeck();
        //set it as hand
        int size = discardPile.cardCount();
        for(int i = 0; i < size; i++)
        {
            drawPile.addCard(discardPile.deal());
        }
    }

    //getters
    public int drawCount()
    {
        return drawPile.cardCount();
    }

    public String getName()
    {
        return name;
    }

    //getters
    public int discCount()
    {
        return discardPile.cardCount();
    }
}
