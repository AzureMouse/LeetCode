/**
 * File:		TempConversion.java
 * Project:		LeetCode
 * Date:		12/06/22
 * Author:		AzureMouse
 * Description:	
 *
 * Converts celsius to fahrenheit and kelvin.
**/

public class TempConversion{
	public double[] convertTemparature(double celsius){
		// Given a non-negative floating point number rounded to two decimal places in celsius
        	// Concert Celsius into Kelvin and Fahrenheit and return both degrees converted in array

        	// Formulas
        	// Kelvin = Celsius + 273.15
        	// Fahrenheit = Celsius * 1.80 + 32.00
		
		double kConversion = celsius + 273.15;
		double fConversion = celsius * 1.80 + 32.00;

		return new double[] {kConversion, fConversion};
	}	
}
