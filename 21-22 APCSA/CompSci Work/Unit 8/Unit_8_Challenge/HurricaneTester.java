/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class HurricaneTester

{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {

        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        //convert the windspeed, determine categories, calculate sums
        index = 0;
        for(double speed : windSpeeds)
        {
            windSpeeds[index] = speed*1.15078;
            index++;
        }

        int [] categories = new int[numValues];
        index = 0;
        for(double speed : windSpeeds)
        {
            if(speed < 74)
                categories[index] = 0;
            else if(speed <= 95)
                categories[index] = 1;
            else if(speed <= 110)
                categories[index] = 2;
            else if(speed <= 129)
                categories[index] = 3;
            else if(speed <= 156)
                categories[index] = 4;
            else
                categories[index] = 5;
            index++;
        }
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricaneArr = new ArrayList<Hurricane>();
        for(int i = 0; i < categories.length; i++) {
            //varriables
            int y = years[i];
            String n = names[i]; 
            String m = months[i];
            int c = categories[i];
            int p = pressures[i];
            double w = windSpeeds[i];
            //add to array
            hurricaneArr.add(new Hurricane(y, n, m, c, p, w));
        }

        //user prompted for range of years
        int beginYear = beginYear();
        int endYear = endYear();

        //make sure there is data for these years
        boolean b = dataCheck(beginYear, endYear, years);
        while(!b)
        {
            System.out.println("There is no data for that range, try again.");
            beginYear = beginYear();
            endYear = endYear();
            b = dataCheck(beginYear, endYear, years);
        }
        //print the data

        //header
        System.out.println("Year       Name            Category   Pressure      Speed");
        System.out.println("==========================================================");
        int catMax = Integer.MIN_VALUE, catMin = Integer.MAX_VALUE; double catAvg = 0;
        int presMax = Integer.MIN_VALUE, presMin = Integer.MAX_VALUE; double presAvg = 0;
        double windMax = Integer.MIN_VALUE, windMin = Integer.MAX_VALUE, windAvg = 0;
        int catOnes = 0, catTwos = 0, catThrees = 0, catFours = 0, catFives = 0;
        double catCounter = 0, presCounter = 0, windCounter = 0, totalCounter = 0;
        for(Hurricane storm : hurricaneArr)
        {
            if((storm.getYear()) >= beginYear && (storm.getYear())<= endYear) //storm happened in range
            {
                System.out.println(storm);

                //mases and mins
                if(storm.getCat() > catMax) //bigger than max cat
                    catMax = storm.getCat();
                else if(storm.getCat() < catMin)
                    catMin = storm.getCat();

                if(storm.getPressure() > presMax)
                    presMax = storm.getPressure();
                else if(storm.getPressure() < presMin)
                    presMin = storm.getPressure();  

                if(storm.getWindspeed() > windMax)
                    windMax = storm.getWindspeed();
                else if(storm.getWindspeed() < windMin)
                    windMin = storm.getWindspeed();

                //get catCount
                if(storm.getCat() == 1)
                    catOnes++;
                else if(storm.getCat() == 2)
                    catTwos++;
                else if(storm.getCat() == 3)
                    catThrees++;
                else if(storm.getCat() == 4)
                    catFours++;
                else if(storm.getCat() == 5)
                    catFives++;

                catCounter += storm.getCat();
                presCounter += storm.getPressure();
                windCounter += storm.getWindspeed();
                totalCounter++;
            }
        }
        catAvg = catCounter / totalCounter;
        presAvg = presCounter / totalCounter;
        windAvg = windCounter / totalCounter;
        System.out.println("==========================================================");
        System.out.printf("%-15s","Average:");
        System.out.printf("%-10s"," ");
        System.out.printf("%8.3f",catAvg);
        System.out.printf("%-6s"," ");
        System.out.printf("%8.3f",presAvg);
        System.out.printf("%-3s"," ");
        System.out.printf("%8.3f",windAvg);
        
        System.out.println();
        
        System.out.printf("%-15s","Maximum:");
        System.out.printf("%-8s"," ");
        System.out.printf("%8d", catMax);
        System.out.printf("%-4s"," ");
        System.out.printf("%8d",presMax);
        System.out.printf("%-5s"," ");
        System.out.printf("%8.3f",windMax);
        
        System.out.println();
        
        System.out.printf("%-15s","Minimum:");
        System.out.printf("%-8s"," ");
        System.out.printf("%8d",catMin);
        System.out.printf("%-4s"," ");
        System.out.printf("%8d",presMin);
        System.out.printf("%-5s"," ");
        System.out.printf("%8.3f",windMin);
        
        System.out.println();
        
        System.out.println("Cat 1: " + catOnes);
        System.out.println("Cat 2: " + catTwos);
        System.out.println("Cat 3: " + catThrees);
        System.out.println("Cat 4: " + catFours);
        System.out.println("Cat 5: " + catFives);
    }

    static int beginYear()
    {
        System.out.print("What is the beginning year in your range?: ");
        return Integer.parseInt(sc.nextLine());
    }

    static int endYear()
    {System.out.print("What is the ending year in your range?: ");
        return Integer.parseInt(sc.nextLine());
    }

    static boolean dataCheck(int beginYear, int endYear, int[] years) {
        for(int y : years)
        {
            if(y >= beginYear && y<= endYear) //there IS a good value
            {
                return true;
            }
        }
        return false; //no good values
    }

}