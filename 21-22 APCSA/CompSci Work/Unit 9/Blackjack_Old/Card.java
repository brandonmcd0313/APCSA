
public class Card
{
    private String name, suit;
    private int rank;

    //constructor
    public Card(String suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
        toName(rank); //set name
        if(rank > 10)
            this.rank = 10; //highest value is 10
        if(rank == 14)
            this.rank = 1;
    }

    //method to turn rank into name
    private void toName(int rank)
    {
        if(rank == 2)
            this.name = "Two";
        else if(rank == 3)
            this.name = "Three";
        else if(rank == 4)
            this.name = "Four";
        else if(rank == 5)
            this.name = "Five";
        else if(rank == 6)
            this.name = "Six";
        else if(rank == 7)
            this.name = "Seven";
        else if(rank == 8)
            this.name = "Eight";
        else if(rank == 9)
            this.name = "Nine";
        else if(rank == 10)
            this.name = "Ten";
        else if(rank == 11)
            this.name = "Jack";
        else if(rank == 12)
            this.name = "Queen";
        else if(rank == 13)
            this.name = "King";
        else if(rank == 14)
            this.name = "Ace";
    }

    public void print()
    {
        System.out.println("The " + this.name + " (" + this.rank +
            ") of " + this.suit + ".");
    }

    //ace molder
    public void setRank(int value)
    {
        this.rank = value;
    }

    //getter methods?
    public String getSuit()
    {
        return this.suit;
    }

    public String getName()
    {
        return this.name;
    }
    
    public int getRank()
    {
        return this.rank;
    }
}
