// Brandon McDonald
// Date: 12-7-2021
// Purpose: Create a program to update a playlist of songs.

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Playlist//class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //declare arraylist of songs
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("'Cause for Concern' by Lovejoy");
        songs.add("'We throw parties, you throw knives' by Los Campesinos");
        songs.add("'The Holly & The Ivy' by Los Campesinos");

        //boolean for failsafe
        boolean loop = true;  //this is stupid why did i add this 
        //when i remove it the program just breaks so it stays for now...

        //user choice string to be reassigned
        String choice = "";
        //loop begins (while not quit)
        while(loop){ //loop boolean is a fail safe
            //print current playlist if empty message that says
            System.out.println("\nCurrent Playlist:");
            if(songs.isEmpty()) System.out.println("(empty)"); //if empty
            else { //not empty
                for(int i = 0; i < songs.size(); i++) {
                    System.out.print(i+1 + ") "); System.out.println(songs.get(i));} }
            //menu
            System.out.println("\nMenu:");
            System.out.println("A) Add a song\t\tB) Insert a song\tC) Remove a title");
            System.out.println("D) Remove a spot\tE) Reverse the list\tF) Clear all");
            System.out.println("\t\t\tQ) Quit");

            //get user input
            System.out.print("Your choice: "); //user choice
            choice = sc.nextLine();
            if(choice.toLowerCase().contains("a")) { //a add song
                //prompt user song
                System.out.print("Title of song to add: ");
                String newSong = sc.nextLine();
                //use songs.add
                songs.add(newSong); //adds to end
                //print that song added
                System.out.println("Added " + newSong +" to playlist.");
            }
            else if(choice.toLowerCase().contains("b")) { //b insert song
                //prompt user song
                System.out.print("Title of song to add: ");
                String newSong = sc.nextLine();
                //prompt user index
                System.out.print("Position to add song: ");
                int index = Integer.parseInt(sc.nextLine());
                //check if index fits
                if(index > songs.size() || index <= 0) {System.out.println("ERROR: Position not found in playlist");}
                else{
                    //use songs.add
                    songs.add((index-1),newSong);
                    //print that song added at index
                    System.out.println("Inserted " + newSong + " to playlist in Slot " + index);}
            }
            else if(choice.toLowerCase().contains("c")) { //c remove song with confirmation
                //prompt user song
                System.out.print("Title of song to remove: ");
                String newSong = sc.nextLine();
                //make sure song is in the array using for loop, if not shot an error
                boolean success = false; int j = 0; int index = 0;
                for(String song : songs) { j++;
                    if(newSong.equalsIgnoreCase(song)) {
                        success = true; index=j;}
                }
                if(success){songs.remove(index-1);
                    System.out.println("Removed " + newSong + " from playlist.");}//use songs.remove //print that song was removed
                else{System.out.println("ERROR: Title not found in playlist");}
            }  else if(choice.toLowerCase().contains("d")) { //d remove a spot
                //prompt user song
                System.out.print("Position to remove: ");
                int index = Integer.parseInt(sc.nextLine());
                //check if index fits
                if(index > songs.size() || index <= 0) {System.out.println("ERROR: Position not found in playlist");}
                else{
                    //use songs.remove
                    songs.remove((index-1));
                    //print that song was removed
                    System.out.println("Removed song at position " + index + " from plalist");}
            } 
            else if(choice.toLowerCase().contains("e")) { //e reverse the list

                //this is terrible and inefficient but somehow it works so please don't touch it :P

                //create a storage arraylist
                ArrayList<String> songStorage = new ArrayList<String>();
                //for loop stores with decrement operator
                for(int i = (songs.size()-1); i != -1; i--) {
                    songStorage.add((songs.get(i)));}
                //clear main
                songs.clear();
                //assign storage to main 
                for(String storedSong : songStorage) {
                    songs.add(storedSong); }
                //clear storage
                songStorage.clear();
                //print success
                System.out.println("The playlist has been reversed.");
            }
            else if(choice.toLowerCase().contains("f")) { //f clear all
                //clear list 
                songs.clear();
                //print success message
                System.out.println("The playlist has been cleared");
            } 
            else if(choice.toLowerCase().contains("q")) {loop = false; break; } //exits main loop, goes to exit //q quit
            else {}//else invalid input message 
        }

        while(true) { //always run
            //print playlist
            System.out.println("\u000C"); //clear
            System.out.println("Thank you for using the playlist program!");
            System.out.println("Here is your finished playlist:");
            if(songs.isEmpty()) System.out.println("(empty)"); //if empty
            else { //not empty
                for(int i = 0; i < songs.size(); i++) {
                    System.out.print(i+1 + ") "); System.out.println(songs.get(i));} }
            System.out.print("\t♪┏(・o･)┛♪"); Thread.sleep(250); System.out.print("\u000c"); //dance 1
            System.out.println("\u000C"); //clear
            //reprint playlist
            System.out.println("Thank you for using the playlist program!");
            System.out.println("Here is your finished playlist:");
            if(songs.isEmpty()) System.out.println("(empty)"); //if empty
            else { //not empty
                for(int i = 0; i < songs.size(); i++) {
                    System.out.print(i+1 + ") "); System.out.println(songs.get(i));} }
            System.out.print("\t♪┗ ( ･o･) ┓♪"); Thread.sleep(250); System.out.print("\u000c"); //dance 2
        }
    } //end of method
} //end of class header
