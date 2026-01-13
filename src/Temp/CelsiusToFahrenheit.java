package Temp;

public class CelsiusToFahrenheit implements Converter {

	public double convert(double C)
	{
		return C * 9/5 + 32;
	}
}
