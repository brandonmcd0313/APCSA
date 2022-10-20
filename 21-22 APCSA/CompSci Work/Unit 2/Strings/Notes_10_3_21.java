//Brandon McDonald
// 9-24-21
// Purpose: Start getting user input!

import java.util.Scanner; //import library for standard input

public class Notes_10_3_21
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     String tester = "A1B2C3D4E5";
     System.out.println("Our String: " + tester);
     System.out.println("Length: " + tester.length());
     
     //char = data type, myChar = identifier
     // = = assignment operator
     // 'j' = data value
     char myChar = 'h';
     System.out.println("character: " + myChar);
     System.out.println("IndexOf char in string: " +
           tester.indexOf(myChar)); //-1 if not found
           
     //Substring()
     //string is A1B2C3D4E5
     System.out.println("Substring(4): " +
             tester.substring(4));
     System.out.println("Substring(3,4): " +
             tester.substring(3,4));
     
             
     
     
     
 }
}