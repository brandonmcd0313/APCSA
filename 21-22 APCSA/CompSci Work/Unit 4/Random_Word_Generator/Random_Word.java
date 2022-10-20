// Brandon McDonald
// Date
// Purpose: 

import java.util.Scanner; //import library for standard input
//File read/write libraies:
import java.io.File; //for reading files
import java.io.IOException; // for all File work
import java.io.PrintWriter; //for writing Files.

public class Random_Word //class header
{
    public static void main(String[] args) throws InterruptedException, IOException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);
        File fileName = new File("english3.txt"); //relative location
        

        //menu
        System.out.println("Welcome to the random word generator!");
        System.out.println("Press ENTER to generate word!"); 
        sc.nextLine();
        String token = ""; //declare variable
        String choice = ""; //declare variable
        int i = 0; int rand = 0;
        for(boolean b1=true; b1 == true;) {
           Scanner inFile = new Scanner(fileName);  //attach to file
            i=0; rand = (int)(Math.random()*(194433-1+1)+1); token = "";
            for(i = 0; inFile.hasNext(); i++)
            {
                token = inFile.next(); //scan in the next token
                if(i==rand) {
                    break; }
            }
            System.out.println("\nYour word is " + token);
            System.out.print("Would you like another word? Yes or no: ");
            choice = sc.nextLine();
            boolean b2 = false;
            while(b2==false) {
                if(choice.equalsIgnoreCase("yes")) {
                    b1 = true; 
                    b2 = true;
                }
                else if(choice.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using my services!"); System.exit(0);}
                else
                { System.out.print("Invalid input! try again please: ");
                    choice= sc.nextLine();
                }
            }
            inFile.close();
        }
    } //end of method
} //end of class header
