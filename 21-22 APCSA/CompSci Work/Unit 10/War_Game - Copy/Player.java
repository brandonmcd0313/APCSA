
public class Player
{
    //a player has two decks
    //a draw deck
    private Deck drawPile = new Deck();
    //a discard deck
    private Deck discPile = new Deck();
    //a player has a name
    private String name = "";
    //in or out boolean true = in
    private boolean in = true;

    //the name is assigned based on the players number
    public Player(int i)
    {
        name = "Player " + Integer.toString(i);
    }

    //player can get a card
    public void gainDraw(Card card)
    {
        drawPile.gain(card);
    }

    public void gainDisc(Card card)
    {
        discPile.gain(card);
    }

    //palyer draw
    public Card draw()
    {
        return drawPile.deal();
    }

    //player check
    public boolean check()
    {
        //palyer has no card
        if(drawPile.count() == 0)
        {
            if(discPile.count() > 0)
            {
                //shuffle discard
                discPile.shuffleDeck();
                //set it as hand
                int size = discPile.count();
                for(int i = 0; i < size; i++)
                {
                    drawPile.gain(discPile.deal());
                }
                return true;
            }
            else
            {
                System.out.println(name + " was ELIMINATED!\n");
                return false;
            }
        }

        return true;
    }

    //palyer getters
    public String getName()
    {
        return name;
    }
}
