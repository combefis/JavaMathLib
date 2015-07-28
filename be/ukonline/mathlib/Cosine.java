// Cosine.java

package be.ukonline.mathlib;

/**
 * Cosine function a * cos (bx + c)
 * 
 * @author Sébastien Combéfis
 * @version July 28, 2015
 */
public final class Cosine extends Function
{
	// Instance variables
	private final double a, b, c;
	
	/**
	 * Creates a new cosine function
	 * 
	 * @pre a, b != 0
	 * @post A new instance of this is created, representing the cosine function
	 *       a * cos (bx + c), with the specified parameters
	 */
	public Cosine (double a, double b, double c)
	{
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	@Override
	public double getValue (double x)
	{
		return 0;
	}
	
	@Override
	public Function derive()
	{
		return null;
	}
	
	/**
	 * Gets a string representation of the cosine function
	 * 
	 * @pre -
	 * @post The returned value contains a string representation of this cosine function
	 *       For example, the returned value can be:
	 *       cos (x)
	 *       cos (-2.0x)
	 *        -2.5 cos (3.0x + 5.0)
	 *        5.0 cos (-2.0x - 4.0)
	 */
	@Override
	public String toString()
	{
		return null;
	}
	
	/**
	 * Tests two cosine functions for equality
	 * 
	 * @pre -
	 * @post The returned value contains true if "o" is an instance of Cosine
	 *       who represents the same cosine function as this function, that is,
	 *       the a, b and c coefficients are the same
	 */
	@Override
	public boolean equals (Object o)
	{
		return false;
	}
}