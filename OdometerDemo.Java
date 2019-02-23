import java.util.Scanner;

public class OdometerDemo
{
	public static void main(String[]args)
	{
		OdometerClass car;
		car = new OdometerClass();
		car.set_Miles(150);
		car.set_Fuel_Efficiency(25);
		car.add_miles(15);
		car.writeOutput();
		car.return_gallons();
		car.reset_Miles();
		car.writeOutput();

		
	}
}