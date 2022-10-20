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
        //allow the user to choose a number of players
        System.out.print("How many players are playing?: ");
        int playerCount = Integer.parseInt(sc.nextLine());
        System.out.print("How many runs?: ");
        int runs = Integer.parseInt(sc.nextLine());
        int total = 0;
        for(int t = 0; t < runs; t++)
        {
            Deck deck = new Deck();
            deck.createDeck();
            deck.shuffleDeck();

            //create a waring players array list for later]
            ArrayList <Player> wars = new ArrayList <Player>();

            //create the players and their arraylist
            ArrayList <Player> players = new ArrayList <Player>();

            for(int i = 1; i <= playerCount; i++)
            {
                players.add(new Player(i));
            }

            //deal the cards to the players
            int playerCounter = 0;
            while(deck.count() > 0)
            {
                if(playerCounter == playerCount)
                    playerCounter = 0;
                else
                {
                    players.get(playerCounter).gainDraw(deck.deal());
                    playerCounter++;
                }
            }

            //create a deck called floor
            Deck floor = new Deck();
            //each player draws a card and adds it to the floor
            //the ranks in the floor are added to a rank arraylist
            ArrayList <Integer> ranks = new ArrayList <Integer>();

            ArrayList <Integer> warRanks = new ArrayList <Integer>();

            int gameTrack = 0;
            while(players.size() > 1)
            {
                if(check(players, wars) && players.size() == 1) //someone dies 1 remains
                {
                    break;
                }
                for(Player player : players)
                {
                    floor.gain(player.draw());
                    System.out.print(player.getName());
                    System.out.print(" plays the ");
                    floor.getCard().print();
                    ranks.add(floor.getCard().getRank());
                }

                //the position of the rank in rank arraylist
                // should equal the player in player arraylist

                //find the max value in the rank arraylist
                int max = Collections.max(ranks);
                int where = ranks.indexOf(max);
                //set a dupe loop boolean
                boolean dupeLoop = true;

                //add the current max to wars
                wars.add(players.get(where));
                //remove the max than check for duplicates
                while(dupeLoop)
                {
                    ranks.remove(where);
                    if(ranks.indexOf(max) != -1 && wars.size() == 1) //dupes
                    {
                        wars.add(players.get((ranks.indexOf(max)+1)));
                        where = ranks.indexOf(max);
                    }
                    else if(ranks.indexOf(max) != -1)
                    {
                        wars.add(players.get((ranks.indexOf(max)+wars.size())));
                        where = ranks.indexOf(max);
                    }
                    else
                    {
                        dupeLoop=false;
                    }

                }

                //give the cards to the winner if only one
                if(wars.size() == 1)
                {
                    System.out.println(wars.get(0).getName() + " wins the hand!\n");
                    while(floor.count() > 0)
                    {
                        wars.get(0).gainDisc(floor.deal());
                    }
                }
                else //WAR TIME
                {
                    Player winner = war(floor, wars, players);
                    if(winner.getName().equalsIgnoreCase("Player 666"))
                    {
                        System.out.println("That was a crap war so here uhhh.... "
                            + players.get(ranks.indexOf(Collections.max(ranks))).getName()
                            + " you get the pot!\n");

                        while(floor.count() > 0)
                        {
                            players.get(ranks.indexOf(Collections.max(ranks))).gainDisc(floor.deal());
                        }
                    }
                    while(floor.count() > 0)
                    {
                        winner.gainDisc(floor.deal());
                    }
                }

                //clear everythin
                ranks.clear();
                wars.clear();
                warRanks.clear();
                //Thread.sleep(50); //so it aint super speed 4 testing
                gameTrack++;
            }

            System.out.println(players.get(0).getName() + " WINS THE GAME!!!!");
            System.out.println("The game was " + gameTrack + " rounds long!");
            total += gameTrack;
            players.clear(); ranks.clear(); wars.clear(); gameTrack = 0;
        }
        System.out.println("\n\n Out of " + runs + " the average on was " + total/runs + " rounds long!");
    } //end of method

    static boolean check(ArrayList <Player> players, ArrayList <Player> wars)
    {
        ArrayList <Player> playerKill = new ArrayList <Player>();
        for(Player player : players)
        {
            if(!player.check())
            {
                playerKill.add(player);
            }
        }

        boolean holder = false;
        if(playerKill.size() > 0)
            holder = true;

        for(Player deadguy : playerKill)
        {
            players.remove(deadguy);
            if(wars.contains(deadguy))
            {
                wars.remove(deadguy);
            }
        }

        playerKill.clear();

        return holder;
    }

    static Player war(Deck floor, ArrayList <Player> wars, ArrayList <Player> players)
    {
        System.out.println("WAR!");
        ArrayList <Player> warHolder = new ArrayList <Player>();
        ArrayList <Integer> warRanks = new ArrayList <Integer>();
        warHolder.clear(); warRanks.clear();

        if(check(wars, players) && wars.size() == 1)
        {
            return wars.get(0);
        }
        else if(wars.size() == 0)
        {
            return new Player(666);
        }

        for(Player player : wars)
        {
            floor.gain(player.draw());
            System.out.print(player.getName());
            System.out.print("'s civilian is the ");
            floor.getCard().print();
        }

        if(check(wars, players) && wars.size() == 1)
        {
            return wars.get(0);
        }
        else if(wars.size() == 0)
        {
            return new Player(666);
        }

        for(Player player : wars)
        {
            floor.gain(player.draw());
            System.out.print(player.getName());
            System.out.print("'s soldier is the ");
            floor.getCard().print();
            warRanks.add(floor.getCard().getRank());
        }

        //find the max value in the rank arraylist
        int max = Collections.max(warRanks);
        int where = warRanks.indexOf(max);
        //set a dupe loop boolean
        boolean dupeLoop = true;

        //add the current max to wars
        warHolder.add(wars.get(where));
        //remove the max than check for duplicates
        while(dupeLoop)
        {
            warRanks.remove(where);
            if(warRanks.indexOf(max) != -1) //dupes
            {
                warHolder.add(wars.get((warRanks.indexOf(max)+1)));
            }
            else
            {
                dupeLoop=false;
            }

        }

        //give the cards to the winner if only one
        if(warHolder.size() == 1)
        {
            System.out.println(warHolder.get(0).getName() + " wins the war!\n");
            return(warHolder.get(0));
        }
        else //WAR TIME
        {
            return war(floor, warHolder, players); //recurses till winner
        }

    }
} //end of class header
