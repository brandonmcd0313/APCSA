import java.util.Random;
import java.util.Scanner; //import library for standard input
public class Example {
    public static void main(String[] args) {
        //For user input Java, we need to create a SCANNER object
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(); // creating Random object
        boolean quit = false;
        while(!quit) {
            System.out.print("How many trails?: ");
            int n = Integer.parseInt(sc.nextLine());
            int count = 0;
            for(int m = 0; m != n; count++) {
                if(rd.nextBoolean()) { m++; }
                else { m = 0; } 
            }
            System.out.println("The dog took "  + count + " tries to sit " + n + " times in a row!");
            System.out.print("Would you like to run another trial? y/n: ");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("y")) {}
            else if(choice.equalsIgnoreCase("n")) {quit = true;}
        }
    }
}