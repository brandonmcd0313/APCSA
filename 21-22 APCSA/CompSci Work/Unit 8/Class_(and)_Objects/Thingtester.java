// Brandon McDonald
// Date: 2-4-22
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Thingtester //class header
{
    //For user input Java, we need to create a SCANNER object
     static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws InterruptedException //method header
  {
      //declare things
      Thing pencil = new Thing();
      Thing monitor = new Thing();
      Thing teacher = new Thing();
      
      //set name
      pencil.setName("pencil");
      monitor.setName("monitor");
      teacher.setName("Mr. Sanborn");
      
      //set purpose
      pencil.setPurpose("writing important notes");
      monitor.setPurpose("helping to interact with the computer");
      teacher.setPurpose("being awesome beyond human comprehension");
      
      //get name/ purpose
      System.out.println("\nName: " + pencil.getName() + "\n Purpose: " + pencil.getPurpose());
     
      System.out.println("\nName: " + monitor.getName() + "\n Purpose: " + monitor.getPurpose());
      
      System.out.println("\nName: " + teacher.getName() + "\n Purpose: " + teacher.getPurpose());
   } //end of method
} //end of class header
