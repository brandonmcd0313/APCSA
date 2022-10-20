
public class Snack extends Food
{
    //additonal class variables
    private double enjoyment; //out of 10
    
    //constructor
    public Snack(String name, int calories, double enjoyment)
    {
        super(name, calories); //call the superconstructor method
        this.enjoyment = enjoyment;
    }
    
    public void print()
    {
        //the SUPER keyword refers to the direct superclass of this one,
        // and can be used to call a method from there.
        super.print();
        System.out.println("Enjoyment Level: " + enjoyment + "\n");
    }
}
