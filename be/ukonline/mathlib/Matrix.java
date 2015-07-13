// Matrix.java

package be.ukonline.mathlib;

/**
 * Matrix of real numbers
 * 
 * @author Sébastien Combéfis
 * @version June 21, 2015
 */
public final class Matrix
{
	// Instance variables
	private final double[][] data;
	
	/**
	 * Creates a new matrix filled with zeros
	 * 
	 * @pre m, n > 0
	 * @post A new instance of this is created, representing a matrix
	 *       with "m" rows and "n" columns, whose elements are set to zero
	 */
	public Matrix (int m, int n)
	{
		data = new double[m][n];
	}
	
	/**
	 * Gets the number of rows of the matrix
	 * 
	 * @pre -
	 * @post The returned value contains the number of rows of this matrix
	 */
	public int nbRows()
	{
		return 0;
	}
	
	/**
	 * Gets the number of columns of the matrix
	 * 
	 * @pre -
	 * @post The returned value contains the number of columns of this matrix
	 */
	public int nbColumns()
	{
		return 0;
	}
	
	/**
	 * Gets an element of the matrix
	 * 
	 * @pre 1 <= i <= nbRows()
	 *      1 <= j <= nbColumns()
	 * @post The returned value contains the element of this matrix
	 *       at the ith row and jth column
	 */
	public double get (int i, int j)
	{
		return 0;
	}
	
	/**
	 * Tests whether the matrix is squared
	 * 
	 * @pre -
	 * @post The returned value contains true is this matrix is squared,
	 *       i.e. has the same number of rows and columns,
	 *       and false otherwise
	 */
	public boolean isSquareMatrix()
	{
		return false;
	}
	
	/**
	 * Gets a string representation of the matrix
	 * 
	 * @pre -
	 * @post The returned value contains a string representation of this matrix
	 *       Each element is represented with its own toString() method.
	 *       For example, the identity 2x2 matrix is:
	 *        [1.0, 0.0]
	 *        [0.0, 1.0] 
	 */
	@Override
	public String toString()
	{
		return null;
	}
}