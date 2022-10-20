//Brandon McDonald
// 10-14-21
// Purpose: Make a few mini games and a menu

import java.util.Scanner; //import library for standard input

public class Mini_Games_1
{
  public static void main(String[] args)
  {
     //For user input Java, we need to create a SCANNER object,
     Scanner sc = new Scanner(System.in);
      
     //main menu! 
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
     //get input on which game as an int 
     System.out.print("\n\n                                           WHICH GAME WOULD YOU LIKE TO PLAY? :");
     String choice = (sc.nextLine());
      if(choice.equalsIgnoreCase("1")) //if user chooses riddle game
     { 
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
        //random riddle choser out of 3 stored as int
        double riddle = (Math.random());  //random number between 0.0 and 1.0
     if(riddle<0.31) //riddle 1
      {
          //display riddle
          System.out.println("\t\t\t\tPREPARE FOR PERPLEXION");
          System.out.println("\t\t\t\tI give milk and I have a horn, but I’m not a cow. What am I?");
          //store correct answer as string 
          correct = "a milk truck";
          //store user answer as string
          System.out.print("\t\t\t\t\tWhat is your foolish answer??: ");
          answer = sc.nextLine();
        }
      if(0.3<riddle && riddle<0.61) //riddle 2
      {   
          //display riddle
          System.out.println("\t\t\t\t\tPREPARE FOR PERPLEXION");
          System.out.println("\t\t\t\tWhy is England the country with the most rain?");
          //store correct answer as string 
          correct = "the queen has reigned there for years";
          //store user answer as string
          System.out.print("\t\t\t\tWhat is your foolish answer??: ");
          answer = sc.nextLine();
        }
      if(0.6<riddle) //riddle 3
      {
          //display riddle
          System.out.println("\t\t\t\t\tPREPARE FOR PERPLEXION");
          System.out.println("\t\t\t\tI have a neck but no head, and I wear a cap. What am I?");
          //store correct answer as string 
          correct = "A bottle";
          //store user answer as string
          System.out.print("\t\t\t\tWhat is your foolish answer??: ");
          answer = sc.nextLine();
        }
      if(correct.equalsIgnoreCase(answer)) //if correct answer
      {   
         //display user was correct
         System.out.println("\n\t\t\t\t\tCORRECT!! YOU ARE A CLEVER ONE");
        }
      else  //if incorrect
      {
          //display user was wrong and correct answer
          System.out.println("\n\t\t\t\t\tHAHA! YOU HAVE BEEN PERPLEXED!");
          System.out.println("\n\t\t\t\tYour answer was: " + answer);
          System.out.println("\n\t\t\t\tFOOLISH! The truth was: " + correct);
        }
      }
  
      
      else if(choice.equalsIgnoreCase("2")) //if user choses mad libs
      {
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
     System.out.print("\n\t\t\t\t\t\tA Rude Insult: ");
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
        }
        
        
      else if(choice.equalsIgnoreCase("3")) //if user chooses number game
      {
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
          int guess = Integer.parseInt(sc.nextLine());
          
          
      if(value==guess) //correct guess
      {
          //display victory message
          
          System.out.println("\n\n\t\t\t\t\tYOU DID IT!!! " + guess + " WAS CORRECT!!!");
        }
      else if(guess>value) //incorrect higher
      {
          //display lose message and correct answer
          
          System.out.println("\n\n\t\t\t\tSorry that was wrong :/ " + value + 
                   " was correct and you guessed " + guess + " which is too high");
      
        }
      else if(guess<value) //incorrect lower
      {
          System.out.print("\n\n\t\t\t\tSorry that was wrong :/ " + value + 
                   " was correct and you guessed " + guess + " which is too low");
        }
    }
    else //bad game answer
    {
       System.out.print("\u000C"); //clear screen
       System.out.println("THAT IS NOT ONE OF MY ESTEEMED GAMES >:(");
    }
   }
 }
