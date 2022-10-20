// Brandon McDonald
// Date:
// Purpose: 

import java.util.*; //import all util classes

public class PlayBlackJack //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);

    //create a deck array list
    static ArrayList<Card> deck = new ArrayList<Card>();

    //create a dealer and user
    static User player = new User();
    static Dealer house = new Dealer();

    //continuation booleans
    static boolean playing = true;
    static boolean turning = true;
    static void main(String[] args) throws InterruptedException //method header
    {
        //create the deck
        createDeck();

        while(playing)
        {
            //create hands and deal cards
            deal();

            while(turning)
            {
                //take a turn
            }
        }
    }//end of method

    static void createDeck()
    {
        //nested for loop populating ArrayList (creating deck)
        for(int i = 0; i < 4; i++) //suit
        {
            //create local variables that change throughout the loops
            String suit = ""; int rank = 0;
            //set appropriate suit in the local String
            {
                if(i == 0)
                    suit = "Spades ♠";
                else if(i == 1)
                    suit = "Hearts ♥";
                else if(i == 2)
                    suit = "Clubs ♣";
                else if(i == 3)
                    suit = "Diamonds ♦";
            }

            for(int j = 2; j < 15; j++)
                deck.add(new Card(suit, j));

        }

        //the ultimate shuffle machine
        Collections.shuffle(deck, new Random((int)(Math.random()*(10000000-500+1)+500)));

    }

    static void deal()
    {
        //deal 2 cards each
        player.draw(deck);
        house.draw(deck);

        player.draw(deck);
        house.draw(deck);

        turning = true;

        //end the turn
        endTurn();

    }

    static void turn()
    {
        System.out.print("Would you like to hit(h) or stand(s): ");
        String choice = sc.nextLine();
        boolean annoy = true;
        while(annoy)
        {
            if(choice.equalsIgnoreCase("h"))
            {
                player.draw(deck); 
                annoy = false;
            }
            else if(choice.equalsIgnoreCase("s"))
            {
                //no draw
                annoy = false;
            }
            else //bad answer
            {
                System.out.print("WRONG ANSWER, TRY AGAIN: "); 
                choice = sc.nextLine();
            }
        }
        
        house.turn(deck);
        
        endTurn();
    }

    static void endTurn()
    {
        while(true)
        {
            //calculate Scores and make sure no bust
            if(house.scoreCalc()) //house busted
            {
                System.out.println("The House Busted!");
                printAll();
                //if bust end round 
                reset();
                break;
            }

            if(player.scoreCalc()) //player busted
            {
                System.out.println("You Busted!");
                printAll();
                //if bust end round 
                reset();
                break;
            }

            //if reached here nobody busted
            printAll();
            break;
        }
    }

    static void printAll()
    {
        house.printHand();
        player.printHand();
    }

    static void reset()
    {
        turning = false;
    }

} //end of class header
