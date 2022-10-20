
public class Wizard extends PlayerCharacter
{
    //properties
    protected int magicpower;

    //constructor
    public Wizard(String name, String type, int money, 
    String[] dialogue, int hp, int magicpower)
    {
        super(name, type, money, dialogue, hp);
        this.magicpower = magicpower;
    }
    
    public void heal()
    {
        System.out.println(name + " heals self for " + magicpower + " HP!");
        hp += magicpower;
    }
}
