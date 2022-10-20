// Brandon McDonald
// Date: 1-18-22
// Purpose: Write more recursive algorithms. 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Notes_1_18_22 //class header
{
    //For user input Java, we need to create a SCANNER object
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException //method header
    {
        //get the nth Fibonnaci value
        System.out.print("Which Fibonnaci # do you want?: ");
        int fib = Integer.parseInt(sc.nextLine());
        System.out.println("Result: " + fibonacci(fib)); 

        //use recursion to print an array
        String[] words = {"ham", "sandwiches", "are", "high",
                "in" , "cholestorol"};
        printArray(words,0);
        
        //check if a number is prime
        System.out.println("\nCheck whether a number is prime?: ");
        int primeOrNot = Integer.parseInt(sc.nextLine());
        if(primeHelper(primeOrNot))
        System.out.println(primeOrNot + " is prime");
        else
        System.out.println(primeOrNot + " is not prime");
    } //end of method

    //recursive method to get a Fibonacci number
    //each # is the sum of the last two numbers
    //1, 1, 2, 3, 5, 8, 13, 21, 34...
    static int fibonacci(int n) //find the nth variable
    {
        //base case: n is 1 or 2, return 1
        if(n == 1 || n == 2)
            return 1;

        //recursive step: add the last two values
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //recursive method to traverse an array
    static void printArray(String[] arr, int index)
    {
        //base case: end of array (index == length
        if(index >= arr.length)
            return;
        //recursive step: handel current index
        // add one to index and run again
        else
        {
            System.out.println(arr[index]);
            printArray(arr, index + 1);
        }

    }
    //recurvise number to determine if a number is prime
    //a # is prime if it has no factors besides 1 & itself
    //repeatedly check target against current #
    static boolean isPrime(int target, int current)
    {
        //base case 1: current is 1, it's prime
        if(current == 1) return true;
        
        //base case 2: target is divisible by current
        // and current isn't one
        else if( target % current == 0) return false;
        
        //recurvive step: replace current by 1 & run again
        else return isPrime(target, current - 1);
    }
    
    //helper method to act as a filter for isPrime()
    static boolean primeHelper(int target)
    {
        //the biggest possible factor of a number besides itself 
        // is half of thatnumber
        
        //gives isPrime() result
        return isPrime(target, target/2); 
    }
} //end of class header
