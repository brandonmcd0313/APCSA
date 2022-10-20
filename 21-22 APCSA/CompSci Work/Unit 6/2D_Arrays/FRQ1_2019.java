// Brandon McDonald
// Date: 1-14-2022
// Purpose: Prepare for the FRQ portion of the AP test

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists
import java.util.Random; //for random boolean
public class FRQ1_2019 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random(); // creating Random object
    public static void main(String[] args) throws InterruptedException //method header
    {

    } //end of method

    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year)
    { /* implementation not shown */

        return rd.nextBoolean();}

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2)
    { // to be implemented in part (a) *
        //make a count variable
        int counter = 0;

        for(int i = year1; i <= year2; i++)
        {
            if(isLeapYear(i))
                counter ++;
        }

        return counter;
    }

    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */

    private static int firstDayOfYear(int year)
    { /* implementation not shown */ 
        return ((int)(Math.random() * ((7) + 1)));}

    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year)
    { /* implementation not shown */
        return((int)(Math.random() * 366));}

    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year)
    { /* to be implemented in part (b) */
        //figure out the offset of the cutrent day from the first day
        //subtract one since jan 1st is 1 not 0
        int offset = dayOfYear(month, day, year) % 7 - 1;
        return firstDayOfYear(year) + offset;
    }

        // There may be instance variables, constructors, and other methods not shown.

    } //end of class header