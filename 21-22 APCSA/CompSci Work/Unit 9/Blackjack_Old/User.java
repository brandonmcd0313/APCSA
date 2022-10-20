import java.util.*;

public class User extends Player
{
   
    //user needs print
    public void printHand()
    {
        System.out.println();
        System.out.println("Your hand: ");
        for(Card card : hand)
        {
            card.print();
        }
        System.out.println("Your score: " + score);
        System.out.println();
    }
}

