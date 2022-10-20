/**
 * Annual Weather client class
 * 
 * @author Mr. Sanborn
 * @version 11-29-21
 */
import java.util.Scanner;
public class CityWeatherV1
{

    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner sc = new Scanner(System.in);  //will be used in 6.02

        String city = "China";  //choose a city from the table provided
        String state = "Texas";  //choose a city from the table provided

        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nev", "Dec" };     //complete initialization of months array
        double [] temperature ={52, 55, 62, 68, 75, 81, 82, 82, 78, 69, 60, 54};     //complete initialization of temperatures array
        double [] precipitation ={5.4, 4.9, 5.1, 5.9, 6.6, 6.9, 7.6,9.2, 7.9, 6.5, 4.5, 5.9};     //complete initialization of precipitation array

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        double avg = 0; double total = 0;

        //input to decide F/C and in/cm
        System.out.print("Would you like the tempature in Fahrenheit (F) or Celsius (C): ");
        tempLabel = sc.nextLine();
        System.out.print("Would you like the precipitation in Inches (in) or Centimetres (cm): ");
        precipLabel = sc.nextLine();
        // convert temp, if needed 
        boolean success1 = false; boolean success2 = false;
        while(!success1) {  
            if(tempLabel.contains("c") || tempLabel.contains("C")) { success1 = true;
                for(int i = 0; i < temperature.length; i++) temperature[i] = (temperature[i] - 32) * 5/9; }
            else if(tempLabel.contains("f") || tempLabel.contains("F")) {success1 = true;}
            else { System.out.print("Invalid Input, try again: "); tempLabel = sc.nextLine(); }}
        // convert prec, if needed
        while(!success2) {
            if(precipLabel.contains("c") || precipLabel.contains("C")) { success2 = true; 
                for(int i = 0; i < precipitation.length; i++) precipitation[i] = precipitation[i] * 2.54; }
            else if(precipLabel.contains("i") || precipLabel.contains("I")) { success2 = true; }
            else { System.out.print("Invalid Input, try again: "); precipLabel = sc.nextLine(); }}

        // calculate the average temperature
        for(int i = 0; i < temperature.length; i++) avg += temperature[i]; 
        avg = avg / temperature.length;
        // calculate the total precipitation
        for(int i = 0; i < precipitation.length; i++) total += precipitation[i]; 
        // print results (need to fix output formatting)

        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel.toUpperCase() + ")     Precipitation (" + precipLabel.toLowerCase() + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int i = 0; i < temperature.length; i++) {
            System.out.printf("%-3s\t\t", month[i]); 
            System.out.printf("%3.1f\t\t", temperature[i]); 
            System.out.printf("%3.1f\t\t", precipitation[i]); 
            System.out.println();  //indents the line
        }
       System.out.println("***************************************************");
        System.out.print("\tAverage: "); System.out.printf("%3.1f\t\t", avg);  
        System.out.print("Total: "); System.out.printf("%3.1f\t\t", total);
    }//end main
}//end class
