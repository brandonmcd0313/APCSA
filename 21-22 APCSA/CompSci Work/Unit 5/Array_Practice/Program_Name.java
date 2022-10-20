// Brandon McDonald
// Date
// Purpose: 

import java.util.Scanner; //import library for standard input
import java.util.ArrayList; //for ArrayLists

public class Program_Name //class header
{
  public static void main(String[] args) throws InterruptedException //method header
  {
     //For user input Java, we need to create a SCANNER object
     Scanner sc = new Scanner(System.in);
    
     int num1 = 0, num2 = 0; 		    			  	
String str1 = "a";		
System.out.println("num1: " + num1 + "\tnum2: " + num2 + "\tstr1: " + str1);
//initialize array & List (assume ArrayList library included)
int[] myArray = {1, 2, 3, 4};
ArrayList<String> myList = new ArrayList<String>();
myList.add("one");
myList.add("two");
myList.add("three");
myList.add("four");

//traversing with a for loop
for(int i = 0; i < myArray.length; i++)
 {
	if(i % 2 == 0) myArray[i] = 10;
     else myList.set(i, "ten");
 }							
num1 = myArray[2];
num2 = myArray[3];
str1 = myList.get(1);
	
System.out.println("num1: " + num1 + "\tnum2: " + num2 + "\tstr1: " + str1);

//ArrayList operations
myList.clear(); //reset myList
myList.add("five");
myList.add("six");
myList.add("seven");
myList.add(1, "ate");
myList.add(0, "nein");
str1 = myList.get(4);
num1 = myList.indexOf("six");
num2 = myList.indexOf("eight");

System.out.println("num1: " + num1 + "\tnum2: " + num2 + "\tstr1: " + str1);

//more ArrayList operations
myList.add(3, "yo");
myList.remove (2);
myList.remove("six");
num1 = myList.indexOf("nein");
num2 = myList.indexOf("seven");
str1 = myList.get(2);		

System.out.println("num1: " + num1 + "\tnum2: " + num2 + "\tstr1: " + str1);
   } //end of method
} //end of class header
