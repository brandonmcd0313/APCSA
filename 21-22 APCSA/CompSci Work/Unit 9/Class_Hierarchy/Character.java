
public class Character
{
    //properties
    protected String name, type;
    protected int money;
    protected String[] dialogue;
    
    //constructor
    public Character(String name, String type, int money, String[] dialogue)
    {
        this.name = name;
        this.type = type;
        this.money = money;
        this.dialogue = dialogue;
    }
    
    public void speak()
    {
        System.out.print(name + " the " + type + " says: ");
        System.out.println(dialogue[((int)(Math. random()*(2-0+1)+0))]);
    }
}
