// Brandon McDonald
// Date: 1-31-22
// Purpose: Write additional classes

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class foodTester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //instatiate objects using the constructor
        Food slaw = new Food("Cole Slaw", "Vegetable", 250);
        Food mtndew = new Food("Mountain Dew", "Beverage", 170);
        Food bagel = new Food("Bagel", "Grain", 350);
        Food salmon = new Food("Salmon", "Fish", 500);
        slaw.print();
        mtndew.print();
        bagel.print();
        salmon.print();
        
        //using getters & setters
        System.out.println("\nChanging name of " + slaw.getName() + "\n");
        slaw.setName("Sanborn Slaw");
        slaw.print();
    
        if(bagel.getCalories() > salmon.getCalories())
        {
            System.out.println(bagel.getName() + " has more" +
            " calories than " + salmon.getName());
        }
        else
        {
            System.out.println(salmon.getName() + " has more" +
            " calories than " + bagel.getName());
        }
    } //end of main method
} //end of class header
