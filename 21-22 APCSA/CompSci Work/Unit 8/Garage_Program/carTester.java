// Brandon McDonald
// Date: 2-5-2022
// Purpose: car go vroom

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class carTester //class header
{
    //For user input Java, we need to create a SCANNER object
     static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws InterruptedException //method header
  {
     Car garage[ ] = new Car[3];
     garage[0] = new Car("Kawasaki", "KVF360 Prairie 4x4", "Silver", 8442, 2013, 7);
     garage[1] = new Car("Toyota", "Prius", "Black", 17843, 2002, 4);
     garage[2] = new Car("Chevrolet", "Silverado 3500", "Navy Blue", 64351, 2002, 5);
     
     String colours[] = new String[5];
     colours[0] = "Red"; colours [1] = "Orange"; colours[2] = "Yellow";
     colours[3] = "Green"; colours[4] = "Blue";
      
     for(Car vehicle : garage)
     {
        System.out.println("\nBefore:");
        vehicle.print();
        vehicle.drive((int)(Math. random()*501));
        vehicle.paint(randomColour(colours));
        System.out.println("After:");
        vehicle.print();
     }
   } //end of method
   
  public static String randomColour(String[] colours)
  {
      //java random numbers = (int)(Math. random()*(max-min+1)+min)
      int random = (int)(Math. random()*5);
      return colours[random];
  }
} //end of class header
