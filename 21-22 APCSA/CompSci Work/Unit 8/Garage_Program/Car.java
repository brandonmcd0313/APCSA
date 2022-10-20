// Brandon McDonald
// Date: 2-5-2022
// Purpose: car go vroom

//Properties
//String make
//String model
//String colour
//int mileage
//int year
//int parkSpot
//
//Methods
//Constructor
//void drive(int)
//void paint(String)
//void print()

public class Car
{
    //Property declaration
    private String make,model,colour;
    private int mileage,year,parkSpot;

    public Car(String make,String model, String colour, int mileage, int year, int parkSpot)
    {
        this.make = make; this.model = model; this.colour = colour;
        this.mileage = mileage; this.year = year; this.parkSpot = parkSpot;
    }

    public void drive(int miles)
    {
        this.mileage += miles;
    }

    public void paint(String colour)
    {
        this.colour = colour;
    }

    public void print()
    {
        System.out.println("Spot " + parkSpot + " - " + colour +
            " " + year + " " + make + " " + model + ", " + mileage + " miles");
    }
}

