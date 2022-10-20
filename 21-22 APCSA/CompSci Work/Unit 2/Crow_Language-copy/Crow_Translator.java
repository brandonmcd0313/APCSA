// Brandon McDonald
// 10-7-21
// Translate Crow Language'
       import java.util.Scanner;  // Import the Scanner class
class Crow_Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //retrive the orginal message
         System.out.print("Original Message: ");
        String crowMessage = sc.nextLine();
         //convert to uppercase for ease of use
        crowMessage = crowMessage.toLowerCase();
        //replace chars with respective translation
         String crowTranslated = crowMessage.replaceAll("w","A").replaceAll("v","B") //chaining dot notation
         .replaceAll("n","C").replaceAll("x","D").replaceAll("o","E").replaceAll("b","F")
         .replaceAll("z","G").replaceAll("r","H").replaceAll("h","I").replaceAll("m","J")
         .replaceAll("y","K").replaceAll("e","L").replaceAll("q","M").replaceAll("t","N")
         .replaceAll("l","O").replaceAll("u","P").replaceAll("f","Q").replaceAll("i","R")
         .replaceAll("a","S").replaceAll("c","T").replaceAll("g","U").replaceAll("j","V")
         .replaceAll("s","W").replaceAll("p","X").replaceAll("k","Y").replaceAll("d","Z");
        //display translated message
        System.out.println("Translated Message: " + crowTranslated);
        
    }
}
