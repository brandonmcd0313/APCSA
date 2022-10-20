//Brandon McDonld
// 9-15-21
// Purpose: Start working with variables.

public class Notes_9_15
{
   public static void main(String[] args)
 {
    /*
     * A VARIABLE is a PLACEHOLDER in memory.
     * It has a value, an IDENTIFIER (name),
     * and a DATA TYPE (dtermines what kind of
     * value can be stored and how much memory
     * is reserved).
     * 
     * Some primitive data types:
     * INT - integer value (32 bits)
     * DOUBLE - decimal value (64 bits)
     * FLOAT - les precise decimal value (32 bits)
     */                  
    
    //You must DECLARE a varibel before using it,
    // by statings its type and name
    
    //declare an int variable called myInt
    int myInt;
    
    //The ASSIGNMENT OPERATOR (=) evaluates
    // everything on the right side, and then
    // stores that value in  the varible on the left.
    myInt=11;
    System.out.println("myInt = " + myInt);
    
    //add one to the varible
    myInt = myInt +1;
    System.out.println("After adding 1, it's " + myInt);
    
    //declare and INITIALIZE a double varible
    double myDouble = 478.53;
    System.out.println("myDouble = " + myDouble);
    
    //show the sum of the two numbers
    System.out.println("Sum of them: " + (myInt + myDouble));
    
    //Restrictions on variable names
    //Allowed characters are letters, numbers, and the
    //underscore (_). Must start witha letter.
    //First letter should be lowercase (camelCase).   
    //Can't use reserved keywords
 }
}