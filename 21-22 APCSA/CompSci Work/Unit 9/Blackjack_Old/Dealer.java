import java.util.*;

public class Dealer extends Player
{

    //dealer needs special print
    public void printHand()
    {
        System.out.println();
        System.out.println("Dealers hand: ");
        //print visual card
        hand.get(0).print();
        //print non visable
        for(int i = 0; i < hand.size()-1; i++)
            System.out.println("? Mystery Card ?");
        System.out.println();
    }

    //dealer turn "AI"
    static void turn(ArrayList<Card> deck)
    {
    }
}
//print for bust

//dealer needs reset

