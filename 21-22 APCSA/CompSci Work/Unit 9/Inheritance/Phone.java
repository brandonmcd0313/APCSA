public class Phone
{
    //class variables
    //the PROTECTED access specifier os between public
    // and private, and makes ot visible to subclasses
    // only.
    protected String name;
    protected String number; //stored as (xxx) xxx-xxxx
    
    public Phone (String name, String number)
    {
        this.name = name;
        this.number = number;
    }
    
    public void print()
    {
        System.out.println("Phone: ");
        System.out.println(name);
        System.out.println(number + "\n"); 
        System.out.println();
    }
}
