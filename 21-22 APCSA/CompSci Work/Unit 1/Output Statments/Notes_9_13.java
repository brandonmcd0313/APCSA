//Brandon McDonld
// 9-13-21
// Purpose: Practice performing calculations in Java. 

public class Notes_9_13
{
   public static void main(String[] args)
 {
    //A message in quotes is called a STRING.
    //If it doesn't have quotes, it's called a VALUE.
    //These are both types of LITERAL (a non-variable element
    //presented as written).
    
    //System.out.print("message") prints the message;
    //System.out.print(value) EVALUATES and prints the value
    System.out.print("2 + 2 =");
    System.out.println(2 + 2);
    
    //Integer calculations can only give integer answers.
    //When you bring in one decimal value, it becomes a
    //decimal calulation. (Especially important for division)
    System.out.print("7 * -3 = ");
    System.out.println(7*-3);
    
    System.out.print("18 - 41 = ");
    System.out.println(18-41);
    
    System.out.print("23 / 4 = ");
    System.out.println(23/4);  //note the int calculation
    
    //The MODULUS operator (%) stores the REMAINDER of the
    //division problem.
    //Example 13 divided by 4 = 3 remainder 1
    //so 13 MOD 4 = 1
    System.out.print("17 % 5 = ");
    System.out.println(17%5);
    
    //Order of operations follows PEMDAS; parentheses work
    //from inside out.
    System.out.print("\n(5+7) / (4 - 18.0) = ");
    System.out.println((5+7) / (4 - 18.0));
  
  
  
 }
}