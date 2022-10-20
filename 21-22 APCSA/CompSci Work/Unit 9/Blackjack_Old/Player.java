import java.util.*;

public class Player
{
    //properties
    //user has a hand
    protected ArrayList<Card> hand = new ArrayList<Card>();
    //user has a score
    protected int score;

    //user can draw
    public void draw(ArrayList<Card> deck)
    {
        //draw a card
        hand.add(deck.get(0));
        //remove it from the deck
        deck.remove(0);
    }

    //user needs score calculator (Also tells if bust or not)
    public boolean scoreCalc()
    {
        //reset score
        score = 0;
        //traverse arraylist and calculate score
        for(Card card : hand)
        {
            score += card.getRank();

        }
        //score is now set, see if bust or not

        //but first, ace handling
        for(Card card : hand)
        {
            if(card.getName().equals("Ace"))
            {
                if(score > 10)
                    card.setRank(1);
                else
                    card.setRank(11);
            }
        }

        if(score > 21) //did bust
            return true;

        else //did not bust
            return false;
    }

}
