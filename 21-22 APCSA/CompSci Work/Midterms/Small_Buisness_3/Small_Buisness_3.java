// Brandon McDonald
// Date: 1-13-2022
// Purpose: Simulate a small buisness.

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists
import java.io.File; //for reading files
import java.io.IOException; // for all File work
import java.io.PrintWriter; //for writing Files.

public class Small_Buisness_3 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    //declare name variable
    static String name = "";
    //declare and populate cost array list
    static ArrayList<Double> costs = new ArrayList<Double>() {{ add(0.50); add(1.00); //adding the costs to the list
                add(3.20); add(50.00); add(200.00); add(0.25); add(0.75); add(1.00); }};
    //declare and populate item array list
    static ArrayList<String> items = new ArrayList<String>() 
        {{ add("Bezos Printed Picture");
                add("Bezos Picture Demolishion"); add("Resin Bezos Fart"); add("Bezos Finger Nail");
                add("Bezos Phone Number"); add("Flyer"); add("Bezos Button"); add("Custom Button");
            }};
    public static void main(String[] args) throws InterruptedException, IOException //method header
    {
        //print logo
        printLogo();
        //ask for name
        getName();
        pause();
        while(true)
        {
            //display items and cost
            inventory();
            //display menu and get choice
            String choice = menu(); //store choice as local string
            //choice a (Print intro)
            if(choice.equals("a") )
            {
                printIntro();
                pause();
            }

            //choice b (add item)
            else if(choice.equals("b") )
            {
                addItem();
                pause();
            }
            //choice c (Remove item)
            else if(choice.equals("c") )
            {
                removeItem();
                pause();
            }
            //choice d (modify item)
            else if(choice.equals("d") )
            {
                modify();
                pause();
            }
            //choice e (Make a purchase)
            else if(choice.equals("e") )
            {
                makePurchase();
                pause();
            }
            //choice f (Write summary to a file)
            else if(choice.equals("f") )
            {
                printFile();
                pause();
            }
            //choice g (Quit)
            else if(choice.equals("g") )
            {
                break;
            }
        } //end of main while loop
    } //end of method

    static void pause() 
    {
        System.out.println("\nPress enter to continue");
        sc.nextLine();
    }

    static void getName()
    {
        //prompt for name
        System.out.print("\nWelcome to Amazoinks! What's your name?: ");
        //change global variable
        name = sc.nextLine();
        //greet user
        System.out.println("\nWelcome " + name + "!");
    }

    static void printLogo()
    {
        //print the logo
        System.out.println("     ___  _      _    ___      _______      ___     __  ____    _    ___ _____");
        System.out.println("    /   \\/ \\    / \\  /   \\__--- ___   |_____\\___\\  |  |/    \\  /  | /  // ____|");
        System.out.println("   /  ^  \\  \\  /   \\/  ^  \\__---   / /  __  \\ ___  |   __    \\|   |/  /| (___ ");
        System.out.println("  /  /_\\  \\\\ \\/ / \\ \\ /_\\  \\      / /|  | |  |\\  \\ |  |  \\    |      /  \\___ \\");
        System.out.println(" /  _____  \\\\__/  /\\ \\____  \\    / / |  |_|  | \\  \\|  |   |   |  |\\  \\  ____) | ___");
        System.out.println("/__/  /_/\\__\\    /_/\\_\\   \\__\\  / /___\\_____/__ \\__\\__|   |___|__| \\__\\|_____/  $$ \\");
        System.out.println("                                |______________--------------______________      $$ \\");
        System.out.println("                                               --------------______________-------$$ \\");
        System.out.println("                                                                           -------$$ /");
        System.out.println("                                                                                 $$ / ");
        System.out.println("                                                                                $$ /");  
    } //end of printLogo method

    static void printIntro()
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
        System.out.println("        _______                                --------------______________-------$$ \\");
        System.out.println("       /       \\                                                          -------$$ /");
        System.out.println("       |  o  o |     Bezos          Ever since that fatefull day of             $$ / ");
        System.out.println("       D    \\  |      <----       January 12, 1964 in Albuquerque New Mexico   $$ /");   
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
    } //end of printIntro method

    static void inventory()
    {
        //header
        System.out.println("\n----------------------------------------------------------");
        System.out.println("\nItem Number\t\tItem Name\t\tCost");
        System.out.println("\n----------------------------------------------------------");
        //for loop traversing both arrays 
        for(int i = 1; (i < costs.size()+1); i++) //i is not 0 based
        {
            System.out.printf("%10s",("\nItem " + i + ": "));
            System.out.printf("%30s", items.get(i-1)); //zero base i
            System.out.println("\t\t" + costs.get(i-1)); //zero base i
            System.out.println();
        } //end of for loop
        //footer
        System.out.println("\n----------------------------------------------------------");
    } //end of inventory method

    static String menu()
    {
        //print menu
        System.out.println("----------------Menu----------------");
        System.out.println("-------Please select an option------");
        System.out.println("a) Print information about the store");
        System.out.println("b) Add an item to the inventory");
        System.out.println("c) Remove an item from the inventory");
        System.out.println("d) Modify an item in the inventory");
        System.out.println("e) Make A Purcase");
        System.out.println("f) Write a summary to a text file");
        System.out.println("g) Quit");
        //prompt choice
        String choice = sc.nextLine();
        while(true)
        {
            //if valid choice return
            if(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") ||
            choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d") ||
            choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("f") ||
            choice.equalsIgnoreCase("g"))

            //return choice
                return choice;
            //if not repromt
            else  
            {
                System.out.println("Invalid option, Please try again!");
                choice=sc.nextLine();
            }

        }//end of while loop

    } //end of menu method
    static void modify()
    {
        //get item numebr
        if(items.size() > 0)  //arraylist has elements
        {
            System.out.print("\nWhat is the number of the item you would like to modify? ");
            int itemToChange = (Integer.parseInt(sc.nextLine())-1); // -1 to 0 base it
            while(itemToChange >= items.size() || itemToChange < 0) //if larger than array or less than 0
            {
                System.out.println((itemToChange + 1) +" is not a valid item number");
                System.out.print("\nWhat is the number of the item you would like to remove? ");
                itemToChange = (Integer.parseInt(sc.nextLine())-1);
            }
            //display current item name
            System.out.println("What would you like '" + items.get(itemToChange) + "' to now be called?");
            //cahnge item name
            items.set(itemToChange, sc.nextLine());
            //display current cost
            System.out.println("What would you like '" + items.get(itemToChange) + "' to now be worth?");
            //cahnge current cost
            costs.set(itemToChange,Double.parseDouble(sc.nextLine()));
        }
        else //array list empty
        {
            System.out.println("unable to modify any items, as there are none!");
        }
    }

    static void addItem()
    { 

        //get item name and add to arraylist
        System.out.print("\nWhat is the name of the item you would like to add? ");
        items.add(sc.nextLine());
        //get item price and add to arraylist
        System.out.print("\nWhat is the price of the item you would like to add? ");
        costs.add(Double.parseDouble(sc.nextLine()));
        //success message
        System.out.println("\nAdded " + items.get(items.size()-1)  + " to the inventory at $" + costs.get(items.size()-1));

    } //end of addItem method

    static void removeItem()
    {
       if(items.size() > 0) //arraylist has elements
       {
        //get item positon and remove its name and price from array list
        //get item name and add to arraylist
        System.out.print("\nWhat is the number of the item you would like to remove? ");
        int itemToKill = (Integer.parseInt(sc.nextLine())-1); // -1 to 0 base it
        while(itemToKill >= items.size() || itemToKill < 0) //if larger than array or less than 0
        {
            System.out.println(itemToKill+1 + " is not a valid item number");
            System.out.print("\nWhat is the number of the item you would like to remove? ");
            itemToKill = (Integer.parseInt(sc.nextLine())-1);
        }
        items.remove(itemToKill);
        costs.remove(itemToKill);
        //success message
        System.out.println("Successfully removed item");
    }
    else //array list empty
        {
            System.out.println("unable to remove any items, as there are none!");
        }
    } //end of removeItem method

    static void makePurchase()
    {
        if(items.size() > 0) //arraylist has elements
       {
        //use a loop to continue asking 
        double totalPrice = 0; String choice = ""; int item = 0; //variables used through entire method 
        for(;!choice.equalsIgnoreCase("n"); item++) //no cancel, keep adding items
        {
            System.out.println("What number item would you like to purchase");
            int currentItem = (Integer.parseInt(sc.nextLine())-1); // -1 to 0 base it
            while(currentItem >= items.size() || currentItem < 0) //if larger than array or less than 0
            {
                System.out.println(currentItem+1 + " is not a valid item number");
                System.out.print("What number item would you like to purchase");
                currentItem = (Integer.parseInt(sc.nextLine())-1);
            }
            totalPrice += costs.get(currentItem);

            System.out.println("Successfully added " + items.get(currentItem) + " to cart your current total is $" + totalPrice);
            System.out.println("Would you like to continue? (Y/N): ");
            choice = sc.nextLine();
            while(!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")))
            {
                System.out.println("Invalid option, Please try again!");
                choice=sc.nextLine();  
            }
        }
        //print final stuff
        System.out.println("Thank you for your purchase of " + item + " items! You have been charged $" + totalPrice);
    }
    else //array list empty
        {
            System.out.println("unable to to purcase items, as there are none!");
        }
    } //end of makePurchase method

    static void printFile() throws IOException
    {
        //print all relevant information to a file
        //Set up a PrintWriter that will write a new File.]
        System.out.println("What would you like to name the file (do NOT add a file extension)");
        PrintWriter outFile = new PrintWriter(new File(sc.nextLine() +".txt"));
        //print logo to file 
        //print the logo
        outFile.println("     ___  _      _    ___      _______      ___     __  ____    _    ___ _____");
        outFile.println("    /   \\/ \\    / \\  /   \\__--- ___   |_____\\___\\  |  |/    \\  /  | /  // ____|");
        outFile.println("   /  ^  \\  \\  /   \\/  ^  \\__---   / /  __  \\ ___  |   __    \\|   |/  /| (___ ");
        outFile.println("  /  /_\\  \\\\ \\/ / \\ \\ /_\\  \\      / /|  | |  |\\  \\ |  |  \\    |      /  \\___ \\");
        outFile.println(" /  _____  \\\\__/  /\\ \\____  \\    / / |  |_|  | \\  \\|  |   |   |  |\\  \\  ____) | ___");
        outFile.println("/__/  /_/\\__\\    /_/\\_\\   \\__\\  / /___\\_____/__ \\__\\__|   |___|__| \\__\\|_____/  $$ \\");
        outFile.println("                                |______________--------------______________      $$ \\");
        outFile.println("                                               --------------______________-------$$ \\");
        outFile.println("                                                                           -------$$ /");
        outFile.println("                                                                                 $$ / ");
        outFile.println("                                                                                $$ /");  
        //print inventory to file
        //header
        outFile.println("\n----------------------------------------------------------");
        outFile.println("\nItem Number\t\tItem Name\t\tCost");
        outFile.println("\n----------------------------------------------------------");
        //for loop traversing both arrays 
        for(int i = 1; (i < costs.size()+1); i++) //i is not 0 based
        {
            outFile.printf("%10s",("\nItem " + i + ": "));
            outFile.printf("%30s", items.get(i-1)); //zero base i
            outFile.println("\t\t" + costs.get(i-1)); //zero base i
            outFile.println();
        } //end of for loop
        //footer
        outFile.println("\n----------------------------------------------------------");
        //The File isn't created until you close the PrintWriter
        outFile.close();
        System.out.println("File successfully made!");
    } //end of printFile method
} //end of class header
