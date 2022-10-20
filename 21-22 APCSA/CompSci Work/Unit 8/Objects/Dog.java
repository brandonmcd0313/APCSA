// Brandon McDonald
// Date: 1-31-22
// Purpose: Write additional classes

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

//A CLASS is a collection of PROPERTIES (ATTRIBUTES)
// and METHODS (FUNCTIONS)
//You create OBJECTS based on classes, which each have
// their own instances of the properties and methods.
//This is called OBJECT-ORIENTED PROGRAMMING (OOP).

//A CLASS DIAGRAM is a short list of the class's
// properties and methods.

//Dog class
//Properties:
//String name
//int weight
//bool isTrained
//
//Methods:
//void bark()
//void train()
//void print()

public class Dog //class header
{
    //CLASS VARIABLES belong to a particular object
    // and are non-static
    public String name;
    public int weight;
    public boolean isTrained;

    //CLASS METHODS
    public void bark()
    {
        System.out.println(name + " barks!");
    }

    public void train()
    {
        isTrained=true;
        System.out.println(name + " is now trained!");
    }

    public void print() //neatly print object info
    {
        System.out.print(name + " weighs " +
            weight + " pounds and ");
        if(isTrained) System.out.println("is well trained.");
        else System.out.println("is untrained.");
    }
} //end of class header
