import java.util.Scanner;

public class OdometerClass 
{
	private int miles_driven;
	private int fuel_efficiency;

	public void set_Miles(int miles)
	{
		miles_driven = 0;
		miles_driven+= miles;
	}

	public void reset_Miles()
	{
		miles_driven = 0;
	}
	public void set_Fuel_Efficiency(int efficiency)
	{
		fuel_efficiency = 0;
		fuel_efficiency+=efficiency;
	}
	public void add_miles(int miles)
	{
		miles_driven+= miles;
	}
	public void return_gallons()
	{
		int gallons =miles_driven/fuel_efficiency;
		System.out.println("Gallons Consumed: "+ gallons);
	}
	public void writeOutput()
	{
		System.out.println("Miles Driven: "+miles_driven);
		System.out.println("Fuel efficiency: "+fuel_efficiency);

	}


}