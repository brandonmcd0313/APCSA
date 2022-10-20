
//Brandon McDonld
// 9-16-21
// Purpose: Use the rest of the operators and casting.

public class Notes_9_16
{
   public static void main(String[] args)
 {
    //PSEUDOCODE is a BLUEPRINT for your program
    // without any actual code it.
    // You should write this in comments before
    // you start coding.
    
    //An ARITMETIC ASSIGNMENT operator preforms
    // a calculation using the varible's current
    // value, then stores the result in the varible
    // variable. (+=, -=, *=, /=, %=)
    
    //declare and then update a varible
    int backInjuries =4;
    System.out.println("I've had " + backInjuries +" back injuries");
    System.out.println("Oh no! Here come two more!");
    backInjuries += 2;
    System.out.println("That's " + backInjuries + " total");
    
    //divide a double value by 3
    double money = 7832.75;
    System.out.println("Three of us earned $" + money + " in the bank heist");
    System.out.println("Diving it up...");
    money /= 3; //same as saing money = money/3
    System.out.println("That's $" + money + " each"); 
    
    //The INCREMENT operator (++) adds 1 to the value;
    // the DECREMENT operator (--) subtracts 1
    System.out.println("Oh, one of my back injuries healed!");
    backInjuries--; //subracts 1 from back injuries
    System.out.println("Now I've had only " + backInjuries);
    
    /*
     * To store a value of a different type insodea 
     * variable, a CAST is preformed.
     * An IMPLICIT CAST happens automatically and requires
     * no extra code; an EXPLICIT CAST is preformed manually
     * where we specify the type.
     */
    double decimalValue = 8; //Implicit cast
    int choppedValue = (int)14.5; //explicit double-to-int cast
    int asciiValue = (int)'H'; //explicit charto=to-int cast
    System.out.println("\n8 as a double: " + decimalValue);
    System.out.println("14.5 as an int: " + choppedValue);
    System.out.println("H as an int: " + asciiValue);
}
}