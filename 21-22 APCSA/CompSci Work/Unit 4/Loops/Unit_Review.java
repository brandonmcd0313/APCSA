// Brandon McDonald
// Date
// Purpose: 

import java.util.Scanner; //import library for standard input

public class Unit_Review //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //loop that terminates with user input
        int num =-1;
        //same as while(num < 0 || num % 2 != 0)
        while(!(num >= 0 && num % 2 == 0)) {
            System.out.println("Enter a positive even number! :");
            num = Integer.parseInt(sc.nextLine()); }
        
        System.out.println("Number accepted: " + num + "\n");
        
        //loop on a random number
        int rand = -1;
        while(rand != 5) {
            rand = (int)(Math.random()*(5-1+1)+1);
            System.out.println("Target: 5. Value: " + rand); }
   
        //elements of a for loop header:
        //variable declaration; boolean condition; post-operation
        for(int i = 0; i < 10; i++) {
            System.out.print(i + "\t"); }
            System.out.println();
        //(i) does not exist here as the scope ends above
        char letter = 'A';
        for(int i = 0; i < 12; i++) { //loops 12 times
            int number  = 1;
         for(int j = 0; j < 7; j++) { //loops 7 times EACH
           //code here runs (7*12) 84 times
           System.out.print(letter + "" + number + "\t");
           number++;
        }
        letter++; //increment letter's ASCII value
        System.out.println(); //new line
        }
    } //end of method
} //end of class header
