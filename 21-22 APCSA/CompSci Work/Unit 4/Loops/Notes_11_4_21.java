//Brandon McDonald
// 11-4-21
// Purpose: read and write text Files.

import java.util.Scanner; //import library for standard input
//File read/write libraies:
import java.io.File; //for reading files
import java.io.IOException; // for all File work
import java.io.PrintWriter; //for writing Files.


public class Notes_11_4_21 //class header
{   
    //the main() method is going to potentially THROW an EXCEPTION
    //This must be specified in the header to work with Files
   public static void main(String[] args) throws IOException
 {
     //reading a File
     //Declare the File and attach a Scanner to it for reading.
     //The file name can be RELATIVE to the current folder,
     // or it can be an ABSOLUTE location on the computer.
     File fileName = new File("data6.txt"); //relative location
     Scanner inFile = new Scanner(fileName);  //attach to file
     
     //Use the hasNext() from the Scanner class to check
     // wheter there is another TOKEN (string seperated by spaces
     // or a line break) in the File.
     while(inFile.hasNext())
     {
         String token = inFile.next(); //scan in the next token
         System.out.println(token); //print it out to standard output
        }
     
     //Writing a File:
     System.out.println("\nCreating a new File called testOut.txt");
     
     //Set up a PrintWriter that will write a new File.
     PrintWriter outFile = new PrintWriter(new File("testOut.txt"));
     
     //The PrintWriter has its own print() and println() methods.
     outFile.println("Did it work?");
     outFile.println("\tIf you're seeing this in a file, than yes");
     
     //The File isn't created until you close the PrintWriter
     outFile.close();
     inFile.close(); //it's also tidy to close the reading Scanner
     
     //The MONTE CARLO METHOD involves running a series of random
     // trials to count how many tries it tales to get to a certain
     // outcome, than averaging the results.
     
     //How many tries on average to get a 10 when doing random 1-10?
     System.out.println("\nRunning Monte Carlo method with 1000 trails.");
     int trials = 0;
     int total = 0;
   }
 }
  