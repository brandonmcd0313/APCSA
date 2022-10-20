// Brandon McDonald
// Date: 2-9-2022                                                                                                                                                                                        
// Purpose: Use the toString() method; create collections of objects

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class bandTester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //create band objects
        Band b1 = new Band("Pink Floyd", new String[] {"Roger Waters",
                    "David Gilmore", "Barrett Jimson"},15);
        Band b2 = new Band("The Strokes", new String[] {"Julian Casablancas",
                    "FAB", "John Maus"}, 6);
        Band b3 = new Band("The Beatles", new String[] {"John Lennon",
                    "Paul McCartney", "Ringo Starr", "George Harrison"}, 67);

        //create an array of objects
        Band[] setlist = {
                b1, b2, b3, new Band("Santana", new String[] {"Carlos Santana",
                        "Jimmy Santana"}, 4)
            };
        //use a for-each loop to traverse and print the array
        for(Band b : setlist)
        {
            System.out.println(b);
        }

        setlist[0].compareTo(setlist[1]);
        setlist[2].compareTo(setlist[3]);
    } //end of method
} //end of class header
