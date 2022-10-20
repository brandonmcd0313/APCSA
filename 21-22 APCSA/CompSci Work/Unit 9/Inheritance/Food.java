
public class Food
{
   //class variables
   protected String name;
   protected int calories;
   
   //constructor
   public Food(String name, int calories)
   {
       this.name = name;
       this.calories = calories;
    }
    
   //class methods
   public void print()
   {
       System.out.println(name + " (" + calories + " cal)");
    }
   
}
