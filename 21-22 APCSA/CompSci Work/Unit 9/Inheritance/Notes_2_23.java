// Brandon McDonald
// Date: 2-23-22
// Purpose: Start working with CLASS HIERARCHY

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

//Classes in Java are part of a CLASS HIERARCHY, where
// classes EXTEND other classes. (All classes are indirectly
// derived from the Object class.)
//
//A SUBCLASS extends a SUPERCLASS and INHERITS all
// of its properties and methods.
// A subclass is a member of the superclass.
//
//Our hierarchy: Phone -> Smartphone -> Android
// (A Smartphone IS A Phone, etc.)

public class Notes_2_23 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //instantiate the phone class
        Phone p1 = new Phone("Police Model", "911");
        p1.print();

        Smartphone p2 = new Smartphone("Blackberry",
                "(877) 227-4669", 1, false);
        p2.print();

        Android p3 = new Android("Dillon's phone", "(586) 305-1305",
        64, true, new String[] {"TikTok", "Messenger", "Snapchat", "Instagram",
            "GrubHub", "Among Us", "Youtube", "Apple Music"});
        p3.print();
    } //end of method
} //end of class header
