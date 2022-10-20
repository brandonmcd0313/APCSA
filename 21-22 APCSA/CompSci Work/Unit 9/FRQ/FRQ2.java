// Brandon McDonald
// Date:
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FRQ2 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //double arrays for testing
        double[] a1 = {1.2, 2.3, 3.4, 4.5, 5.6};
        double[] a2 = {1.0, 2.0, 3.0, 4.0, 5.0};

        //declare new array
        double[] sums = new double[5];

        //for loop populating with sums
        for(int i = 0; i < sums.length; i++)
            sums[i] = (a1[i] + a2[i]);

        for(int i = 0; i < sums.length; i++)
            System.out.println(a1[i] + " + " + 
                a2[i] + " = " + sums[i]);
                
    } //end of method
} //end of class header
