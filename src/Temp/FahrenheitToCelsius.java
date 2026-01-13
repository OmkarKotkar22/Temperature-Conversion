package Temp;

public class FahrenheitToCelsius implements Converter {

	public double convert(double F)
	{
		return (F - 32) * 5/9;
	}
}
