//Brandon McDonald
// 10-14-21
// Purpose: Add "else" to our if statements.

import java.util.Scanner; //import library for standard input

public class Notes_10_14_21
{
  public static void main(String[] args)
  {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //New keyword: ELSE
     //IF-ELSE LOGIC says that if the condition is
     // true, run, the "if" branch; otherwise, run
     // the else branch
     System.out.print("Enter and integer: ");
     int num = Integer.parseInt(sc.nextLine());
     
     if (num % 2 == 0 ) //even
          System.out.println("The value is even");
     else //odd
     {
         System.out.println("ODD NUMBER IS BAD.");
         System.out.println("Adding one to fix it");
         num += 1;
        }
     
     System.out.println("Your value: " + num);
        
     //IF-ELSE-IF LOGIC checks condition until 
     // it finds one that is true, and runs "else"
     // only if they're all fale. Use this when
     // you want only one conditional branch to run.
     
     System.out.println("ADD two, or SUBTRACT two?: ");
     //read in answer as lowercase
     String choice = sc.nextLine().toLowerCase();
     
     if(choice.equals("add"))
      {
          num += 2;
        }
     else if(choice.equals("subtract"))
      {
          num -= 2;
        }
     else //neither answer was given
       {
         System.out.println("ERROR: Invalid choice");  
        }
       
     System.out.println("Updated value: " + num);
     
     System.out.print("\nEnter a two-word phrase: ");
     String phrase = sc.nextLine();
     
     //The Contains() method checks whether a given
     // substring is in the string.
     if(phrase.contains(" "))//if it has a space
     {
         //find position of space
         int space = phrase.indexOf(" ");
         
         System.out.print("Show the FIRST word, or SECOND?: ");
         choice = sc.nextLine();
         
         if(choice.equals("first"))
         {
             //first word = everything before the space
             String first = phrase.substring(0,space);
             System.out.print("First word: " + first);
            }
         else if(choice.equals("second"))
         {
             //second word = everything after the space
             String second = phrase.substring(space+1);
             System.out.print("Second word: " + second);
            }
         else //invalid entry
         {
           System.out.println("ERROR: Invalid choice");    
            }
       }
     else //no space, error
     { 
        System.out.println("Error: No space in phrase.");
       }
       
     }
    }
