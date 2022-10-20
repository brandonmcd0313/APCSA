// Brandon McDonald
// Date: 3-2-22
// Purpose: Create a deck of cards and shuffle it.

import java.util.*; //import all util classes

public class Tester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffleDeck();
        
        //print shuffled deck
        for (int i = 0; i < 52; i++)
        {
            deck.deal().print();
        }

    } //end of method
} //end of class header
