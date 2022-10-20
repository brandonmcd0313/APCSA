// Brandon McDonald
// Date: 2-24-2022
// Purpose: Work more with CLASS HEIRACHY

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_2_24 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //instantiate the classes
        Food burger = new Food("The Big Burger", 900);
        Snack chips = new Snack("Pringies", 250, 6.5);
        Meal combo = new Meal("Special Easter Meal", 1500,
                new String[] {"Egg", "Colour", "Yougurt", "Lard", 
                    "Mtn Dew", "pie"});
                    
        burger.print();
        chips.print();
        combo.print();
        
        //Objects in Java follow the principle of POLYMORPHISM. This means
        // that any object can be treated like an object of a class above it
        // in the heiharchy. You can use this to make collections of different
        // objects with a shared superclass.
        ArrayList<Food> allthefoods = new ArrayList<Food>();
        allthefoods.add(burger);
        allthefoods.add(chips);
        allthefoods.add(combo);
        
        //polymorphism allows us to call methods of the same name from
        // different classes. Writing a method of the same name in a subclass
        // is known as OVERRIDING a method.
        for(Food f : allthefoods)
        {
            f.print();
        }
    } //end of method
} //end of class header
