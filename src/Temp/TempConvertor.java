/*Q2. Temperature Conversion – Interface for Calculation
Interface: Converter
Method:
convert(double value)
Implementing Classes:
CelsiusToFahrenheit → F = C × 9/5 + 32
FahrenheitToCelsius → C = (F – 32) × 5/9
CelsiusToKelvin → K = C + 273.15
Task:
Convert 10 values using mixed converters.
Print conversions in tabular form.
Find highest converted value.
Explanation:
Demonstrates:
Math logic in implementing classes
Common interface method
Use of interface-type array
Max value calculation
*/

package Temp;

import java.util.*;
public class TempConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		Converter converters[] = new Converter[size];
		double inputValue[] = new double[size];
		double result[] = new double[size];
		
		System.out.println("Enter "+size+" temperature values:");
        System.out.println("Choose type: 1 = C→F, 2 = F→C, 3 = C→K\n");
        
		for(int i = 0; i < size; i++)
		{
			System.out.print("Conversion" + (i+1)+ "type(1,2,3): ");
			int type = sc.nextInt();
			
			System.out.print("Enter the value: ");
			double val = sc.nextDouble();
			
			inputValue[i] = val;
			
			if(type == 1)
				converters[i] = new CelsiusToFahrenheit();
			else if(type == 2)
				converters[i] = new FahrenheitToCelsius();
			else
				converters[i] = new CelsiusToKelvin();
			
			result[i] = converters[i].convert(val);
		}
		
		System.out.println("\n----------------------------------------------");
	    System.out.println(" No | Input Value | Converted Value ");
	    System.out.println("----------------------------------------------");

	    for (int i = 0; i < size; i++) {
	    		System.out.printf(" %2d | %11.2f | %15.2f\n",
	    				i+1, inputValue[i], result[i]);
	    }
	    
	    double max = result[0];
	    for(int i = 0; i < size; i++)
	    {
	    		if(result[i] > max)
	    		{
	    			max = result[i];
	    		}
	    }
	    
	    System.out.println("----------------------------------------------");
        System.out.println("Highest Converted Value = " + max);
        System.out.println("----------------------------------------------");
	}

}
