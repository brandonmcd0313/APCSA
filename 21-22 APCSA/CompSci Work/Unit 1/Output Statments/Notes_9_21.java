//Brandon McDonld
// 9-21-21
// Purpose: Review for Unit 1 test!

public class Notes_9_21
{
   public static void main(String[] args)
 {
     // \n = newline ESCAPE SEQUENCE
     System.out.print("Line One \nLine Two\n"); 
     
     // \t = tab ESCAPE SEQUENCE
     System.out.println("One\tTwo\tThree");
     
     System.out.print("One");
     System.out.print("Two");
     System.out.println("Three");
     System.out.print("Four");
     System.out.println("Five");
     //println ends the line AFTER printing.
     
     //variable names legal or not?
     //myDouble : YES, I heart camelcase
     double myDouble;
     //double : NO, can't use reserved keywords
     //My_Double : YES, underscores are legal
                //but *should* start lowercase
     double My_Double = 4.5; //initialized
     //2ndDouble : NO, must start w/letter
     //my double : NO, no spaces allowed in names
     
     myDouble = (int)My_Double; //explicit cast
                  //then implicit cast to store it
     //myDouble now holds 4.0
     
     //modulus (remainder)
     System.out.print("14 % 4 = " + (14 % 4));
     
     
     
      
   
 }
}