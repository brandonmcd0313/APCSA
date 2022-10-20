//Brandon McDonald
// 11-11-21
// Purpose: Using loops to generate random numbers

import java.util.Scanner; //import library for standard input

public class Notes_11_11_21
{
    public static void main(String[] args) throws InterruptedException
    {
        //For user input Java, we need to create a SCANNER object,
        Scanner sc = new Scanner(System.in);

        System.out.println("Wander Franco has a batting average of .288, Simulating  25 at-bats.");
        //java random number formula is Math.random()*(max-min+1)+min)

        //variables to track hits and outs
        int hits = 0, outs = 0;
        for(int i = 0; i < 25; i ++) {//loop 25 times 
            double rand = Math.random();
            if(rand <= 0.288) hits++; //288 and lower = hit
            else outs++; //rest = out
        }

        //results
        System.out.println(hits +" hits");
        System.out.println(outs +" outs");

        //generate a random string of ABCs and 123s
        System.out.println("\nRandom ABC123 string");
        System.out.print("Length?:");
        int length = Integer.parseInt(sc.nextLine());

        //string to hold chars we generate
        String result = "";

        for(int i = 0; i < length; i ++) {//specified # of chars
            //49, 50, 51 = 123
            //65, 66, 67 = ABC
            //generate a random number #49-67
            int rand = (int)(Math.random()*(67-49+1)+49);
            //while num is in bad range(52-64), retry
            while(rand >= 52 && rand <= 64) {
             rand = (int)(Math.random()*(67-49+1)+49);}
            //cast to char and add to string
            char next = (char)rand;
            result+=next;
        }
        
        System.out.println("result: " + result);
    }
}