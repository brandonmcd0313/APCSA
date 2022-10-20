// Brandon McDonald
// Date: 2-10-2022
// Purpose: Compare Computers

//Properties:
// String model
// String comments
// int buildYear
// double value
//
//Methods:
// Constructor
// Overloaded Constructors
//  Only a String model
//  Only two values
// void compareTo() 
//  no args
//  one int arg
//  one double arg
//  computer arg
public class Computer //class header
{
    //declare variables
    private String model,comments;
    private int buildYear;
    private double value;

    //constructors
    public Computer(String model, String comments, int buildYear, double value)
    {
        this.model = model; this.comments = comments;
        this.buildYear = buildYear; this.value = value;
    }

    public Computer(String model)
    {
        this.model = model;
        this.comments = "No additional comments.";
        this.buildYear = 2018;
        this.value = 500.00;
    }

    public Computer(String model, double value)
    {
        this.model = model;
        this.comments = "No additional comments.";
        this.buildYear = 2018;
        this.value = value; 
    }

    //compareTo()
    public void compareTo()
    {
        System.out.print("No arguments: ");
        //print this one summary
        System.out.print("The " + this.model + " is worth $" + this.value + ", so it's ");
        //how good computer
        {
            //if under 500 bad
            if(this.value < 500)
                System.out.println("probaly not very good.");
            //if over 500 but under 1250 decent
            else if(this.value < 1250)
                System.out.println("maybe runnable.");
            //if over 1250 hummina hummina
            else
                System.out.println("a top end computer.");
        }
    }

    //int
    public void compareTo(int buildYear){
        System.out.print("One int argument: ");
        if(this.buildYear >= buildYear)
            System.out.println(this.model + " was made after " + buildYear);
        else
            System.out.println(this.model + " was made before " + buildYear);
    }

    //double
    public void compareTo(double value)
    {
        System.out.print("One double argument: ");
        if(this.value >= value)
            System.out.println(this.model + " is worth more than $" + value);
        else
            System.out.println(this.model + " is worth less than $" + value);
    }

    //computer
    public void compareTo(Computer other)
    {
        System.out.println("One Computer argument: ");
        //use print f to print them next to each other
        System.out.printf("\t%-30s",this.model + ":");
        System.out.printf("%10s ", other.model + ":");

        System.out.println();

        System.out.printf("\t%-30s",this.comments);
        System.out.printf("%10s ", other.comments);

        System.out.println();

        System.out.printf("\t%-30s","Year: " + this.buildYear);
        System.out.printf("%10s ", "Year: " + other.buildYear);

        System.out.println();

        System.out.printf("\t%-30s","Value: $" + this.value);
        System.out.printf("%10s ", "Value: $" + other.value);
        
        System.out.println("\n");
    }
} //end of class header