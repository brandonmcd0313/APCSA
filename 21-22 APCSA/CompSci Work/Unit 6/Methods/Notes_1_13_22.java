// Brandon McDonald
// Date: 1-13-2022
// Purpose: Write recursive methods!

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_1_13_22 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //RECURSION is the process of using the same
        // method repeatedly to drill down to the 
        // BASE CASE.
        
        for(int i = 1; i < 10; i++)
        {
            System.out.println("Peicewise of " + i + "\n");
            System.out.print(peicewise(i));
            sc.nextLine();
        } //end of for loop
    } //end of method

    //recursive method to solve the piecewise function
    //        | f( x * 2) + 3     if x < 7
    // f(x) = |
    //        |      6            otherwise

    static int peicewise(int x)
    {
        //Any recursive method must have a base case
        // that returns avalue (or it would run
        // infinitely) and a RECURSIVE STEP where
        // the method calls itself w/a different argument.

        //reursive step: x < 7
        if(x < 7)
        {
            System.out.println(x + " < 7, so f(" + x + ") = f(" +
                (x * 2) + ") + 3");
            return peicewise(x * 2) + 3;
        } //end of if x < 7

        //base case: x >= 7
        else
        {
            System.out.println("BASE CASE: " + x + " >= 7, so " +
                "f(" + x + ") = 6.");
                return 6;
        } //end of else
        
    } //end of peicewise function
} //end of class header
