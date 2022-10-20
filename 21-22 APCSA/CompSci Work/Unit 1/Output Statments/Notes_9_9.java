//Brandon McDonld
// 9-9-21
// Purpose: Learn about output statments.

//COMMENTS are notes for humans to read (the compiler ignores them).
//SINGLE -LINE COMMENTS start with a double forward slash
//and go until the end of the line.
/*
 * MULTI-LINE or BLOCK COMMENTS start with a slash-star and go until
 * you end them with a star-slash
 * Block comments are often used for DUMMYING OUT (temporaily
 * disabling) sections of code.
 */

public class Notes_9_9
{
 public static void main(String[] args)
 {
    //print a message to standard output
    System.out.println("Hello World");
    System.out.println("Test Message print");
    System.out.print("line 1");
    System.out.print("line 2");
    
    //In Java, programs are composed mostly of STATMENTS.
    //Every statment must end with a semicolon (;).
    
    //System.out.println() prints a message to standard output,
    // followed by an endline.
    // System.out.print() just prints the message with no end line.
 
    System.out.println();
    System.out.println("I'm a computer!");
    System.out.println("I'm not sentient :(");
    
    System.out.print("This is the first part, and ");
    System.out.println("this is the second part.");
 
    /*
     * We can control the way our output is formated by using ESCAPE SEQUENCES, designated by the backslash (\).
     * 
     * \n = newline
     * \t = tab
     * \" = literal quotation mark
     * \\ = literal backslash
     */  
   
    //new line
    System.out.println("\nOne\nTwo\nThree");
    System.out.println("Three Lines! Ah ah ah.");
    
    //tab spacing
    System.out.println("\nMy\n\twords\n\t\tare\n\t\t\tSTAIRS.");
    
    //lieral characters
    System.out.println("\n\"I like backslashes - \\!\", said Tim.");
    
    
 }
}

