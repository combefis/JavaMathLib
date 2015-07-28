// Sine.java

package be.ukonline.mathlib;

/**
 * Sine function a * sin (bx + c)
 * 
 * @author Sébastien Combéfis
 * @author Alexandre Rucquoy
 * @version July 26, 2015
 */
public final class Sine extends Function
{
	// Instance variables
	private final double a, b, c;
	
	/**
	 * Creates a new sine function
	 * 
	 * @pre a, b != 0
	 * @post A new instance of this is created, representing the sine function
	 *       a sin (bx + c), with the specified parameters
	 */
	public Sine (double a, double b, double c)
	{
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	@Override
	public double getValue (double x)
	{
		return Math.sin (x);
	}
	
	@Override
	public Function derive()
	{
		return null;
	}
	
	/**
	 * Gets a string representation of the sine function
	 * 
	 * @pre -
	 * @post The returned value contains a string representation of this sine function
	 *       For example, the returned value can be:
	 *       sin (x)
	 *       sin (-2.0x)
	 *        -2.5 sin (3.0x + 5.0)
	 *        5.0 sin (-2.0x - 4.0)
	 */
	@Override
	public String toString()
	{
		return null;
	}
	
	/**
	 * Tests two sine functions for equality
	 * 
	 * @pre -
	 * @post The returned value contains true if "o" is an instance of Sine
	 *       who represents the same sine function as this function, that is,
	 *       the a, b and c coefficients are the same
	 */
	@Override
	public boolean equals (Object o)
	{
		return false;
	}
}