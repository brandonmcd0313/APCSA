//Brandon McDonald
// 11-9-21
// Purpose: Create a random password using FOR LOOPS

import java.util.Scanner; //import library for standard input

public class Password_Generator 
{
    public static void main(String[] args) throws InterruptedException
    {
        //For user input Java, we need to create a SCANNER object,
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        String subset = "";
        for(int i=0; choice.equalsIgnoreCase("yes") && !subset.equalsIgnoreCase("e"); i++) {
            //declare variables
            int max = 0, min = 0, length = 0, bad1 = 0, bad2 = 0, bad3 = 0, bad4 = 0;

            //menu
            if(i==0){
                System.out.println("~~~~~Password Generator Menu~~~~~");
                System.out.println("\nWhich character subset would you like?:");
                System.out.println("--------------------------------------- ");
                System.out.println("A. Lowercase letters");
                System.out.println("B. Uppercase and lowercase letters ");
                System.out.println("C. Uppercase letters, lowercase letters, and numbers ");
                System.out.println("D. Uppercase letters, lowercase letters, numbers, and punctuation ");
                System.out.println("E. Quit Program ");
            }
            //set variables in an else if thing a ma bob
            System.out.print("\nWhich subset would you like?: ");
            subset = sc.nextLine();
            for(boolean b = false; b == false;)
                if(subset.equalsIgnoreCase("a")) {//A (lowercase)
                    min = 97; max = 122; b = true;
                    bad1 = 0; bad2 = 0; bad3 =0 ; bad4 = 0;}
                else if(subset.equalsIgnoreCase("b")) {//B (upper and lower case)
                    min = 65; max = 122; b = true;
                    bad1 = 91; bad2 = 96; bad3 =0 ; bad4 = 0;}
                else if(subset.equalsIgnoreCase("c")) {//C (upper, lower, and numbers)
                    min = 48; max = 122; b = true; 
                    bad1 = 91; bad2 = 96; bad3 =58 ; bad4 = 64;}
                else if(subset.equalsIgnoreCase("d")) {//D (upper, lower, numbers, and punctuation)
                    min = 33; max = 126; b = true; 
                    bad1 = 0; bad2 = 0; bad3 = 0 ; bad4 = 0;}
                else if(subset.equalsIgnoreCase("e")) {//E (quit)
                    System.out.println("\u000C\nThank you for using the password generator!"); 
                    System.exit(0); }
                else {//error handling
                    System.out.print("\nInvalid input, please try again"); 
                    subset = sc.nextLine();}
            //password length 
            System.out.print("Length?: ");
            length = Integer.parseInt(sc.nextLine());
            //java random number formula is Math.random()*(max-min+1)+min)
            //string to hold chars generated
            String result = "";

            for(int j = 0; j < length; j++) {//specified # of chars
                //generate a random number
                int rand = (int)(Math.random()*(max-min+1)+min);
                //while num is in bad range, retry
                while((rand >= bad1 && rand <= bad2) || (rand >= bad3 && rand <= bad4)) {
                    rand = (int)(Math.random()*(max-min+1)+min);}
                //cast to char and add to string
                char next = (char)rand;
                result+=next;
            }

            System.out.println("\nResult: " + result);

            //return statment
            System.out.println("\nWould you like to create another password? (yes or no):");
            choice = sc.nextLine();
        }
        //quit thing
        System.out.println("\u000C\nThank you for using the password generator!"); 
        System.exit(0); 
    }
}
