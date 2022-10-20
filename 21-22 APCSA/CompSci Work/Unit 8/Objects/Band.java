
public class Band
{
    private String name;
    private String[] members;
    private int albums;

    //class members
    public Band(String name, String[] members, int albums)
    {
        this.name = name;
        this.members = members;
        this.albums = albums;
    }

    //The toString() method controls what is returned when the object
    // is cast to a String, as in a println() statement.
    public String toString()
    {
        //build the output
        String output = name + " (";
        for(String m : members)
        {
            output += m + ", ";
        }

        output += ") : " + albums + " albums."; 

        //the toString() method is automatically used when we cast any object
        // to a String, including arrays (like "members" below)
        return output;
    }

    //compareTo() method takes in another Band as an argument
    public void compareTo(Band other)
    {
        if(this.members.length > other.members.length)
            System.out.println(this.name + " has more members than " + other.name);
        else
            System.out.println(this.name + " has the same or fewer mambers than " + other.name);
    }
}
