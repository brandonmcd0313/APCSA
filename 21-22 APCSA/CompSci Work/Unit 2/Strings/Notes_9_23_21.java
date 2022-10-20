//Brandon McDonld
// 9-23-21
// Purpose: Start working with STRING VARIBLES

public class Notes_9_23_21
{
   public static void main(String[] args)
 {
    //New data type: STRING = holds a message
    // consisting of ASCII characters amd/or
    // escape sequences. Defined w/ quotation marks
    
    String str1 = "Singing in the rain";
    String str2 = "What a glorius feeling!";
    
    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);
    
    //Strings can  be CONCATENATED (put together)
    // using the + operator
    //Becuase + does more than one thing depending
    // on context, it is an OVERLOADED operator.
    
    //New data type: CHAR - holds a single ASCII
    // character. Defined with apostrophes.
    //Strings are composed of chars.
    
    char char1 = 'C';
    char char2 = '$';
    
    //The String CLASS (collection of info about a
    // data type) has a built-in ATTRIBUTE (property)
    // called LENGTH that holds the length of the
    // string as an int automatically.
    //You can access Length with DOT NOTATION.
    
    System.out.println("Length of str1: " + str1.length());
    System.out.println("Length of str2: " + str2.length());
    
    String str3 = str1 + " " + char1 + "\n" + char2
                                      + " " + str2;
    System.out.println(str3);
     
    /*
     * To find information about a class (Like String
     * or System) - its built-in properties & methods,
     * and what it's for - we use the API (Application
     * Program Interface). To find it, Google
     * "[class name]" Java API".
     */

 }
}