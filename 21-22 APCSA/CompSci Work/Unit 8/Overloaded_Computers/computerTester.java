// Brandon McDonald
// Date: 2-10-2022
// Purpose: Compare Computers

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class computerTester //class header
{
    //For user input Java, we need to create a SCANNER object
     static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws InterruptedException //method header
  {
     Computer dell = new Computer("The Dell Inspiron",
     "Basically a paperweight.", 2001, 50.00);
     
     Computer asus = new Computer("ASUS E203");
    
     Computer ryzen = new Computer("Ryzen 7 Gaming PC", 1800.00);
     
     dell.compareTo();
     dell.compareTo(2010);
     dell.compareTo(1000.00);
     dell.compareTo(asus);
     
     asus.compareTo();
     asus.compareTo(2005);
     asus.compareTo(200.00);
     asus.compareTo(ryzen);
     
     ryzen.compareTo();
     ryzen.compareTo(2015);
     ryzen.compareTo(1500.00);
     ryzen.compareTo(dell);
     
   } //end of method
} //end of class header
