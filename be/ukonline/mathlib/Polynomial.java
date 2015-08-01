// Polynomial.java

package be.ukonline.mathlib;

/**
 * Polynomial function a0 + a1 * x + a2 * x^2 + ... + an * x^n
 * 
 * @author Sébastien Combéfis
 * @version August 1, 2015
 */
public final class Polynomial extends Function
{
	// Instance variables
	private final double[] coeff;
	
	/**
	 * Creates a new polynomial function
	 * 
	 * @pre coeff != null
	 *      coeff.length > 0
	 *      coeff[0] != 0
	 * @post A new instance of this is created, representing the polynomial function
	 *       of degree n = coeff.length - 1 of the form
	 *       coeff[0] * x^n + coeff[1] * x^(n-1) + ... + coeff[n]
	 */
	public Polynomial (double[] coeff)
	{
		this.coeff = null;
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
	 * Gets the degree of the polynomial
	 * 
	 * @pre -
	 * @post The returned value contains the degree of this polynomial
	 */
	public int degree()
	{
		return 0;
	}
}