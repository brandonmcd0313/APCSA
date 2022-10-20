// Brandon McDonald
// Date: 1-10-2022
// Purpose: Work with 2D Arrays.

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_1_10_2022 //class header
{
    //For user input Java, we need to create a SCANNER object
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //Declare 2-D array
        int[][] numberGrid = new int[4][3];
        //populate grid using nested loop
        for(int i = 0; i < numberGrid.length; i++) //length = first dimension
        {
            for(int j = 0; j < numberGrid[0].length; j++) 
            {
                numberGrid[i][j] = 3 * i + j;
            }
        }

        //use a nested loop to traverse and print 
        for(int i = 0; i < numberGrid.length; i++) //length = first dimension
        {
            for(int j = 0; j < numberGrid[0].length; j++) 
            {
                System.out.print(numberGrid[i][j] + " ");
            }
            System.out.println(); //next line
        } 

        //2D array of strings
        String[][] cities = { {"Detroit", "Saginaw", "Cincinnati", "Oslo"},
                {"Tokyo", "Salt Lake City", "New York City", "Taipei"},
                {"Madrid", "Lansing", "Paris", "Nice"}
            };

        //traverse to determine longest and shortest in each and all groups
        String longest = cities[0][0];
        String shortest = cities[0][0];
        for(int i = 0; i < cities.length; i++)
        {
            //variables for longet/shortest for indivual array
            String groupLongest = cities[0][0];
            String groupShortest = cities[0][0];
            for(int j = 0; j < cities.length; j++)
            {
                //check group longest
                if(cities[i][j].length() > groupLongest.length())
                    groupLongest = cities[i][j];

                //check longest overall
                if(cities[i][j].length() > longest.length())
                    longest = cities[i][j];
            }
            
            System.out.println("Longest for group " + i + ": " + groupLongest);
        }
        System.out.println("Longest overall: " + longest);
    } //end of method
} //end of class header
