//Brandon McDonald
// 10-1-21
// Purpose: Simulate an online movie ticket purcase

import java.util.Scanner; //import library for standard input

public class BuyMovieTickets
{
   public static void main(String[] args)
 {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //Get information from the shopper
     System.out.println("Thank you for choosing Obama Theatres!");
     
     //name
     System.out.print("\nPlease enter your name in the Last, First format: ");
     String name = sc.nextLine();
     
     //date
     System.out.print("Please enter today's date (mm/dd/yyyy): ");
     String date = sc.nextLine();
     
     //movie title
     System.out.print("Please enter the name of the movie you would like to see: ");
     String movie = sc.nextLine();
     
     //ticket number 
     System.out.print("Please enter the number of tickets you would like today: ");
     String tickets1 = sc.nextLine();
     int tickets = Integer.parseInt(tickets1);
     
     //ticket price
     System.out.print("Please enter the price of each ticket: $");
     String ticketPrice1 = sc.nextLine();
     double ticketPrice = Double.parseDouble(ticketPrice1);
     
     //debit number
     System.out.print("Please enter your debit card number (#####-###-####): ");
     String debit = sc.nextLine();
     
     //pin
     System.out.print("Please enter your pin number: ");
     String pin1 = sc.nextLine();
     
     
     //line split
     System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
     
     //e recipt!
     System.out.println("\n Your e-Recipt");
     
     //order info
     System.out.println("\n" + date.replaceAll("/","-"));
     System.out.println("Order Number: obabna2");
     
     //name
     System.out.println("\n" + name.charAt(name.indexOf(",") + 2) + ". " +
         name.substring(0,name.indexOf(",")));
         
     //account #
     System.out.println("Account: #####-###-" + debit.substring(10));
     
     //movie
     System.out.println("Movie: " + movie);
     
     //ticket # and price
     System.out.println("Number of Tickets: " + tickets);
     System.out.println("Ticket Price: " + ticketPrice);
     
     //display total cost
     System.out.println("\n$" + tickets*ticketPrice +" will be debited to your account");
     
     //goobye
     System.out.println("\nThank you! Enjoy the movie and have an obamaful time!");
     
 }
}