//Brandon McDonald
// 10-12-21
// Purpose: Start working with if statments.

import java.util.Scanner; //import library for standard input

public class Notes_10_12_21
{
  public static void main(String[] args)
  {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //A FLOWCHART keeps track of a program's
     // operations visually. A DECISION POINT
     // is represented by a diamond.
     
     //New keyword: IF
     //An IF STATMENT is structured with "if"
     // followed by a boolean condition in
     // parentheses, and no semicolon.
     //It's followed by a line or block of code.
     //to run (true) or not run (false).
     
     System.out.print("Type something: ");
     String input = sc.nextLine();
     
     if(input.length() > 10)
           System.out.println("Length is more than 10");
           
     //comparing strings using .equals
     if(input.equals("something")) 
           System.out.println("You are a smart aleck.");   
     
     //A BLOCK of code is enclosed by curly braces {}
     //An if statement header can go before a block
     // instead of a single line.
     System.out.print("\nNow enter a number: ");
     String num1 = sc.nextLine();
     int num = Integer.parseInt(num1);
     
     if(num % 2 == 0)//if the number is even
     {
          System.out.println("Your number is even!");
      if (num < 0)
      {
          //Putting one block of code in another 
          //is called NESTING your code
          System.out.println("But why so negative?");
      }   
     }
        
     if(num % 2 != 0)//if the number is odd  
     {
          System.out.println("That's an odd answer");
      }   
     }
    }
