//Brandon McDonld
// 9-27-21
// Purpose: Look at String class method structure.

public class Notes_9_27_21
{
   public static void main(String[] args)
 {
    //The characters in a string each have a
    // numerical INDEX (position) starting with
    // zero. (ZERO-BASED INDEXING)
    //Valid indexes start with 0 and end with
    // the length of the string minus 1.
    
    //To access the char at an index
    //use carAt()
    //myString.charAt(0) would be first char.
    
    String str1 = "ABCEDF";
    char grade = str1.charAt(0);
    System.out.println("Your Grade: " + grade + " plus");
    
    //grade = str1.charAt(7);
    //If you try to access an invalid index, it creates
    // a RUNTIME EXCEPTION - an error that happens while
    // the code is running
    
    /*
     * A METHOD (a task for the code to run) is CALLED
     *  using dot notation to name:
     * - The class or object (variable) you're calling 
     *  it from
     * - The method name
     * - Any ARGUMENTS in parenteses
     */
    System.out.println("This is a method call!");
    //System = class name
    //println = method name
    //"This is a method call!" = argument
    
    //The ReplaceAll() method from the String class:
    String str2 = "No, Luke. I am your father.";
    String str3 = str2.replaceAll("father","prinicipal");
    System.out.println("Original: " + str2);
    System.out.println("Revised: " + str3);
 }
}