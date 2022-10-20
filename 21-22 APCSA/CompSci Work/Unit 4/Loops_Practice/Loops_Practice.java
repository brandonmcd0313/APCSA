
//Brandon McDonald
// 11-8-21
// Purpose: Practice loops

import java.util.Scanner; //import library for standard input

public class Loops_Practice
{
    public static void main(String[] args) throws InterruptedException
    {
        //For user input Java, we need to create a SCANNER object,
        Scanner sc = new Scanner(System.in);

        int num1 = -3, num2 = 0;
        String str1 = "a";
        System.out.println("num1: " + num1 + "num2: " + num2 + "str1: " + str1);

        //while loos
        while(num1<num2)
        { num1 += 2;
            str1 += "a"; }

        System.out.println("num1: " + num1 + "num2: " + num2 + "str1: " + str1);

        str1 = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while(str1.length() < 7)
        {num1++;
            str1 += alphabet.charAt(num1);
            str1 += alphabet.charAt(num2);
            num2++;
        }

        System.out.println("num1: " + num1 + "num2: " + num2 + "str1: " + str1);
        
        //for loops
        str1 = "";
        for(int i = 4; i < 20; i += 3)
        str1 += alphabet.charAt(i);
         
        System.out.println("num1: " + num1 + "num2: " + num2 + "str1: " + str1);
        
        num2=0;
        for(num1 = 8; num1 < 50; num1+=10)
        if(num1%3==0) { num2 += num1; }
        
         System.out.println("num1: " + num1 + "num2: " + num2 + "str1: " + str1);
         
        str1 = "";
        for(int i = 0; i < 3; i++)
        {
            for(int j = 25; j > 22; j--)
            { str1 += alphabet.charAt(j); }
            str1 += alphabet.charAt(i);
        }
         System.out.println("num1: " + num1 + "num2: " + num2 + "str1: " + str1);
    }
}