//Brandon McDonald
// 9-30-21
// Purpose: Calculate library fines and generate an email given user imput

import java.util.Scanner; //import library for standard input

public class Library_Fine
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //Get Name
     System.out.print("Enter the name in Last, First format: ");
     String name = sc.nextLine();
     
     //Get phone number
     System.out.print("\nEnter the phone number (###) ###-####: ");
     String phone = sc.nextLine();
     
     //Get book title
     System.out.print("\nEnter the title of the book: ");
     String book = sc.nextLine();
     
     //get checkout date
     System.out.print("\nEnter the date checked out (mm/dd/yyyy): ");
     String checkoutDate = sc.nextLine();
     
     //get days late
     System.out.print("\nDays Late: ");
     int daysLate = sc.nextInt();
     
     //get daily fine
     System.out.print("\nDaily Fine: ");
     double dailyFine = sc.nextDouble();
     
      //Generate email message.
     System.out.println("\n\n--====--Email Message--====--"); //formating
     //create email adress store as string
     String email=  name.charAt(name.indexOf(",") + 2) + //name first letter email
      name.substring(0,4) + //last name email
      phone.substring(10,14) + "@gmail.com";/* last 4 phone */ 
    
     //to message
     System.out.println("\nTo: " + name.substring(name.indexOf(",") + 2) + //to first name 
       " " + name.substring(0,name.indexOf(",")) + " (" + email.toLowerCase() + ")");
     //from message
     System.out.println("\nFrom: Among Us Imposter (totallynotsus@crewmate.com)");
     //subject linne
     System.out.println("\nSubject: Overdue Book Notice");
     System.out.println("============================================");
     //checkout date and book
     System.out.println( book + " was checked out on: " +
        checkoutDate.replaceAll("/","-"));
     //time out
     System.out.println("This book us currently " + daysLate + " day(s) late.");
     //fine
     System.out.println("Your fine has accumulated to: $" +
        daysLate*dailyFine + " dollar(s)");
        
 }
}