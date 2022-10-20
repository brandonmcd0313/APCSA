//Brandon McDonald
// 10-27-21
// Purpose: Learn WHILE LOOPS

import java.util.Scanner; //import library for standard input

public class Notes_10_27_21 
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //A WHILE LOOP checks a Boolean condition and
     // repeatedly runs the block of code as long
     // as thhe condition is true
     
     int count = 1;
     System.out.println("Counting to 10!");
     while(count <= 10)
     {
         System.out.println(count);
         count++; //increment operator; adds one
         
         // It's important to change the condition
         // somewhere inside your loop, or it could
         // go infinite
        }
      //Any variables declared inside a block of code
      // only the SCOPE of that block; they don't
      // exist outside that block. These are called
      // LOCAL VARIABLES to that block
        
      //We commonly use user input to terminate use
      // loops
     
     String input = "";
     while(!input.equalsIgnoreCase("yes master"))
     {
         System.out.print("Type 'yes master'to continue: ");
         input = sc.nextLine();
        }
     
        System.out.println("Good");
     
     input = ""; //clear input
     
     while(!input.equalsIgnoreCase("quit"))
     {
         //clear screen
         System.out.print("\u0003"); 
         
         
         //select option
         System.out.print("Select option 1 ,2 or quit: ");
         input = sc.nextLine();
         
         //run option
         if(input.equalsIgnoreCase("1"))
         {
           System.out.println("You selected 1: TOES RIPPED OFF!");  
            }
         else if(input.equalsIgnoreCase("2"))
         {
           System.out.println("You selected 2: ALL YOUR FRIENDS DIE!");  
            }   
            else if(input.equalsIgnoreCase("3")) //secret option
         {
           //You can use the BREAK keyword to exit the loop
           // imediately
           System.out.println("SECRET ESCAPE ACTIVATED!");
           break;
            } 
               else if(input.equalsIgnoreCase("quit")) //loop ends after
         {
           System.out.println("WE WILL MISS YOU");  
            }
                    else
         {
           System.out.println("Invalid tortu... I mean, option!");    
            }
            
         System.out.println("Loop continues... ");
        }
 }
}   