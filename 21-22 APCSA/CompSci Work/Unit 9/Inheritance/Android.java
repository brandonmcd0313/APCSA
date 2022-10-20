public class Android extends Smartphone
{
   //Smartphone inherits name & number from Phone
   //additional class variables
   protected String[] apps;
   
   //the constructor must call the SUPER CONSTRUCTOR
   // and pass it the necessary information
   public Android(String name, String number,
   int storage, boolean touchscreen, String[] apps)
   {
       super(name, number, storage, touchscreen);
       this.apps = apps;
    }
    
   public void print()
   {
       System.out.println("Android: ");
       System.out.println(name);
       System.out.println(number);
       System.out.println(storage + " GB storage");
       if(touchScreen) System.out.println("Has touchscreen.");
       else System.out.println("No touchscreen.");
       System.out.println("Apps: ");
       for(String app : apps)
       System.out.println(app);
       System.out.println();
    }
}