// Brandon McDonald
// Date: 11-17-21
// Purpose: Start working with STRING ARRAYS

import java.util.Scanner; //import library for standard input

public class Seven_Strings //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //prompt user
        System.out.println("Enter seven U.S. states:");

        //declare array
        String[] states = {"", "", "", "", "", "", ""};

        //get input into an array
        for(int i = 0; i < 7; i++) { 
            states[i] = sc.nextLine(); }

        //output the area 

        System.out.println("\nYou entered:");
        for(int i = 0; i < 7; i++) {
            System.out.println(states[i]);}
            
        int index = 0; 
        int elementLength = states[0].length();
        for(int i=0; i< 7; i++) {
            if(states[i].length() > elementLength) {
                index = i; elementLength = states[i].length();
            }
        }
       
        System.out.println("\nLongest String: " + states[index]);
        
        for(int i=0; i< 7; i++) {
            if(states[i].length() < elementLength) {
                index = i; elementLength = states[i].length();
            }
        }
        
        System.out.println("\nShortest String: " + states[index]);
    } //end of method
} //end of class header
