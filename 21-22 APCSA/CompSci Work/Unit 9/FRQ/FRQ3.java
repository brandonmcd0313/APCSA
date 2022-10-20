// Brandon McDonald
// Date:
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FRQ3 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //decalre array
        double weights[] = {43.1, 72.3, 34.3, 69.2, 45.6, 52.7, 63.4, 
                48.9, 51.6, 47.4};

        //declare mas/min storers
        int max = 0; int min = 0;

        //for loop find max/min
        for(int i = 0; i < weights.length; i++)
        {
            if(weights[max] < weights[i])
                max = i;
            else if(weights[min] > weights[i])
                min = i;
        }
        
        //declare a total variable
        double total = 0;
        
        //for loop calculate averages
        for(int i = 0; i < weights.length; i++)
        {
            if(!(i == max || i == min))
            total += weights[i];
        }
        
        double average = (total/(weights.length-2));
        //print using for loop
        for(int i = 0; i < weights.length; i++)
        {
            if(!(i == max || i == min))
            System.out.print(weights[i] + "\t");
        }
        
        //print average
        System.out.println();
        System.out.println("Average: " + average);
        
    } //end of method
} //end of class header
