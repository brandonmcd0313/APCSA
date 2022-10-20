// Brandon McDonald
// Date: 1-18-22
// Purpose: Use recursion to check if a string is a palindrome

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Program_Name //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        String input = ""; //declare variable
        while(true)
        {
            System.out.print("Enter a word or phrase (or “quit” to end program): ");
            input = sc.nextLine(); 
            if(input.equalsIgnoreCase("quit"))
            {
                break;
            } //end of if
            else
            {
                if(isPalindrome(input))
                    System.out.println("\"" + input + "\"" + " is a palindrome");
                else
                    System.out.println("\"" + input + "\"" + " is not a palindrome");
            } //end of else
        } //end of while

    } //end of method

    static boolean isPalindrome(String phrase)
    {
        // make input alpha-numeric and lowercase
        phrase = phrase.replaceAll("[^A-Za-z0-9]",""); 
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#replaceAll(java.lang.String,java.lang.String)
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html
        phrase = phrase.toLowerCase();
        //give word, starting value 0, length coverted to 0 base
        return palinRec(phrase, 0, (phrase.length()-1)); 
    } //end of helper method

    static boolean palinRec(String phrase, int x, int y)
    {
        //base case (if 0 or 1 return true)
        if(x == y || x > y)
        {
            return true; //made it to base, is palindrome
        }
        else if(phrase.charAt(x) != phrase.charAt(y)) //if not equal
        {
            return false; //not equal not palindrome
        }
        else if(x < y + 1) //still places to check
        {
            return palinRec(phrase,x + 1, y - 1); //moving towards middle
        }
        else
        {
            return false; //shouldn't reach here, makes blueJ happy
        }
    }//end of recursive method
} //end of class header
