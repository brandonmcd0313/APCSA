//Brandon McDonald
// 11-9-21
// Purpose: Simulate a squirrel population using a MONTE CARLO SIMULATION

import java.util.Scanner; //import library for standard input
//File read/write libraies:
import java.io.File; //for reading files
import java.io.IOException; // for all File work
import java.io.PrintWriter; //for writing Files.

public class Monte_Carlo_Program 
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        //For user input Java, we need to create a SCANNER object,
        Scanner sc = new Scanner(System.in);

        //intro messgae
        String message = "Welcome to the Fox Squirrel Simulator";
        for(int i = 0; i< message.length(); i++)
        {
            System.out.print(message.charAt(i));
            Thread.sleep(25);
        }
        System.out.println();

        //get trial as an int
        System.out.println("\nHow many trials should be simulated?");
        System.out.print("Enter value greater than 1000: ");
        int trials = Integer.parseInt(sc.nextLine());

        while(trials<=1000) {
            System.out.print("\n  Please try again. Enter a number greater than 1000: ");
            trials = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Simulating trials now");
        message = "........";
        for(int i = 0; i< message.length(); i++)
        {
            System.out.print(message.charAt(i));
            Thread.sleep(250);
        }

        //Set up a PrintWriter that will write a new File.
        PrintWriter outFile = new PrintWriter(new File("testOut.txt"));

        double total = 0; //set variable
        for(int i = 0, j = 0; i < trials; i++) {
            int x = (int)(Math.random()*11);
            j=0; //reset variable
            while(x!=1) { //while not a foxy boy
                j++; //add animal
                x = (int)(Math.random()*11); //new rand num
            }
            outFile.println(j); //write completed trial to file
        }
        outFile.close();
        File fileName = new File("testOut.txt"); //relative location
        Scanner inFile = new Scanner(fileName);  //attach to file
        for(int k = 0; inFile.hasNext(); k=0)
        {
            k = Integer.parseInt(inFile.next()); //scan in the next token
            total+=k;
        }
        inFile.close(); //it's also tidy to close the reading Scanner
        System.out.println("\nResults: " + (total/trials) +
            " was the average amount of squirrels until a fox one was spotted!");
    }
}