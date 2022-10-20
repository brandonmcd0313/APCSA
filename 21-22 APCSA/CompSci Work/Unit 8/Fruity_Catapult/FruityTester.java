// Brandon McDonald
// Date: 2 -17-22
// Purpose: Fruity Catapult

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class FruityTester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        Fruit fruit = new Fruit(20,25);
        //Declare 2-D array
        double[][] ranges = new double[8][8];
        //populate using nested loop
        for(int i = 0; i < ranges.length; i++) //length = first dimension
        {
            for(int j = 0; j < ranges[0].length; j++) 
            {
                fruit.setAngle((25 + (j*5))); //add 5 to angle
                ranges[i][j] = fruit.calculate();
            }
            fruit.setMs((20 + (i*5))); //add 5 to MPH
        } 

        //print data
        System.out.println("\t\t\t\t\t\tProjectile Distance (Metres)");
        System.out.print("M/S");
        for(int i = 0; i < ranges[0].length; i++)
        {
            System.out.print("\t\t" + (25 + (i*5)) + " deg"); 
        }
        System.out.println();
        System.out.println("==============================================================================================================================================");
        for(int i = 0; i < ranges.length; i++) //length = first dimension
        {
            System.out.print(20 + (i*5));
            for(int j = 0; j < ranges[0].length; j++) 
            {
                System.out.print("\t\t");
                System.out.printf("%1.2f",ranges[i][j]);
                System.out.print("m");
            }
            
            System.out.println();
        } 
    } //end of method

} //end of class header
