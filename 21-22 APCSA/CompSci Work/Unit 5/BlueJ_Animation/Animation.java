// Brandon McDonald
// Date
// Purpose: 

import java.util.Scanner; //import library for standard input

public class Animation //class header
{
    public static void main(String[] args) throws InterruptedException //method header
    {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);

        String blue1 = "__/\\\\\\\\\\\\\\\\\\\\\\\\\\____/\\\\\\\\\\\\________________________________________________/\\\\\\\\\\\\\\\\\\\\\\_        ";
        String blue2 = " _\\/\\\\\\/////////\\\\\\_\\////\\\\\\_______________________________________________\\/////\\\\\\///__       ";
        String blue3 = "  _\\/\\\\\\_______\\/\\\\\\____\\/\\\\\\___________________________________________________\\/\\\\\\_____      ";
        String blue4 = "   _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\_____/\\\\\\____/\\\\\\_____/\\\\\\\\\\\\\\\\____________________\\/\\\\\\_____     ";
        String blue5 = "    _\\/\\\\\\/////////\\\\\\____\\/\\\\\\____\\/\\\\\\___\\/\\\\\\___/\\\\\\/////\\\\\\___________________\\/\\\\\\_____    ";
        String blue6 = "     _\\/\\\\\\_______\\/\\\\\\____\\/\\\\\\____\\/\\\\\\___\\/\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\____________________\\/\\\\\\_____   ";
        String blue7 = "      _\\/\\\\\\_______\\/\\\\\\____\\/\\\\\\____\\/\\\\\\___\\/\\\\\\_\\//\\\\///////______________/\\\\\\___\\/\\\\\\_____  ";
        String blue8 = "       _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\/___/\\\\\\\\\\\\\\\\\\_\\//\\\\\\\\\\\\\\\\\\___\\//\\\\\\\\\\\\\\\\\\\\___________\\//\\\\\\\\\\\\\\\\\\______ ";
        String blue9 = "        _\\/////////////____\\/////////___\\/////////_____\\//////////_____________\\/////////_______";

        StringBuffer sb1 = new StringBuffer("");
        StringBuffer sb2 = new StringBuffer("");
        StringBuffer sb3 = new StringBuffer("                    ,::::.._     ");
        StringBuffer sb4 = new StringBuffer("                  ,':::::::::.         ");
        StringBuffer sb5 = new StringBuffer("              _,-'`:::,::(o)::`-,.._   ");
        StringBuffer sb6 = new StringBuffer("            _.', ', `:::::::::;'-..__`. ");
        StringBuffer sb7 = new StringBuffer("         _.-'' ' ,' ,' ,\\:::,'::-`'''   ");
        StringBuffer sb8 = new StringBuffer("     _.-'' , ' , ,'  ' ,' `:::/         ");
        StringBuffer sb9 = new StringBuffer(" _..-'' , ' , ' ,' , ,' ',' '/::          ");

        boolean printed = false; char c = 'a'; //place holders
        for(int i = 0; printed == false; i++) {
            System.out.println("\u000C"); //clear screen
            c = blue1.charAt(i);
            sb1.insert(i,c);
            System.out.println(sb1);

            c = blue2.charAt(i);
            sb2.insert(i,c);
            System.out.println(sb2);

            c = blue3.charAt(i);
            sb3.insert(i,c);
            System.out.println(sb3);

            c = blue4.charAt(i);
            sb4.insert(i,c);
            System.out.println(sb4);

            c = blue5.charAt(i);
            sb5.insert(i,c);
            System.out.println(sb5);

            c = blue6.charAt(i);
            sb6.insert(i,c);
            System.out.println(sb6);

            c = blue7.charAt(i);
            sb7.insert(i,c);
            System.out.println(sb7);

            c = blue8.charAt(i);
            sb8.insert(i,c);
            System.out.println(sb8);

            c = blue9.charAt(i);
            sb9.insert(i,c);
            System.out.println(sb9);

            Thread.sleep(50); 
            if((i+1) == blue1.length()) { printed = true; }

        }

        String message = "Because we hate you!";
        System.out.println();
        System.out.print("\t\t\t\t");
        for(int i = 0; i< message.length(); i++)
        {
            System.out.print(message.charAt(i));
            Thread.sleep(50);
        }
        System.out.println();
    } //end of method
} //end of class header
