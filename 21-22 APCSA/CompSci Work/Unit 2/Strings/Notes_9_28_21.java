//Brandon McDonald
// 9-24-21
// Purpose: Start getting user input!

import java.util.Scanner; //import library for standard input

public class Notes_9_28_21
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //The, we can specify the type of input we expect.
     System.out.print("What is your name: ");
     String name = sc.nextLine(); //reads and stores everything until they hit Enter
     
     //Now we have the String and can do anything with it.
     System.out.println("You said your name is " + name + ".");
     System.out.println("But I'm changing it.");
     name = name.replaceAll("t","p").replaceAll("a","i");
     System.out.println("Your new name is " + name + ".");
     
     //You can store indivual tokens with next().
     System.out.print("Enter a three-word phrase: ");
     String word1 = sc.next();
     String word2 = sc.next();
     String word3 = sc.next();
     System.out.println("BEHOLD: REVERSAL! - " + word3 + " " +
      word2 + " " + word1);
      
     //You can read in numerical values directly
     System.out.print("Enter a number 1-10: ");
     int num = sc.nextInt(); //read an int
     System.out.println("That's one more than " + (num - 1));
     System.out.print("Enter a decimal value 1.0-10.0: ");
     double dec = sc.nextDouble(); //read in a double
     System.out.println("Half that is " + (dec/2));
     
     //Or, you can read numbers in as a String and then PARSE the string
     // This is generally safer but a little more complicated
     System.out.print("\nOops, I lost the numbers. Enter an int: ");
     String input = sc.next();
     int num2 = Integer.parseInt(input);
     System.out.println("Your number is half of " + (num2 * 2));
     System.out.print("Good! Now a decimal value again: ");
     double dec2 = Double.parseDouble(sc.next()); //parse imput in one step
     System.out.println("That number is 15.5 less than " + (dec2 + 15.5));
     
 }
}