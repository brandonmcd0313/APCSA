
// Brandon McDonald
// Date: 12-13-21
// Purpose: Simulate the MONTY HALL PROBLEM

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Monty_Hall //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);
        //declare ArrayList of booleans
        ArrayList<Boolean> doors = new ArrayList<Boolean>();
        //welcome screen
        System.out.println("Welcome to Let’s Make a Deal!");
        //door number
        System.out.print("How many doors? "); int doorAmount = Integer.parseInt(sc.nextLine());
        //trial number
        System.out.print("How many trials? ");int trials = Integer.parseInt(sc.nextLine());

        //create variables
        double fails =0; double success = 0; boolean cont = true;
        for(int i = 0; i<trials; i++) { //run as many as there are trials.
            //generate position of winner
            doors.clear(); //clear arraylist
            int winner = ((int)(Math. random()*(doorAmount-1+1)+1)-1); //-1 converts to zero base
            int guess = ((int)(Math. random()*(doorAmount-1+1)+1)-1); //-1 converts to zero base
            for(int j = 0; j<doorAmount; j++) {
                //true is winner false is loser
                if(j!=winner) { //if door not winner
                    doors.add(false); }
                else{ //door is winner
                    doors.add(true); }
            }
            
            for(int k = (doors.size()-1); k > -1; k--) {
                if(k==guess) {} //door is guess do nothing 
                else if(!(doors.get(k))) { //if door is lose remove it
                    doors.remove(k); //remove door at k
                }
                
           }
           
           if(doors.size() == 2) { //if user switches to correct
                    success++;}
                else{fails++;} //user was right originally
        }

        
        System.out.println("Results:");
        System.out.println("After switching doors, the player wins " + ((success/trials)*100) + "% of time!");

    } //end of method
} //end of class header
