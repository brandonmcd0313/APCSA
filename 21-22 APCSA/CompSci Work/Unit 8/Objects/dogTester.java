// Brandon McDonald
// Date: 1-31-22
// Purpose: Write additional classes

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class dogTester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //INSTANTIATE (create and object) the Dog class 
        Dog golden = new Dog();
        Dog pitbull = new Dog();
        Dog pug = new Dog();
        
        //assign values to Dog object
        golden.name = "Jeffrey";
        golden.weight = 70;
        golden.isTrained = false;
        
        pitbull.name = "Taurus";
        pitbull.weight = 130;
        pitbull.isTrained = true;
        
        pug.name = "Gargamel, Destroyer of Universes";
        pug.weight = 15;
        pug.isTrained = false;
        
        //call class methods
        golden.print();
        golden.bark();
        golden.train();
        golden.print();
        
        pitbull.print();
        
        pug.print();
        pug.bark();
    } //end of main method
} //end of class header
