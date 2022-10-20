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
        //create the deck
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffleDeck();

        //prompt user count
        System.out.print("How many players are playing? : ");
        int playerCount = Integer.parseInt(sc.nextLine());

        //create and populate player array list
        ArrayList<Player> players = new ArrayList<Player>();
        for(int i = 1; i < playerCount + 1; i++)
        {
            players.add(new Player(i));
        }

        //deal cards to player
        int currentPlayer = 0; int card = 0;
        while(deck.cardCount() != 0) //still cards in the deck
        {
            //the player gets the card drawn
            players.get(currentPlayer).getCard(deck.deal());
            if(currentPlayer < players.size()-1) //still players to go
                currentPlayer++; //next player
            else //all players gone
                currentPlayer = 0; //reset the player loop

        }

        //make rank arraylist
        ArrayList<Integer> ranks = new ArrayList<Integer>();
        //make war players array list
        ArrayList<Player> wars = new ArrayList<Player>();
        //make a deck to hold cards on the floor
        Deck floor = new Deck();
        //do a turn while more than one player
        int playSize = players.size();

        boolean randombool = false;
        while(playSize > 1)
        {
            //ALWAYS CHECK AFTER A CARD IS DRAWN

            //each player draws a card and the rank is added
            randombool = check(players);
            for(int i = 0; i < players.size(); i++)
            {
                //draw a card and add it to floor
                floor.addCard(players.get(i).draw());

                //get that cards value and add it to ranks
                ranks.add((floor.getCard(floor.cardCount()-1)).getRank());

                //print it
                System.out.print(players.get(i).getName() + " plays ");
                (floor.getCard(floor.cardCount()-1)).print();
            }

            endTurn(players, ranks, floor, wars);

            //clear rank array list 
            ranks.clear();
            playSize = players.size();
        }
    } //end of method

    static void war(ArrayList<Player> players, ArrayList<Player> wars,
    Deck floor, ArrayList<Integer> ranks)
    {

        //if two players have the highest rank, WAR
        // those two players combat
        ranks.clear();
        System.out.println("WAR!");
        while(!check(wars)) //nobody died
        {
            //draw a civilian
            for(Player player : wars)
            {
                //check them
                if(check(wars))
                    break;
                //draw a card and add it to floor
                floor.addCard(player.draw());
                //check them
                if(check(wars))
                    break;
                //print it
                System.out.print(player.getName() + "'s civilian ");
                (floor.getCard(floor.cardCount()-1)).print();
            }

            //draw a solider
            for(Player player : wars)
            {
                //check them
                if(check(wars))
                    break;
                //draw a card and add it to floor
                floor.addCard(player.draw());
                //check them
                if(check(wars))
                    break;
                //get that cards value and add it to ranks
                ranks.add((floor.getCard(floor.cardCount()-1)).getRank());

                //print it
                System.out.print(player.getName() + "'s soldier ");
                (floor.getCard(floor.cardCount()-1)).print();
            }

            endTurn(players, ranks, floor, wars);
            break;
        }

        if(!check(wars)) //someone dies
        {
            if(wars.size() > 1) //still 2 or more warers
            {
                //call war method
                war(players, wars, floor, ranks);
            }
            else //no die wins
            {
                System.out.println(wars.get(0).getName() + " wins the hand!\n");

                // empty the deck into the player with that rank
                for(int i = 0; i < floor.cardCount(); i++) //traverse cards in floor
                {
                    wars.get(0).discard(floor.deal());
                }
            }
        }
    }

    public static boolean check(ArrayList<Player> players)
    {
        boolean bool = false;
        //for each player
        for(int i = 0; i < players.size(); i++)
        {
            //if player has cards do nothing

            //if player has no cards
            if(players.get(i).drawCount() == 0)
            {
                //if player has discard
                if(players.get(i).discCount() > 0)
                {
                    //run restock method
                    players.get(i).restock();
                }
                //if player has no discard
                else
                {
                    //eliminate player
                    System.out.println(players.get(i).getName() + " was ELIMINATED!");
                    players.remove(players.get(i));
                    i--;
                    bool = true;
                }
            }
        }
        return bool;
    }

    public static void endTurn(ArrayList<Player> players, ArrayList<Integer> ranks, 
    Deck floor, ArrayList<Player> wars)
    {//find the highest rank
        int highest = Collections.max(ranks);
        int where = ranks.indexOf(highest);
        ranks.remove(where);
        //check for duplicates
        if(ranks.indexOf(highest) == -1) //not in list
        {
            System.out.println(players.get(where).getName() + " wins the hand!\n");

            // empty the deck into the player with that rank
            for(int i = 0; i < floor.cardCount(); i++) //traverse cards in floor
            {
                players.get(where).discard(floor.deal());
            }
        }
        //if two players have the highest, war!
        else
        {
            //make the arraylist of warers
            wars.clear();
            wars.add(players.get(where));
            while(ranks.indexOf(highest) != -1)
            {
                wars.add(players.get(ranks.indexOf(highest)));
                ranks.remove(ranks.indexOf(highest));
            }

            //clear ranks
            ranks.clear();

            //call war method
            war(players, wars, floor, ranks);
        }
    }
} //end of class header
