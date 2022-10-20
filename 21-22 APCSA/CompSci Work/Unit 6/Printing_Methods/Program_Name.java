// Brandon McDonald
// Date
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Program_Name //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //print header
        printHeader();

        String choice = menuSelect();
        while(!(choice.equalsIgnoreCase("a")||choice.equalsIgnoreCase("b")||choice.equalsIgnoreCase("c")||choice.equalsIgnoreCase("d"))) {
            System.out.println("Invalid Selection\n");  
            choice = menuSelect();
        }

        if(choice.equalsIgnoreCase("a")) {
            System.out.println("Which alphabet? Greek or English?");
            String letter=favortieLetter(sc.nextLine());
            if(letter.equals("error")) {
                System.out.println("Invalid Selection\n"); }
            else{ 
                System.out.println("My favorite letter is " + letter + "\n");}
        }
        else if(choice.equalsIgnoreCase("b")) {
            System.out.println("Guess a number (has to be fun)");
            funNumber(Integer.parseInt(sc.nextLine()));}
        else if(choice.equalsIgnoreCase("c")) {
            System.out.println(numberCountries() + " are recognized by the UN\n");}
        else if(choice.equalsIgnoreCase("d")) {
            System.exit(0);}
    }

    static void printHeader() {
        // prints text describing program
        System.out.println("\t\t-̵̹̓-̷͚̤́-̷̮̰̈͋P̸̛̘r̵̡̮̾͗í̸̧n̵̛̜͔ẗ̷̢i̵̼̒͆n̷̥͙͗g̴̗̚ ̵̪͗Ḿ̶̩e̴̛̻t̷̬͕͊ḥ̵̝͌o̷̮͛d̷̜̥̅͝š̶̪̩̾ ̶̙̓P̵̲͋͝r̴̚ͅo̴͍̿ģ̷̮͐r̸̮̦̓́ǎ̶̱̏m̴͍͉̑̇-̸͔͙̐͆-̴̬̥̃-̶͍̀͋");
    }

    static String menuSelect() {
        //print options
        System.out.println("What would you like to do?");
        System.out.println("A) Print my favorite letter");
        System.out.println("B) Guess a fun number");
        System.out.println("C) Find out the number of countries recognized by the UN");
        System.out.println("D) Quit the program");
        //accept selection if valid
        String choice = sc.nextLine();

        //return selection
        return choice; 
    }

    static String favortieLetter(String alphabet) {
        //if english
        if(alphabet.equalsIgnoreCase("English")) {
            return "x";}
        else if(alphabet.equalsIgnoreCase("Greek")) {
            return "pi";}//else if greek
        else{ 
            return "error"; }

    }
   
    static void funNumber(int guess) {
        if(guess>7) {
            System.out.println("TOO HIGH!"); } //to high

        else if(guess<7) {
            System.out.println("TOO LOW!");}//to low
        else {
            System.out.println("CORRECT!");}//just right
    }
    
    static int numberCountries() {
        return 193; 
    }
} //end of class header
