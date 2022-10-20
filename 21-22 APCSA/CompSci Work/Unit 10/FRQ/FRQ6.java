// Brandon McDonald
// Date:
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FRQ6 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {

    } //end of method

    public static int daysInYear(int year)
    {
        //366 days in a leap year
        //365 days in a non leap year

        //if disible by 400 is a leap year
        if(year % 400 == 0)
            return 366;
        //if disible by 4 and not divisble by 100 is a leap year
        else if(year % 4 == 0 && !(year % 100 == 0))
            return 366;
        //if it did not meet any of these it is NOT a leap year
        else 
            return 365;
    }
} //end of class header
