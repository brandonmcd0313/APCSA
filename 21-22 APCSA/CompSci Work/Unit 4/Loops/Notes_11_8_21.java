//Brandon McDonald
// 11-8-21
// Purpose: Start working with FOR LOOPS

import java.util.Scanner; //import library for standard input

public class Notes_11_8_21 
{
   public static void main(String[] args) throws InterruptedException
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //The FOR LOOP is a structure specifically made
     // for counting (ITERATING the loop) a certian 
     // number of times.
     //An ITERATION is one run of the loop.
     
     //The header of a for loop has three elements,
     // seperated by semicolons:
     //-The name or declaration of an integer
     // variable to be used as the counter.
     //-The Boolean condition
     //-The POST-OPERATION that happens agt the end 
     // of each iteration (usually what happens to
     // the counter).
     
     //use a for loop to count to 10
     for(int i = 1; i <= 10; i++)
     {
         System.out.print(i+" ");
     }
     
     System.out.println("\n");
     
     //down by five from 100 to 0
     for(int i = 100; i >= 0; i -= 5)
     {
         System.out.println(i + "% remaining"); 
         Thread.sleep(40);
        }
        
     //go to each character in a string
     String message = "Big fella loves tacos";
     for(int i = 0; i< message.length(); i++)
     {
         System.out.print(message.charAt(i));
         Thread.sleep(25);
        }
        System.out.println();
       
     //It is common to NEST one for loop inside of
     // another. If you do that the number of iterations
     // for the intermost loop is multiplied.
     for(int i = 0; i < 8; i++) //iterates 8 times
     {
         for(int j = 0; j < 4; j++) //iterates 4 times EACH
         {
             //code in here is going to run
             //8 * 4 == 32 total times
             System.out.print("(" + i + ", " + j + ")\t");
            }
            System.out.println();
        }
        
 }
}   