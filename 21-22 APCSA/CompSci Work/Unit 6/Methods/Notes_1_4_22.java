// Brandon McDonald
// Date: 1-4-2022
// Purpose: Start working with static methods.

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_1_4_22 //class header
{
    //METHODS are functional blocks of code separated
    // by curly braces and distinct from eachother.

    //Methods have HEADERS with these elements:
    //-Optionally, an access specifier like "public".
    //-Optionally the STATIC keyword:
    // Static means you call the method directly from 
    // the class without using dot notation on an object.
    // (Non-static methods include System.out.print(); 
    // static methods include any of the String methods.
    //-The RETURN TYPE - what type of data is sent back
    // using the RETURN keyword. VOID means it doesn't
    // return anything.
    //-The name of the method.
    //-In parentheses, the type and local name of any
    // ARGUMENTS sent to the method, seperated by commas.

    //Program flow always starts at the top of Main.
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);
        //call the Hello() method
        Hello();
        
        //call the printThese method
        System.out.println("Calling printThese()...");
        printThese(11, -700);

        //call sum() and use the returned values 
        int sum1 = sum(5, 4);
        System.out.println("Sum of 5 and 4: " + sum1);
        System.out.println("Sum of 6 and 2: " + sum(6, 2));
    } //end of method

    //separate static method to print something
    static void Hello()
    {
        System.out.println("Hello World!");
    }

    //method with arguments
    static void printThese(int x, int y)
    {
        System.out.println("First int: " + x);
        System.out.println("Second int: " + y);
    }

    //method with a return value
    static int sum(int x, int y)
    {
        return (x + y);
    }
} //end of class header
