
//Brandon McDonald
// 10-29-21
// Purpose: Learn WHILE LOOPS

import java.util.Scanner; //import library for standard input
import java.util.Random; //import library for random number
public class Mini_Games_2 
{
   public static void main(String[] args)
  {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
     Random ran = new Random();
     int run=0;
   while(run==0)
     {
     //menu
     System.out.println("  ::::::::::: :::    ::: ::::::::::              :::     :::::::::   ::::::::      :::     :::::::::  ::::::::::    ");
     System.out.println("     :+:     :+:    :+: :+:                   :+: :+:   :+:    :+: :+:    :+:   :+: :+:   :+:    :+: :+:            ");
     System.out.println("    +:+     +:+    +:+ +:+                  +:+   +:+  +:+    +:+ +:+         +:+   +:+  +:+    +:+ +:+ ");
     System.out.println("   +#+     +#++:++#++ +#++:++#            +#++:++#++: +#++:++#:  +#+        +#++:++#++: +#+    +:+ +#++:++# ");
     System.out.println("  +#+     +#+    +#+ +#+                 +#+     +#+ +#+    +#+ +#+        +#+     +#+ +#+    +#+ +#+ ");
     System.out.println(" #+#     #+#    #+# #+#                 #+#     #+# #+#    #+# #+#    #+# #+#     #+# #+#    #+# #+# ");
     System.out.println("###     ###    ### ##########          ###     ### ###    ###  ########  ###     ### #########  ##########  ");
     System.out.println("");
     System.out.println("                                           GAME 1: THE PERPLEXER");
     System.out.println("\t\t\t\t\t\t ,------. ");
     System.out.println("\t\t\t\t\t\t/  .--.  ' ");
     System.out.println("\t\t\t\t\t\t|  |  |  |");
     System.out.println("\t\t\t\t\t\t`--'__.  | ");
     System.out.println("\t\t\t\t\t\t   |   .' ");
     System.out.println("\t\t\t\t\t\t   |___|");
     System.out.println("\t\t\t\t\t\t   .---. ");
     System.out.println("\t\t\t\t\t\t   `---'");
     System.out.println("");
     System.out.println("                                           GAME 2: PSYCHOTIC WORDS");
     System.out.println("\t\t\t\t\t\t ／￣￣￣￣￣￣￣＼");
     System.out.println("\t\t\t\t\t\t|               |");
     System.out.println("\t\t\t\t\t\t/へ.＿＿＿＿＿＿＿／");
     System.out.println("                                           GAME 3: UNDETERMINED NUMERICAL VALUE");
     System.out.println("\t\t\t\t\t\t   _  _    __ ");
     System.out.println("\t\t\t\t\t\t _| || |_ /  | ");
     System.out.println("\t\t\t\t\t\t|_  __  _|`| | ");
     System.out.println("\t\t\t\t\t\t _| || |_  | | ");
     System.out.println("\t\t\t\t\t\t|_  __  _|_| |_");
     System.out.println("\t\t\t\t\t\t  |_||_|  \\___/");
     System.out.println("                                           OPTION 4: TERMINATE PROGRAM");
     System.out.print("\n\n                                           WHICH GAME WOULD YOU LIKE TO PLAY? :");
     String choice = (sc.nextLine());
     //game 1
     if(choice.equalsIgnoreCase("1")) //if user chooses riddle game
     {
         //display riddle
         
         //create variables
        String correct = "n/a"; //place holder value
        String answer = "n/a"; //place holder value
        //logo
          System.out.print("\u000C"); //clear screen
          System.out.println("\t\t\t\t\tWELCOME TO THE PERPLEXER");
          System.out.println("\t\t\t\t\t\t ,------. ");
          System.out.println("\t\t\t\t\t\t/  .--.  ' ");
          System.out.println("\t\t\t\t\t\t|  |  |  |");
          System.out.println("\t\t\t\t\t\t`--'__.  | ");
          System.out.println("\t\t\t\t\t\t   |   .' ");
          System.out.println("\t\t\t\t\t\t   |___|");
          System.out.println("\t\t\t\t\t\t   .---. ");
          System.out.println("\t\t\t\t\t\t   `---'");
          System.out.println("");
          
          //display riddle
          System.out.println("\t\t\t\tPREPARE FOR PERPLEXION");
          System.out.println("\t\t\t\tWhat is a taco with no shell called?");
          //store correct answer as string 
          correct = "salad";
          answer = "n/a"; //place holder
         int i = 0; //guess count place holder
         //guess loop
         while(!answer.contains("salad") && i<3)
         {
         //prompt answer
           
           if(i==0) //first guess
           {
             System.out.print("\t\t\t\t\tWhat is your foolish answer??: ");
             }
             else //second or third
             {
                 System.out.print("\t\t\t\t\tIncorrect, try again: ");
                }
         //store user answer as string
          answer = sc.nextLine().toLowerCase();
         //add to guess count
         i++;
         // if correct break if not continue
         
         
        }
       
        
        if(answer.contains("salad")) //if correct answer
        {   
         //display user was correct
         System.out.println("\n\t\t\t\t\tCORRECT!! YOU ARE A CLEVER ONE");
         System.out.println("\n\t\t\t\t\tPress ENTER to continue");
         sc.nextLine();
        }
         else  //if incorrect
        {
          //display user was wrong and correct answer
          System.out.println("\n\t\t\t\t\tHAHA! YOU HAVE BEEN PERPLEXED!");
          System.out.println("\n\t\t\t\tYour answer was: " + answer);
          System.out.println("\n\t\t\t\tFOOLISH! The truth was: a bad salad");
          System.out.println("\n\t\t\t\t\tPress ENTER to continue");
          sc.nextLine();
        }
         //quit menu
         System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! What now?");
         System.out.print("\n\t\t\tEnter 'MENU' to return to the menu \t Enter" +
             " 'QUIT' to end program!  ");
        String input = sc.nextLine();
         //to menu
         i = 0; // set variable
        while(i==0) {
        if(input.equalsIgnoreCase("menu")) //user chooses menu
        {
           System.out.print("\u000C");
           i++;
        }
        else if(input.equalsIgnoreCase("quit")) //user choses quit
        {
            System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! Come back soon!");
            System.exit(0); //termination
             i++;
        }
        else ///error
        {
            System.out.println("\n\t\t\t\tInvalid option, please type one of the two choices!");
            input = sc.nextLine();
        }
      }
    }
        
        
         
     
     //game 2
     
     if(choice.equalsIgnoreCase("2")) //if user chooses mad libs
   {
         //mad libs insert here!
          //intro
          System.out.print("\u000C"); //clear screen
     System.out.println("\t\t\t\t\tWELCOME TO THE PSYCHOTIC WORDS");
     System.out.println("\t\t\t\t\t\t ／￣￣￣￣￣￣￣＼");
     System.out.println("\t\t\t\t\t\t|               |");
     System.out.println("\t\t\t\t\t\t/へ.＿＿＿＿＿＿＿／");
     System.out.println("\n\t\t\t\t\t\tPLEASE ANSWER THE FOLLOWING PROMPTS");
     
     //prompt with words to imput
     System.out.print("\n\t\t\t\t\t\tA Name: ");
     String name1 = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Different Name: ");
     String name2 = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Pet Name: ");
     String petName = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Small Object: ");
     String smallObject = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Larger Object: ");
     String object = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tAn Adjective: ");
     String adjective = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Place: ");
     String place = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tAn Animal: ");
     String animal = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Rude Name: ");
     String rudeName = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tAn Event: ");
     String event = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tAn Action Endng in -ing: ");
     String action = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Food: ");
     String food = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Household Appliance: ");
     String appliance = sc.nextLine();
     System.out.print("\n\t\t\t\t\t\tA Rude Insult (like 'I hate you'): ");
     String insult = sc.nextLine();
               
     //display paragraph with inserted messages
     System.out.print("\u000C"); //clear screen
     System.out.println(name1 + ": Hey my little " + smallObject.toLowerCase() + " i'm home!!");
     System.out.println(name2 + ": Welcome home my favorite " + adjective.toLowerCase() + " " 
              + object.toLowerCase());
     System.out.println(name1 + ": Where is " + petName.toLowerCase());
     System.out.println(name2 + ": They might be at " + place.toLowerCase());
     System.out.println(name1 + ": Why at " + place.toLowerCase());
     System.out.println(name2 + ": I don't know, that's just what " + animal.toLowerCase() + "'s do.");
     System.out.println(name1 + ": AND YOU LET THEM GO?");
     System.out.println(name2 + ": Don’t get sassy with me");
     System.out.println(name1 + ": THEN DON’T BE A " + rudeName.toUpperCase());
     System.out.println(name2 + ": HOW DARE YOU CALL ME A "  + rudeName.toUpperCase());
     System.out.println(name1 + ": HOW DARE YOU BE A "  + rudeName.toUpperCase());
     System.out.println(name2 + ": THAT IS IT!! AFTER " + event.toUpperCase() + " THIS IS WHAT YOU PULL");
     System.out.println(name1 + ": WHAT I PULL?? YOU RUINED " + event.toUpperCase() +
                           " BY " + action.toUpperCase() +" ON THE " + food.toUpperCase());
     System.out.println(name2 + ": I’M LEAVING AND TAKING " + petName.toUpperCase() +
                               " AND THE " + appliance.toUpperCase());
     System.out.println(name1 + ": YOU CAN TAKE " + petName.toUpperCase() + 
           " BUT THE " + appliance.toUpperCase() + " IS MINE");
     System.out.println(name2 + ": UGGGGHH I’M GOING TO MY MOTHERS AND " + insult.toUpperCase());
        
        //enter to continue
         System.out.println("\n\n\t\t\t\t\tPress ENTER to continue!");
         sc.nextLine();
         
          //quit menu
         System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! What now?");
         System.out.print("\n\t\t\tEnter 'MENU' to return to the menu \t Enter" +
             " 'QUIT' to end program!  ");
        String input = sc.nextLine();
         //to menu
         int i = 0; // set variable
        while(i==0) {
        if(input.equalsIgnoreCase("menu")) //user chooses menu
        {
           System.out.print("\u000C");
           i++;
        }
        else if(input.equalsIgnoreCase("quit")) //user choses quit
        {
            System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! Come back soon!");
            System.exit(0); //termination
             i++;
        }
        else ///error
        {
            System.out.println("\n\t\t\t\tInvalid option, please type one of the two choices!");
            input = sc.nextLine();
        }
       }
     }
     //game 3
     if(choice.equalsIgnoreCase("3")) //if user chooses number game
     {
         //display and set num
          //intro 
         System.out.print("\u000C"); //clear screen
         System.out.println("\t\t\t\t\tWELCOME TO UNDETERMINED NUMERICAL VALUE");
         System.out.println("\t\t\t\t\t\t   _  _    __ ");
     System.out.println("\t\t\t\t\t\t _| || |_ /  | ");
     System.out.println("\t\t\t\t\t\t|_  __  _|`| | ");
     System.out.println("\t\t\t\t\t\t _| || |_  | | ");
     System.out.println("\t\t\t\t\t\t|_  __  _|_| |_");
     System.out.println("\t\t\t\t\t\t  |_||_|  \\___/");
          
     
          //set a value for the game
          int value = (int)(Math.random() * (10 - 1 + 1) + 1);; //random 1 to 10
          
          //have user insert a guess
          System.out.print("\n\n\t\t\t\t\tGuess A Numerical Value between 1 and 10: ");
          int guess = -1;
          guess = Integer.parseInt(sc.nextLine());
         //guess loop (add an i++)
         int i = 1; //guess counter
         while(value != guess) {
             if(guess<value){
                 System.out.print("\n\n\t\t\t\t\tIncorrect, you guessed too low, try again: ");
             guess = Integer.parseInt(sc.nextLine());
                }
                else if(value<guess) {
               System.out.print("\n\n\t\t\t\t\tIncorrect, you guessed too high, try again: ");
             guess = Integer.parseInt(sc.nextLine()); 
                }
             
             i++;
            }
          
         //correct menu
         System.out.println("\n\t\t\t\t\tCORRECT! The number was " + value); 
         System.out.println("\n\t\t\t\t\tIt took you " + i + " tries!");
         //enter to continue
         System.out.println("\n\n\t\t\t\t\tPress ENTER to continue!");
         sc.nextLine();
         
          //quit menu
         System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! What now?");
         System.out.print("\n\t\t\tEnter 'MENU' to return to the menu \t Enter" +
             " 'QUIT' to end program!  ");
        String input = sc.nextLine();
         //to menu
       i = 0; // reset variable
        while(i==0) {
        if(input.equalsIgnoreCase("menu")) //user chooses menu
        {
           System.out.print("\u000C");
           i++;
        }
        else if(input.equalsIgnoreCase("quit")) //user choses quit
        {
            System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! Come back soon!");
            System.exit(0); //termination
             i++;
        }
        else ///error
        {
            System.out.println("\n\t\t\t\tInvalid option, please type one of the two choices!");
            input = sc.nextLine();
        }
      }
         //menu
         
         //correct
    }
     // option 4
     if(choice.equalsIgnoreCase("4")) //if user chooses quit
     {
         //terminate program
         System.out.print("\u000C"); //clear screen
         System.out.println("\n\t\t\t\tThanks for playing! Come back soon!");
         run=1; //fail safe
         System.exit(0); //terminate program
        }
   }
  }
}