//Properties
//double ms
//double angle

//METHODS
//mph getter
//angle getter
//angle modifier
//ms modifier
public class Fruit
{
    private double ms, angle;
    public Fruit(double ms, double angle)
    {
        this.ms = ms;
        this.angle = angle;
    }

    public double getMs()
    {
        return ms;
    }

    public double getAngle()
    {
        return angle;
    }

    public void setMs(double ms)
    {
        this.ms = ms;
    }

    public void setAngle(double angle)
    {
        this.angle = angle;
    }
    
    public double calculate()
    {
        return ((Math.pow(ms, 2)) * (Math.sin( 2 * Math.toRadians(angle))) / 9.8);
    }
}
