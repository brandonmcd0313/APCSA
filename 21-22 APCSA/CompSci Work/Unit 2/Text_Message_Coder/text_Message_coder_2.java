//Brandon McDonld
// 9-24-21
// Purpose: Simulate the abbreviation found in text messages.

import java.util.Scanner; //import library for standard input
public class text_Message_coder_2
{
   public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in); //create SCANNER object
     // declare phrases to be abbrievated to user.
   System.out.println("Phrases to be abbreviated: ");
   System.out.println("got to go");
   System.out.println("i don't know");
   System.out.println("becuase");
   System.out.println("rolling on the floor laughing");
   System.out.println("\n");
   //get message from user
   System.out.println("Enter a message (minimum 20 characters): ");
   String message = sc.nextLine(); //user imputs message and is stored
   //diplay imported message and length
   System.out.println("\n Original Message: \n" + message);
   System.out.println("Length: " + message.length());
   //set message to lowercase
   String lowercase = (message.toLowerCase());
   //Abbrieviate Message
   String updated = lowercase.replaceAll("got to go","GTG");
   updated = updated.replaceAll("i don’t know","IDK");
   updated = updated.replaceAll("because","b/c");
   updated = updated.replaceAll("rolling on the floor laughing","ROFL");
   //show abbrived message
   System.out.println(" Abbreviated Message: ");
   System.out.println(updated);
   System.out.println("Length: " + updated.length());
   //String Method Demo
   System.out.println("~~~String Method Demo~~~");
   //upercase
   String uppercase = (message.toUpperCase());
   System.out.println("\n" + uppercase);
   //indexing
   System.out.println("Index of ‘e’: " + lowercase.indexOf("e"));
   System.out.println("Index of “rolling”: " + lowercase.indexOf("rolling"));
   //substring
   System.out.println("Substring from index 8 to index 18: " + lowercase.substring(8,18));
   
  
   
   
  
   
   
 }
}