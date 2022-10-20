
public class Meal extends Food
{
    //additional class variables
    private String[] items;
    
    //constructor
    public Meal(String name, int calories, String[] items)
    {
        super(name, calories);
        this.items = items;
    }
    
    //additional class methods
    public void print()
    {
        super.print(); //ca;; print() from the Food class
        System.out.println("Meal elements:");
        for(String i : items)
        {
            System.out.println(i);
        }
        System.out.println();
    }
}