// Brandon McDonald
// Date: today
// Purpose: character

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Tester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        Fighter patty = new Fighter("Patrica the Pacifist", "Poor Fighter", 120, 
                new String[] {"War is very bad and makes me very sad.",
                    "I am vegan but i eat eggs sometimes",
                    "The world is a terrifing place and I want to go home"}, 10, 1);

        Wizard magic = new Wizard("Magic Man III", "Extreme Wizard", 10000,
                new String[] {"Wanna see a magic trick? *removes thumb*", 
                    "The true magic was love all along",
                    "My grandfather is dead but he used to be magical"}, 100, 9001);

        NPC al = new NPC("Albert Yankovic", "Simple Man", 5000, 
        new String []{"It's hard work and sacrifice, living in an Amish Paradise",
            "What's with these homies dissing my girl?, Why do they gotta front?",
            "I'm beginnin' to feel like a Rap God, Rap God, All my people from the front to the back nod, back nod"});
            
        patty.speak();
        magic.speak();
        al.speak();
        
        System.out.println();
        
        patty.swing();
        
        System.out.println();
        
        magic.heal();
        
        System.out.println();
        
        al.harvest(100);
    } //end of method
} //end of class header
