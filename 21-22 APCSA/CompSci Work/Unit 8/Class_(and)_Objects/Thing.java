//Thing class
//
//Properties:
//String name
//String purpose
//
//Methods:
//constructor
//void setName()
//String getName()
//void setPurpose
//String getPurpose()

public class Thing
{
    //declare properties
    private String name, purpose;
    
    public Thing()
    {
      
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setPurpose(String purpose)
    {
        this.purpose = purpose;
    }
    
    public String getPurpose()
    {
        return purpose;
    }
}
