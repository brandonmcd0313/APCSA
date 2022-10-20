// Brandon McDonald
// Date: 1-6-2022
// Purpose: Practice Tracing Methods

public class Methods {
    public static void main(String[] args)
    {
        System.out.println("Retrieving values..."); 
        String critter = "antlion";
        boolean a = isCarnivore (critter);
        double b = geoMean (7, 9);
        String c = mysteryMethod (8, -3);
        /* Unrelated code and end of main() method. */
        System.out.println(a + "\t" + b + "\t" + c);
    }

    static boolean isCarnivore (String animal)
    {
        if(animal.contains ("bear") || animal.contains ("lion") || animal.contains ("tiger")) return true;
        else return false;
    }

    static double geoMean (double first, double second)
    {  double product = first * second;
        double geomean = Math.sqrt (product); //stores the square root of product 
        return geomean;
    }

    static String mysteryMethod (int x, int y)
    {
        String tracker = "#";
        if( x > 0 )
        { if(y > 0) tracker += "A"; else tracker += "B"; }
        else if(y > 0) tracker += "C";
        else tracker += "D";
        if( x > y )
        { if( x - y > 2) tracker += "E"; else tracker += "F"; }
        else tracker += "G";
        if( x + y > 10)
        { if(x == y) tracker += "H"; else tracker += "I"; }
        else if (x + y > 3)
        { if(x <= y) tracker += ""; else tracker += "K"; }
        else tracker += "L";
        return tracker;
    }
}//end class


