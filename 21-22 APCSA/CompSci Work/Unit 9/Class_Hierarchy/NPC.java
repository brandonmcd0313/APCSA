
public class NPC extends Character
{
    //no properties

    //constructor
    public NPC(String name, String type, int money, 
    String[] dialogue)
    {
        super(name, type, money, dialogue);
    }

    public void harvest(int monetaryGain)
    {
        System.out.print(name + " scams epicly for " + monetaryGain + " gold!");
        money += monetaryGain;
    }
}
