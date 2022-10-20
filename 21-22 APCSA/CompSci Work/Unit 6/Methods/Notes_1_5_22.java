// Brandon McDonald
// Date: 1-4-2022
// Purpose: Writing more static methods & using global variables.

public class Notes_1_5_22 //class header
{

    //To declare a GLOBAL VARIABLE that can be accessed
    // across all methods, use the static keyword and
    // declare it above the Main() method.
    //Declarations are the only code allowed outside
    // of methods.
    static String glob = "This is my global String!";

    public static void Main(String[] args)
    {
        System.out.println("Calling MoreThanTen()...");
        System.out.println("3 + 5 more than 10: " +
            MoreThanTen(3, 5));

        //You can use the method as a value of that type.
        if (MoreThanTen(-5, 41)) //this is a boolean method
            System.out.println("-5 + 41 is more than 10");
        else
            System.out.println("-5 + 41 isn't more than 10");

        //Any changes made to a LOCAL variable inside a
        // method only last for that method's duration
        // (scope); you can't change a different method's
        // local variable.
        String s = "The String is unchanged.";
        System.out.println("\nOriginal String: " + s);
        System.out.println("Global variable: " + glob);
        ChangeThis(s);
        System.out.println("After ChangeThis(): " + s);
        System.out.println("Global variable: " + glob);

        //Exception: If you pass a list or array as an
        // argument, any changes made will persist.
        String[] nums = { "one", "two", "three" };
        System.out.println("\nOriginal array:");
        for (String n : nums)
            System.out.println(n);
        ChangeThat(nums);
        System.out.println("\nAfter ChangeThat():");
        for (String num : nums)
            System.out.println(num);
    }

    static void ChangeThis(String s)
    {
        s = "The String was changed!";
        glob = "The global String was changed!";
    }

    static void ChangeThat(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            arr[i] = "BUTTS";
    }

    //static method with arguments & return value
    static boolean MoreThanTen(int a, int b)
    {
        //if the numbers add up to more than 10, true
        if (a + b > 10)
            return true;

        //otherwise, false
        else
            return false;

        //Once a method returns a value, it doesn't
        // run anymore.

    }

}
