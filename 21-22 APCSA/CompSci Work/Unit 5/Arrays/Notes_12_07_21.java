
// Brandon McDonald
// Date: 12-7-21
// Purpose: Work with FOR EACH LOOPS.

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_12_07_21 //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        //The FOR-EACH LOOP is a specalized loop for
        // traversing a collection (array or list).
        //for(data_type temp_name : collection)
        // where temp_name is what you'll call each
        // indivual element as you traverse.

        //declare & populate an array & list
        String[] singers = { "Taylor Swift" , "Beck",
                "Adele", "Garth Brooks", "Mariah Carey"};
        ArrayList<String> bands = new ArrayList<String>();
        bands.add("U2"); bands.add("Los Campesinos"); bands.add("BTS");
        bands.add("Bon Jovi"); bands.add("REM");
        bands.add("Led Zeppelin"); bands.add("Justice");

        //use a foreach loop to traverse & print
        for(String singer : singers) System.out.println(singer);
        System.out.println();
        for(String band : bands) System.out.println(band);

        
    } //end of method
} //end of class header

