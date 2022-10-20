//Brandon McDonald
// 9-30-21
// Purpose: Test String Methods

import java.util.Scanner; //import library for standard input

public class String_Methods_Practice
{
    public static void main(String[] args)
    {
        String first = "abc", second = "def", third = "ghi";
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        third = first + "zz";
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        second = second + second;
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        third = second.substring(2,5);
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        first = "abc"; second = "def"; third = "ghi";
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        first = second.replace('d', 'c').replace('e','d');
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        second = second.toUpperCase();
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        first = "" + first.charAt(1) + second.charAt(0) + third.charAt(2);
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        first = "abc"; second = "def"; third = "ghi";
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        second = second.substring(1);
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        third= "" + third.indexOf('h') + third.indexOf('g');
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
        first += third.charAt(second.indexOf('e')) + "";
        System.out.println("\n1st=   " + first + " 2nd=   " + second + " 3rd=   " + third);
    }
}