/**
 * Brandon McDonald
 * 09/17/21
 * 
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 */
    public class CalculationsV1
    {
        public static void main(String[] args)
        {
            // Addition
            System.out.println("Addition");
            System.out.print("25 + 9 = ");
            System.out.println(25 + 9);
            System.out.print("43.21 + 3.14 + 5.0 = ");
            System.out.print(43.21 + 3.14 + 5.0);
            System.out.println(); //line break

            // Subtraction
            System.out.println("Subtraction");
            System.out.print("16 - 9 - 25 = ");
            System.out.print(16 - 9 - 25);
            System.out.print("3.14 - 5.0 = ");
            System.out.print(3.14 - 5.0);
            
            System.out.println(); //line break

            // Multiplication
            System.out.println("Multiplication");
            System.out.print("25 * 9 = ");
            System.out.print(25 * 9);
            System.out.print("3.14 * 5.0 * 5.0 = ");
            System.out.print(3.14 * 5.0 * 5.0);
            System.out.println(); //line break

            // Division
            System.out.println("Division");
            System.out.print("9 / 25 = ");
            System.out.print(9/25);
            System.out.print("43.21 / 5.0 = ");
            System.out.print(43.21 / 5.0);
            System.out.println(); //line break

            // Modulus operator
            System.out.println("Modulus");
            System.out.print("16 % 9 = ");
            System.out.println(16 % 9);
            System.out.print("5.0 % 3.14 = ");
            System.out.print(5.0 % 3.14);
            System.out.println(); //line break

            // Lab Equations
            System.out.println("Lab Equations");
            //Translate these into code, and describe the calculation in the output as above.
            // 6 times 3.2 minus 8.7
            System.out.print("6 * 3.2 - 8.7 = ");
            System.out.println(6 * 3.2 - 8.7);
            // 15 divided by 2.5 times -2 plus 10 / 5
            System.out.print("((2.5 * -2) / 15) + (10 / 5) = ");
            System.out.println(((2.5 * -2) / 15) + (10 / 5));
            // 234 minus (234 divided by 6 modulus 12) + 3
            System.out.print("234 - (234 / (6 % 12)) + 3 = ");
            System.out.println(234 - (234 / (6 % 12)) + 3);
            // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
            System.out.print("(46.2 / 11) - 3 + (24 % (17 - 2 * 3)) = ");
            System.out.println((46.2 / 11) - 3 + (24 % (17 - 2 * 3)));
            // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
            System.out.print("480 / 10 / 12 + 200 * .5 - 20 % .5 * 8 = ");
            System.out.println(480 / 10 / 12 + 200 * .5 - 20 % .5 * 8);

            

        } // end of main method
    } // end of class