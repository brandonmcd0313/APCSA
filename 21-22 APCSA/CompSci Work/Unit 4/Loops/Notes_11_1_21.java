//Brandon McDonald
// 10-27-21
// Purpose: Create a multipurpose loop.

import java.util.Scanner; //import library for standard input

public class Notes_11_1_21 //class header
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);  
     
     String input = "";
     
     while(!input.equalsIgnoreCase("quit")) {
       //print menu, get user choice
       System.out.println("Would you like to:");
       System.out.println("COUNT to a number,");
       System.out.println("Get a RANDOM value,");
       System.out.println("Break up a 2-word STRING,");
       System.out.println("or QUIT");
       input = sc.nextLine().toLowerCase();
       System.out.print("\u000C");
       //excute choice
       if(input.contains("count")) {
        //get parameters
        System.out.print("What shall I count to?");
        int target = Integer.parseInt(sc.nextLine());
        System.out.print("What interval shall I use?");
        int interval = Integer.parseInt(sc.nextLine());
        
        int current = 1;
        int iterations = 0; // # of times we've looped
        while(current <= target) {
            System.out.print(current + "\t"); //print current ##
            current += interval; //go up by interval
            iterations++;
            //go to next line every 5 iterations
            if (iterations % 5 == 0) {
               System.out.println();
            }
        }
        }
         else if(input.contains("random")) {
          //get input
          System.out.println("Enter low range: ");
          int low = Integer.parseInt(sc.nextLine());
          System.out.println("Enter high range: ");
          int high = Integer.parseInt(sc.nextLine());
          
          //validate input with loop
          while(low > high){
            System.out.println("ERROR: Low must be lower.");
            System.out.println("Enter low range: ");
            low = Integer.parseInt(sc.nextLine());
             System.out.println("Enter high range: ");
            high = Integer.parseInt(sc.nextLine());
            }
           
            //generate #  
            int rand = (int)(Math.random() * (high - low + 1) + low);
        }
          else if(input.contains("string")) {
          System.out.println("no i dont wanna");
        }
           else if (input.contains("quit")) {
             System.out.println("Quitting program.");
             break; //immediatly end loop
        }
            else { //errors
          System.out.println("ERROR: Invalid Option");
        }
    
        //clear screen
       System.out.println("[Press Enter To Continue]");
       sc.nextLine();
       System.out.print("\u000C");
     }
 }
}   