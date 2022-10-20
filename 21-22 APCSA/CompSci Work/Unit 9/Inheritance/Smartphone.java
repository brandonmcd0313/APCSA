//Smartphone extends Phone
public class Smartphone extends Phone
{
   //Smartphone inherits name & number from Phone
   //additional class variables
   protected int storage; //gb
   protected boolean touchScreen;
   
   //the constructor must call the SUPER CONSTRUCTOR
   // and pass it the necessary information
   public Smartphone(String name, String number,
   int storage, boolean touchscreen)
   {
       super(name,number);
       this.storage = storage;
       this.touchScreen = touchScreen;
    }
    
   public void print()
   {
       System.out.println("Smartphone: ");
       System.out.println(name);
       System.out.println(number);
       System.out.println(storage + " GB storage");
       if(touchScreen) System.out.println("Has touchscreen.");
       else System.out.println("No touchscreen.");
       System.out.println();
    }
}
