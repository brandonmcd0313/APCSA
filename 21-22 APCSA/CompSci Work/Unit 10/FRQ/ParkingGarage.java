
public class ParkingGarage
{
    //current cars, gain tracker,max cappacity, fee
    private int cars, gain, maxCappacity;
    private double fee;
    public ParkingGarage(int maxCappacity, double fee)
    {
        this.maxCappacity = maxCappacity;
        this.fee = fee;
        cars = 0; gain = 0;
    }

    public void addCars(int num)
    {
        //if adding cars does not exceed the max
        if((cars + num) <= maxCappacity)
        {
            cars += num;
            gain += num;
        }
        //if it does, add as much as possible
        else
        {
            cars += (cars + num) - maxCappacity;
            gain += (cars + num) - maxCappacity;
        }
    }

    public void deleteCars(int num)
    {
        //if it won't go negative, just remove it
        if((cars - num)  >= 0)
            cars -= num;
        //if it will, set it to zero
        else
            cars = 0;
    }

    public double calcSales()
    {
        //gain * fee = profit
        return (gain * fee);
    }

}
