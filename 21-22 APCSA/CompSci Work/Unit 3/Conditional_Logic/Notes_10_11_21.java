//Brandon McDonald
// 10-11-21
// Purpose: Use boolean values and conditonal operators.

import java.util.Scanner; //import library for standard input

public class Notes_10_11_21
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //new data type: BOOLEAN - evaluates to
     //TRUE OR FALSE (both keywords).
     boolean b1 = true;
     boolean b2 = false;
     System.out.println("b1: " + b1 + "\tb2: " + b2);
     
     //BOOLEAN (CONDITONAL) OPERATORS:
     
     //Simple operators:
     //Greater than, less than: >, <
     b1 = 5 < 3;
     System.out.println("5 < 3: " + b1);
     
     //Mixed inequalities: >=, <=
     b2= 7.0 >= 3.2 + 3.8;
     System.out.println("7.0 >= 3.2 + 3.8: " + b2);
     
     //read in value
     System.out.print("Enter a number: ");
     String input = sc.nextLine();
     double val1 = Double.parseDouble(input);
     System.out.print("Enter another number: ");
     String input2 = sc.nextLine();
     double val2 = Double.parseDouble(input2);
     
     //Equal to: ==
     //Notice that this COMPARISON OPERATOR is different
     // from =, the assignment operator.
     System.out.println("val1 is eqaul to val2: " +
       (val1==val2));
    
     //Not equal to: !=
     //In logic, ! means NOT.
     //putting a ! in front of a boolean value flips it.
     b1 = val1 != 0;
     System.out.println("val1 is nonzero: " + b1);
     b2 = !b1; //"b2 equals NOT b1"
     System.out.println("The oppisite truth value is: " + b2);
     
     //Compound operators:
     //AND: &&
     //Evaluates true if and only if both conditions
     // are true,
     
     System.out.println("val1 and val2 both positive: " +
       (val1 > 0 && val2 >0));
     //a number is even if its mod 2 is zero
     System.out.println("val1 and val2 both even: " + 
      (val1 % 2 == 0 && val2 % 2 == 0));
     
      //OR: || (double pipe)
      //Evaluates true if either conditon is true
      System.out.println("\nval1 or val2 positive: " +
       (val1 > 0 || val2 >0));
     //a number is even if its mod 2 is zero
     System.out.println("val1 or val2 even: " + 
      (val1 % 2 == 0 || val2 % 2 == 0));
      
     //XOR: ^ (carat)
     //Evaluates true if exactly one of the conditons
     // is true(if the truth values are different)
     System.out.println("\nTrue XOR True: " + (true ^ true));
     System.out.println("\nTrue XOR False: " + (true ^ false));
     System.out.println("\nFalse XOR False: " + (false ^ false));
    }
}