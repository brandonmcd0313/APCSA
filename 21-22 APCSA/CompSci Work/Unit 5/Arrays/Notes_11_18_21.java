// Brandon McDonald
// Date: 11-18-21
// Purpose: Start developing with arrays to store 
//          collections of data

import java.util.Scanner; //import library for standard input

public class Notes_11_18_21 //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //An ARRAY is a COLLECTION of values of the
        // same type. An array is declared using square
        // braces [] and the "new" keyword.
        int[] myArray = new int[4]; //array of 4 ints

        //Arrays are INDEXED the same ways as strings.
        myArray[0] = 11; //zero based indexing
        myArray[1] = 75;
        myArray[2] = -467;
        myArray[3] = 14;

        //An array has a fixed LENGTH that cannot be 
        // changed after it is declared.
        //This means is STATIC (unchanging)
        // rather than dynamic
        System.out.println("Length of myArray: " +
            myArray.length); 

        //You can use a loop and the length property
        // to TRAVERSE (visit each spot in) a colletion
        System.out.println("Elements in myArray :");
        for(int i = 0; i < myArray.length; i++) { //traversal
            System.out.print(myArray[i] + "\t");  }

        System.out.println("\n");

        //You can declare and initialize an array in one
        // statment using curly braces.
        String[] chickens = {"Rhode Island Red", "Fried",
                "Silkie", "Polish", "Leghorn", "Indian Game",
                "Jersey Giant", "Java", "Sussex"};

        //traverse and print this array
        System.out.println("Length of chickens array: " +
            chickens.length);
        for(int i=0; i < chickens.length; i++) {
            System.out.println(chickens[i]); }
            
        //display lrngth of each string
        for(int i=0; i < chickens.length; i++) {
            System.out.println(chickens[i].length()); }
    } //end of method
} //end of class header
