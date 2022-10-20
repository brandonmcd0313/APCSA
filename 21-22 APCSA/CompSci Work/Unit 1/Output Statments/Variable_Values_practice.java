//Brandon McDonld
// 9-21-21
// Purpose: Test my answers :O.

public class Variable_Values_practice
{
   public static void main(String[] args)
 {
    //make a pretty ASCII art
    int a = 3, b = -2;
    System.out.println("a = " + a + "   b = " + b + "   c = ");
    double c = 0.5;  
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    a = b;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    c = a;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    b = -4 *a;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    c = a + (b + 1) /2;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    a = 5; b = 26; c = 4;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    a += 3;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    b -= a;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    c /= a;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    b %= a;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    a = -3; b =27; c=7.2;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    a=(int) c;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    b = (int) (c/3);
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    c = (double) a /b;
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    c = (int) (a + b /3.0);
    System.out.println("a = " + a + "   b = " + b + "   c = " + c);
    
    
    
    
    
 }
}