// Brandon McDonald
// Date:
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FRQ1 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //Declare Array
        int[] primes = new int[5];

        //Populate array
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;

        //Create total variable
        int total = 0;

        //for each loop adding to total
        for(int x : primes)
            total += x;

        //print total
        System.out.println("The total of the first five primes is " + total + "!");

    } //end of method
} //end of class header
