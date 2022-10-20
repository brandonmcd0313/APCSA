//Brandon McDonld
// 9-24-21
// Purpose: Simulate the abbreviation found in text messages.

public class text_Message_coder
{
   public static void main(String[] args)
 {
    //store message
    String message = "That indivual who happens to present themselves as male," +
   " is acting very suspicous. I belive that he may be the" +  
   " charlatan that lives in the midst of our group.";
   // declare phrases to be abbrievated to user.
   System.out.println("Phrases to be abbreviated: ");
   System.out.println("That indivual who happens to present themselves as male,");
   System.out.println("very suspicous");
   System.out.println("I belive that he may be the charlatan");
   System.out.println("in the midst of our group");
   System.out.println("\n");
   // show string and length
   System.out.println("Original message: ");
   System.out.println(message);
   System.out.println("Length: " + message.length());
   // abreivate
   String updated = message.replaceAll("That indivual who happens to present themselves as male,","mans");
   updated = updated.replaceAll("very suspicous","sus");
   updated = updated.replaceAll("I belive that he may be the charlatan","He the impasta");
   updated = updated.replaceAll("in the midst of our group","Among us");
   //display fixed message
   System.out.println("\n new message: ");
   System.out.println(updated);
   System.out.println("Length: " + updated.length());
 }
}