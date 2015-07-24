// Sinus.java

package be.ukonline.mathlib;

/**
 * Sinus function
 * 
 * @author Sébastien Combéfis
 * @author Alexandre Rucquoy
 * @version July 24, 2015
 */
public class Sinus extends Function
{
	@Override
	public double getValue (double x)
	{
		return Math.sin(x);
	}
}