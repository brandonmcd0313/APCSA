// Brandon McDonald
// Date: 11-17-21
// Purpose: Start working with STRING ARRAYS

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Seven_Strings_V2 //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //prompt user
        System.out.println("Enter seven U.S. states:");

        //declare array
        ArrayList<String> states = new ArrayList<String>();

        //get input into an array
        for(int i = 0; i < 7; i++) { 
            states.add(sc.nextLine()); }

        //output the area 

        System.out.println("\nYou entered:");
        for(int i = 0; i < 7; i++) {
            System.out.println(states.get(i));}
            
        int index1 = 0; int index2 = 0;
        int elementLength = states.get(0).length();
        for(int i=0; i< 7; i++) {
            if(states.get(i).length() > elementLength) {
                index1 = i; elementLength = states.get(i).length();
            }
            else if(states.get(i).length() < elementLength) {
                index2 = i; elementLength = states.get(i).length();
            }
        } 
       
        System.out.println("\nLongest String: " + states.get(index1));
        
        System.out.println("\nShortest String: " + states.get(index2));
        
        states.remove(index1-1);
        states.remove(index2-1);
        
        System.out.println("\nWith them removed: ");
        for(String state : states) System.out.println(state);
    } //end of method
} //end of class header
