
public class PlayerCharacter extends Character
{
    //properties
    protected int hp;

    //constructor
    public PlayerCharacter(String name, String type, int money, 
    String[] dialogue, int hp)
    {
        super(name, type, money, dialogue);
        this.hp = hp;
    }
    
    public void changeHealth(int added)
    {
        hp += added;
    }
    
}
