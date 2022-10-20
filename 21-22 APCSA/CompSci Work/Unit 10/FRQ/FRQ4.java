// Brandon McDonald
// Date:
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FRQ4 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {

    } //end of method

    public static boolean isObtuse1(double side1, double side2, double side3)
    {
        //find which side is the longest
        //store then as a b and c for ease of use
        double a = 0, b = 0 , c = 0; //c is the largest
        if (side1 > c) {
            c = side1;
            b = side2;
            a = side3;
        }
        if (side2 > c) {
            c = side2;
            b = side1;
            a = side3;
        }
        if (side3 > c) {
            c = side3;
            b = side2;
            a = side1;
        }
        if (side1 == side2 || side2 == side3) //all equal
        {
            c = side3;
            b = side2;
            a = side1;
        }

        //if a^2 + b^2 > c^2 OBTUSE
        if((Math.pow(a, 2) + Math.pow(b, 2)) > Math.pow(c,2))
            return true; 
        //otherwise it is not
        else
            return false; 

    }
    
} //end of class header
