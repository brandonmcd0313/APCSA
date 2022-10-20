//Brandon McDonald
// 9-30-21
// Purpose: Demo common String class methods.

import java.util.Scanner; //import library for standard input

public class Notes_9_30_21
{
   public static void main(String[] args)
 {
     //Remember: Method calls take in arguments in parenthesis,
     // and send back a return value
     // The orignial object we call the method on is unchanged
     
     String tester = "Sim sala bim, my name is Jim!";
     System.out.println("Original String: " + tester);
     
     //Common String methods:
     
     //substring(int) 
     //Starts at the given index and returns the rest of the string.
     System.out.println("\nsubstring(14): " + tester.substring(14));
     
     //substring(int,int) - Note: substring() is OVERLOADED.
     //Starts at the first given index and returns everything BEFORE the second
     // given index.
     System.out.println("\nsubstring(3,8): " + tester.substring(3,8)); //3-7 
     
     //indexOf(String)
     //Returns the index of the given substring, or -1 if it's not found.
     System.out.println("\nindexof('bim'): " + tester.indexOf("bim"));
     System.out.println("indexof('jim'): " + tester.indexOf("jim"));
     
     //toLowerCase()
     //Returns a copy of the string converted to lowercase
     System.out.println("\ntoLowerCase(): " + tester.toLowerCase());
     
     //...and don't forget charAt(int) for indexing,
     System.out.println ("\ncharAt(0): " + tester.charAt(0));
     
     //Combining two method calls
     System.out.println("\nTen-character substring starting at first 'm': " +
       tester.substring(tester.indexOf('m'), tester.indexOf('m') + 10));
     
 }
}