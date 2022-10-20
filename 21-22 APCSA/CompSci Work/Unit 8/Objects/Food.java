// Brandon McDonald
// Date: 2-1-22
// Purpose: Using constructors and getter/setters to
// use objects

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

// Food Class
//
// Properties:
//  String name
//  String category
//  int calories
//
// Methods:
//  void print()
//  constructors
//  getter & setter methods

public class Food //class header
{
    //class variables (private)
    private String name, category;
    private int calories;

    //constructor
    //A CONSTRUCTOR is a special class method that runs
    // when you invoke the NEW keyword to create an
    // object
    //A constructor is public, has no return type, and
    // is the same as the class.
    public Food()
    {
        System.out.println("New object created");
        //assign default values
        name = "Generic Foodstuff";
        category = "Unknown";
        calories = -1;
    }

    //A constructor can be OVERLOADED to accept arguments,
    // and normally sets (initializes) the class variables
    // to the given values.
    public Food(String n, String cat, int cal)
    {
        name = n;
        category = cat;
        calories = cal;
    }

    public void print()
    {
        System.out.println(name + " (" + category +
            "): " + calories + " calories");
    }

    //Since class variables are private, you will often
    // write GETTER METHODS  to view them, or SETTER METHODS
    // to change their values

    //getter method for name
    public String getName()
    {
        return name;
    }

    //setter method for name
    public void setName(String name)
    {
        //The THIS keyword refers to the object the code
        // is called on. Use it to distinguish between
        // class variables and local variables of the
        // same name.
        
        this.name = name;
    }
    
    //getter method for calories
    public int getCalories()
    {
        return calories;
    }
} //end of class header
