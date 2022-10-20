// Brandon McDonald
// Date: 2-8-2022
// Purpose: Compare test scores?

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class TestScoreTester //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        TestScore ty = new TestScore("Tyroil Smoochie-Wallace II", 85.4);
        TestScore quat = new TestScore("Quatro Quatro II", 37.5);
        TestScore dg = new TestScore("D’Glester Hardunkichud II", 99);
        TestScore x = new TestScore("X-Wing @Aliciousness II" , 85.4);

        System.out.println(ty);
        System.out.println(quat);
        System.out.println(dg);
        System.out.println(x);

        System.out.println();

        System.out.println(ty.getName() + " scored " + ty.compareTo(quat)
            + " than " + quat.getName() + ".\n"); 

        System.out.println(quat.getName() + " scored " + quat.compareTo(dg)
            + " than " + dg.getName() + ".\n"); 

        System.out.println(dg.getName() + " scored " + dg.compareTo(x)
            + " than " + x.getName() + ".\n"); 

        System.out.println(ty.getName() + " scored " + ty.compareTo(x)
            + " than " + x.getName() + ".\n"); 

        System.out.println(x.getName() + " scored " + x.compareTo(ty)
            + " than " + ty.getName() + ".\n"); 
    } //end of method
} //end of class header
