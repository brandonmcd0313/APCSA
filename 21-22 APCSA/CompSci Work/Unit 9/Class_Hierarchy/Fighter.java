
public class Fighter extends PlayerCharacter
{
    //properties
    protected int strength;

    //constructor
    public Fighter(String name, String type, int money, 
    String[] dialogue, int hp, int strength)
    {
        super(name, type, money, dialogue, hp);
        this.strength = strength;
       
    }
    
    public void swing()
    {
        System.out.print(name + " ");
        
        if(strength < 5)
        System.out.print("pokes softly ");
        else if(strength < 20)
        System.out.print("somewhat slices ");
        else
        System.out.print("slashes violently ");
        
        System.out.println("for " + strength + " damage!");
    }
}
