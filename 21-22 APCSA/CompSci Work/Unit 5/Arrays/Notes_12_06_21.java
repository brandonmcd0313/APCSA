
// Brandon McDonald
// Date: 12-6-21
// Purpose: Work with ArrayLists.

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_12_06_21 //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //The ArrayList is a DYNAMIC structure that grows or shrinks to
        // fit the data as needed.

        //The data type an ArrayList holds is declared w/arrow brackets.
        // The API sometimes specifies <T> for "Type".
        ArrayList<String> myList = new ArrayList<String>();

        //Instead of length, ArrayLists() use the size() method.
        //To add an element of the appropriate type to the ArrayList, use add(T).
        myList.add("Mortuary");
        myList.add("Apocrypha");
        myList.add("Synechdoche");
        myList.add("Sesquipedalian");

        //print size, traverse & print list
        //we index ArrayLists with the get(int) method
        System.out.println("Size of myList: " + myList.size());
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));}

        //Other useful ArrayList methods:
        //set(int, T) - Changes the given index to hold the given value.
        myList.set(2, "Photosynthetic");
        System.out.println("\nAfter changing index 2:");
        System.out.println("Size of myList: " + myList.size());
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));}

        //add(int, T) - Overload of the add() method that inserts the element
        // at the given position and pushes back everything after it.
        myList.add(3, "Paramour");
        myList.add(2, "Truculent");
        myList.add(0, "Phantasmorgoria");

        System.out.println("\nAfter adding elements:");
        System.out.println("Size of myList: " + myList.size());
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));}

        //indexOf(T) - Returns the first position of the given element, or -.
        System.out.println("\nIndex of 'Truculent': " +
            myList.indexOf("Truculent"));
        System.out.println("\nIndex of 'Cow': " + myList.indexOf("Cow"));

        //remove(T) or remove(int) - Removes an element or an index, then
        // everything after it moves back one position.
        myList.remove("Paramour"); //removes first instasnce of "Paramour"
        myList.remove(0); //removes current position 0.
        System.out.println("\nAfter removing 'Paramour' and index 0:");
        System.out.println("Size of myList: " + myList.size());
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));}
    } //end of method
} //end of class header
