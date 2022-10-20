// Brandon McDonald
// Date:
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FRQ5 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {

    } //end of method

    public static String convertTime(String amerFormat)
    {
        //convert amerFormat string to two ints and a string

        //get the first two characters
        int hour = Integer.parseInt(amerFormat.substring(0,2));
        System.out.println(hour);
        //get the fourth and fifth characters
        int minutes = Integer.parseInt(amerFormat.substring(3,5));
        System.out.println(minutes);
        //get last two characters
        String timeOfDay = amerFormat.substring(6);
        System.out.println(timeOfDay);
        //if past noon
        if(timeOfDay.equalsIgnoreCase("pm"))
            return ((hour + 12) + ":" + minutes);
        //not past noon
        else
            return (hour + ":" + minutes); 
    }

} //end of class header
