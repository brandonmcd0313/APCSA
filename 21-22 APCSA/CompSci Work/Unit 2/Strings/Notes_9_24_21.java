//Brandon McDonld
// 9-24-21
// Purpose: Quick demo of the String.replace() method.

public class Notes_9_24_21
{
   public static void main(String[] args)
 {
    String orig ="I'm happy it's Friday!";
    System.out.println(orig);
    //replace happy with ecstatic
    //doesn't change original string
    String updated = orig.replaceAll("happy","ecstatic");
    System.out.println("Original: " + orig);
    System.out.println("Updated: " + updated);
    
    //chain dot notation for multiple replacements
    updated = updated.replaceAll("ecstatic","sad")
             .replaceAll("Friday","Monday");
    System.out.println("Updated: " + updated);
             
   
 }
}