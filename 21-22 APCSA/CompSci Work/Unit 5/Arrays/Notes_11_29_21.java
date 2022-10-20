// Brandon McDonald
// Date: 11-29-2021
// Purpose: Format string output

import java.util.Scanner; //import library for standard input

public class Notes_11_29_21 //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        String arg1 = "Tallahassee";
        String arg2 = "Florida";

        //printf() is used for FORMATING Strings //s/S is the type converter
        System.out.printf("%s", arg1); //prints as stated 
        System.out.println();  //indents the line
        System.out.printf("%S", arg1); //all UPPERCASE
        System.out.println("\n");  //indents the line

        System.out.printf("%15s%n", arg1); //blank spaces printed in front to fill the argument. 
        // %n ends the line after it i/s printed
        System.out.printf("%-15s%n", arg1); //The dash means it hass to be LESS than the argument

    } //end of method
} //end of class header
