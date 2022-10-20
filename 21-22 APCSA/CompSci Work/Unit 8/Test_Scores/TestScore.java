// Brandon McDonald
// Date: 2-8-2022
// Purpose: Compare test scores?

//Properties
//String name
//double score
//
//Methods
//Constructor
//Getter Methods
//String toString()
//String CompareTo(double)
public class TestScore
{
    private String name;
    private double score;
    
    public TestScore(String name, double score)
    {
        this.name = name;
        this.score = score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public String toString()
    {
        return (name + " scored " + score + " on the test.");
    }
    
    public String compareTo(TestScore other)
    {
        if(this.score < other.score) //scored lower
        {
            return "lower";
        }
        else if(this.score > other.score) //scored higher
        {
            return "higher";
        }
        else //scored the same
        {
            return "the same";
        }
    }
}
