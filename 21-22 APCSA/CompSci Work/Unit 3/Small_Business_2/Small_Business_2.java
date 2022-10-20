//Brandon McDonld
// 10-12-21
// Purpose: Display an info card for a small business and item list

import java.util.Scanner; //import library for standard input

public class Small_Business_2
{
   public static void main(String[] args)
 {
    //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     
     //print logo
    System.out.println("     ___  _      _    ___      _______      ___     __  ____    _    ___ _____");
    System.out.println("    /   \\/ \\    / \\  /   \\__--- ___   |_____\\___\\  |  |/    \\  /  | /  // ____|");
    System.out.println("   /  ^  \\  \\  /   \\/  ^  \\__---   / /  __  \\ ___  |   __    \\|   |/  /| (___ ");
    System.out.println("  /  /_\\  \\\\ \\/ / \\ \\ /_\\  \\      / /|  | |  |\\  \\ |  |  \\    |      /  \\___ \\");
    System.out.println(" /  _____  \\\\__/  /\\ \\____  \\    / / |  |_|  | \\  \\|  |   |   |  |\\  \\  ____) | ___");
    System.out.println("/__/  /_/\\__\\    /_/\\_\\   \\__\\  / /___\\_____/__ \\__\\__|   |___|__| \\__\\|_____/  $$ \\");
    System.out.println("                                |______________--------------______________      $$ \\");
    System.out.println("                          	               --------------______________-------$$ \\");
    System.out.println("      							                   -------$$ /");
    System.out.println("                                                                                 $$ / ");
    System.out.println("                                                                              	$$ /");  
    
    //ask aboot intro
    System.out.print("Would you like to read the introduction? (Y/N): ");
    String introQ = sc.nextLine();
    
    //display if they said Y
    if(introQ.equalsIgnoreCase("Y"))
    {
        System.out.print('\u000C'); //clear screen
        //intro + art
    System.out.println("     ___  _      _    ___      _______      ___     __  ____    _    ___ _____");
    System.out.println("    /   \\/ \\    / \\  /   \\__--- ___   |_____\\___\\  |  |/    \\  /  | /  // ____|");
    System.out.println("   /  ^  \\  \\  /   \\/  ^  \\__---   / /  __  \\ ___  |   __    \\|   |/  /| (___ ");
    System.out.println("  /  /_\\  \\\\ \\/ / \\ \\ /_\\  \\      / /|  | |  |\\  \\ |  |  \\    |      /  \\___ \\");
    System.out.println(" /  _____  \\\\__/  /\\ \\____  \\    / / |  |_|  | \\  \\|  |   |   |  |\\  \\  ____) | ___");
    System.out.println("/__/  /_/\\__\\    /_/\\_\\   \\__\\  / /___\\_____/__ \\__\\__|   |___|__| \\__\\|_____/  $$ \\");
    System.out.println("                                |______________--------------______________      $$ \\");
    System.out.println("        _______		                       --------------______________-------$$ \\");
    System.out.println("       /       \\							   -------$$ /");
    System.out.println("       |  o  o |     Bezos          Ever since that fatefull day of              $$ / ");
    System.out.println("       D    \\  |      <----       January 12, 1964 in Albuquerque New Mexico	$$ /");   
    System.out.println("        \\__--- /                  The world has never been the same...");    
    System.out.println("           | |                    On that day i felt a deep hatred emerge");
    System.out.println("          /   \\                   I knew I had to stop Jeffrey Preston Bezos.");
    System.out.println("                                  ALAS! I was too late! He quickly amounted vast weath.");
    System.out.println("                                  Yet all hope was not lost, there is still one chance.");
    System.out.println("");
    System.out.println("   FOR THE LOW LOW PRICE OF ONE US DOLLAR YOU, YES YOU, CAN HELP ME STOP JEFFREY BEZOS!!");
    System.out.println("    I will print an image of Jeffrey Bezos and destroy it in any way you would like!");
    System.out.println("    I will record the destuction of Mr.Bezos and email it to him (jeff@amazon.com)");
    System.out.println("    and if you would like, you aswell! Please help stop Jeffrey Bezos!");
    System.out.println("");
    System.out.println("                           ONLY ONE DOLLAR [̲̅$̲̅(̲̅1)̲̅$̲̅]");
    }
    //asigning values
    double cost1 = 0.50;
    double cost2 = 1;
    double cost3 = 320;
    double cost4 = 50;
    double cost5 = 200;
    double cost6 = 0.25;
    double cost7 = 0.75;
    double cost8 = 1;
    
    //DISPLAY ITEMS
    System.out.println("\n----------------------------------------------------------");
    System.out.println("\nItem Name\tCost");
    System.out.println("\nBezos Printed Picture\t$"+ cost1);
    System.out.println("\nBezos Picture Demolishion\t$"+ cost2);
    System.out.println("\nResin Bezos Fart\t$"+ cost3);
    System.out.println("\nBezos Finger Nail\t$"+ cost4);
    System.out.println("\nBezos Phone Number\t$"+ cost5);
    System.out.println("\nFlyer\t$"+ cost6);
    System.out.println("\nBezos Button\t$"+ cost7);
    System.out.println("\nCustom Button\t$"+ cost8);
    System.out.println("\n----------------------------------------------------------");

    //Additional Items
    
    //declaring varibles 
    String item2 = "a"; String item3 = "a"; double item2cost = 1; 
    double item3cost  = 1; String item3Q  = "a";
    
    System.out.print("\nYour additional item: ");
    String item1 = sc.nextLine();
    //cost
    System.out.print("Cost of " + item1 + ": $");
    String item1toParse = sc.nextLine();
    double item1cost = Double.parseDouble(item1toParse);
    //prompt new item
    System.out.print("Add another item? (Y/N): ");
    String item2Q = sc.nextLine();
    if(item2Q.equalsIgnoreCase("Y"))
    {
     System.out.print("\nSecond additional item: ");
    item2 = sc.nextLine();
    //cost
    System.out.print("Cost of " + item2 + ": $");
    String item2toParse = sc.nextLine();
    item2cost = Double.parseDouble(item2toParse);
    //prompt new item
    System.out.print("Add another item? (Y/N): ");
    item3Q = sc.nextLine();   
    if(item3Q.equalsIgnoreCase("Y"))
    {
    System.out.print("\nThird additional item: ");
    item3 = sc.nextLine();
    //cost
    System.out.print("Cost of " + item3 + ": $");
    String item3toParse = sc.nextLine();
    item3cost = Double.parseDouble(item3toParse);
    }
    }
    
    //print new item list
    System.out.println("\n----------------------------------------------------------");
    System.out.println("\nItem Name\tCost");
    System.out.println("\nBezos Printed Picture\t$"+ cost1);
    System.out.println("\nBezos Picture Demolishion\t$"+ cost2);
    System.out.println("\nResin Bezos Fart\t$"+ cost3);
    System.out.println("\nBezos Finger Nail\t$"+ cost4);
    System.out.println("\nBezos Phone Number\t$"+ cost5);
    System.out.println("\nFlyer\t$"+ cost6);
    System.out.println("\nBezos Button\t$"+ cost7);
    System.out.println("\nCustom Button\t$"+ cost8);
    System.out.println("\n" + item1 + "\t$" + item1cost);
    if(item2Q.equalsIgnoreCase("Y"))
    {
     System.out.println("\n" + item2 + "\t$" + item2cost);
     if(item3Q.equalsIgnoreCase("Y"))
     {
      System.out.println("\n" + item3 + "\t$" + item3cost);
     }
    }
    System.out.println("\n----------------------------------------------------------");
}
}