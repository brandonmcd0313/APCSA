//Brandon McDonald
// 10-18-21
// Purpose: Show some Math class methods. 

import java.util.Scanner; //import library for standard input

public class Notes_10_18_21 //class header
{
  public static void main(String[] args) //method header
  {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
    
     //The Math class contains many useful methods that we
     // can utilize in our code.
  
     //Math.random() generates a random number between 0 and 1.
     System.out.println("Random # between 0 and 1: " + Math.random());
     
     //to adjust the range, multiply to widen it and add/subtract
     // to shift it
     //To get an int between 1 and 10, multiply by 10 and add 1, then
     // cast it to an int
     System.out.println("Random # between 1 and 10: " + 
             (int)(Math.random() * 10 + 1));
             
     //General formula:
     // (int)(Math.random() * (high - low + 1) + low);
     System.out.print("Lower end of range: ");
     int low = Integer.parseInt(sc.nextLine());
     System.out.print("Higher end of range: ");
     int high = Integer.parseInt(sc.nextLine());
     if(low > high) //error handling
      System.out.println("ERROR: High number must be higher than low.");
     else
     {
       int rand = (int)(Math.random() * (high - low + 1) + low);
       System.out.println("Random number in that range: " + rand);
      }
    
     //Math.round(double) rounds any number to the nearest int
     System.out.println("\nRounding 4.5: " + Math.round(4.5));
     System.out.println("\nRounding 4.49999999: " + Math.round(4.4999999));
     
     //Math.pow(double, double) is the exponent function.
     System.out.print("\nExponent Demo: Enter the base: ");
     int base = Integer.parseInt(sc.nextLine());
     System.out.print("\nExponent Demo: Enter the exponent: ");
     int exponent = Integer.parseInt(sc.nextLine());
     
     //get the proper suffix
     String suffix = "";
     //check the last digit of the exponent
     int lastDigit = exponent % 10;

     //1 -> "st" except for 11
     //2 -> "nd" except for 12
     //3 -> "rd" except for 13
     //everything else is "th"
     if(lastDigit == 1 && exponent != 11) suffix = "st";
     else if(lastDigit == 2 && exponent != 12) suffix = "nd";
     else if(lastDigit == 3 && exponent != 13) suffix = "rd";
     else suffix = "th";
     
     System.out.println(base + " to the "+ exponent + suffix + " power = " + 
     Math.pow(base,exponent)); 
     
     //When a result is too big to be stored in the data type,
     // an OVERFLOW may occur
     System.out.println("Product of base & exponent: " + base * exponent);
     
     
   }
}
