// Function.java

package be.ukonline.mathlib;

/**
 * Function
 * 
 * @author Sébastien Combéfis
 * @version July 24, 2015
 */
public abstract class Function
{
	/**
	 * Gets the value of the function
	 * 
	 * @pre -
	 * @post The returned value contains the value of the function
	 *       for the specified "x" value
	 */
	public abstract double getValue (double x);
	
	/**
	 * Derives the function
	 * 
	 * @pre -
	 * @post The returned value contains the derivative function of this function
	 */
	public abstract Function derive();
}