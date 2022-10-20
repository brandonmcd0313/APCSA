// Brandon McDonald
// Date: 11-17-21
// Purpose: Start working with STRING ARRAYS

import java.util.Scanner; //import library for standard input

public class Seven_Strings_V3 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    //global array of seven strings
    static String[] states = {"", "", "", "", "", "", ""};
    public static void main(String[] args) throws InterruptedException //method header
    {

        //prompt user
        System.out.println("Enter seven U.S. states:");

        //get strings into array
        populateArray();

        //output the area
        System.out.println("\nYou entered:");
        printArray(0);

        //get and print longest
        System.out.println("\nLongest String: " + longest(states[0],0));

        System.out.println("\nShortest String: " + shortest(states[0],0));
    } //end of method

    static void populateArray()
    {
        //get input into an array
        for(int i = 0; i < 7; i++) { 
            states[i] = sc.nextLine(); }
    } //end of populateArray

    static void printArray(int index)
    {
        //base case: end of array (index == length
        if(index >= states.length)
            return;
        //recursive step: handel current index
        // add one to index and run again
        else
        {
            System.out.println(states[index]);
            printArray(index + 1);
        }
    } //end of printArray

    static String longest(String longestString, int index)
    {
        //base case: end of array
        if(index >= states.length)
            return longestString;
        //keep looking for longest
        else
        {
            if(states[index].length() > longestString.length()) //if longer than longest
                longestString = states[index]; //set it as longest

            //recall the method with new longest and one more
            return longest(longestString, index + 1);
        }
    } //end of longest

    static String shortest(String shortestString, int index)
    {
        //base case: end of array
        if(index >= states.length)
            return shortestString;
        //keep looking for longest
        else
        {
            if(states[index].length() < shortestString.length()) //if shorter than shortest
                shortestString = states[index]; //set it as longest

            //recall the method with new longest and one more
            return shortest(shortestString, index + 1);
        }
    } //end of shortest
} //end of class header
