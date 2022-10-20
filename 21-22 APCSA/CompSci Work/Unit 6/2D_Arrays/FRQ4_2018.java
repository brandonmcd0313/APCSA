// Brandon McDonald
// Date: 1-14-2022
// Purpose: Prepare for the FRQ portion of the AP test

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists
import java.util.Random; //for random boolean
public class FRQ4_2018 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random(); // creating Random object
    public static void main(String[] args) throws InterruptedException //method header
    {
        int[][] arr2D = { {           0,   1,   2   },
                {           3,   4,   5   },
                {           6,   7,   8   },
                {           9,   5,   3   } };

        int[] result = getColumn(arr2D, 1);

        System.out.println(result);
    } //end of method

    /** Returns an array containing the elements of column c of arr2D in the same order as
     * they appear in arr2D.
     * Precondition: c is a valid column index in arr2D.
     * Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c)
    { /* to be implemented in part (a) */ 
        //decalre an an array of ints with same length as arr2D
        int[] column = new int[arr2D.length];
        //fill it with the c-th element in each row
        for(int i = 0; i < column.length; i++)
            column[i] = arr2D[i][c];

        return column;
    }

    /** Returns true if and only if every value in arr1 appears in arr2.
     * Precondition: arr1 and arr2 have the same length.
     * Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2)
    { /* implementation not shown */ 
        return rd.nextBoolean();}

    /** Returns true if arr contains any duplicate values;
     *          false otherwise.
     */
    public static boolean containsDuplicates(int[] arr)
    { /* implementation not shown */ 
        return rd.nextBoolean();}

    /** Returns true if square is a Latin square as described in part (b);
     *          false otherwise.
     * Precondition: square has an equal number of rows and columns.
     *               square has at least one row.
     */
    public static boolean isLatin(int[][] square)
    { /* to be implemented in part (b) */
        //if the first row has dupe values, false
        if(containsDuplicates(square[0])) return false;
        //if values in first row arent in ecah row, false
        for(int i = 1; i < square.length; i++) //for each other row
        {
            if(!hasAllValues(square[0],square[i])) return false;
        }
        //if the row values arent in each column, false
        for(int i = 0; i < square[0].length; i++)
        {
            if(!hasAllValues(square[0],getColumn(square, i))) return false;
        }
        //if we made it this far, true
        return true;
    }

} //end of class header
