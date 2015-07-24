// Matrix.java

package be.ukonline.mathlib;

import java.util.Arrays;

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
	 * Creates a square matrix filled with zeros
	 * 
	 * @pre n > 0
	 * @post A new instance of this is created, representing a square matrix
	 *       of order "n", whose elements are set to zero
	 */
	public Matrix (int n)
	{
		data = new double[n][n];
	}
	
	/**
	 * Creates a matrix with specified elements 
	 * 
	 * @pre data != null
	 *      data.length > 0
	 *      data is a rectangular array, this is:
	 *        data[i].length == data[0].length for each i in 0..data.length - 1
	 */
	public Matrix (double[][] data)
	{
		this.data = data;
	}
	
	/**
	 * Gets the number of rows of the matrix
	 * 
	 * @pre -
	 * @post The returned value contains the number of rows of this matrix
	 */
	public int nbRows()
	{
		return data.length;
	}
	
	/**
	 * Gets the number of columns of the matrix
	 * 
	 * @pre -
	 * @post The returned value contains the number of columns of this matrix
	 */
	public int nbColumns()
	{
		return data[0].length;
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
		return data[i][j];
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
		return data.length == data[0].length;
	}
	
	/**
	 * Gets the transpose matrix
	 * 
	 * @pre -
	 * @post The returned value contains the transpose of this matrix
	 */
	public Matrix transpose()
	{
		Matrix transpose = new Matrix (nbColumns(),nbRows());
		for (int i=0; i<nbColumns(); i++){
			for (int j=0; j<nbRows(); j++){
				transpose.data[i][j] = data[j][i];
			}
		}
		return transpose;
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
		String toreturn="";
		for (int i=0; i<data.length; i++){
			toreturn += Arrays.toString(data[i]); 
			if (i+1 != data.length){
				toreturn += "\n";
			}
		}
		return toreturn;
	}
	
	/**
	 * Tests two matrices for equality
	 * 
	 * @pre -
	 * @post The returned value contains true if "o" is an instance of Matrix
	 *       who has the same number of rows and columns as this matrix
	 *       and whose corresponding elements are equals
	 */
	@Override
	public boolean equals (Object o)
	{
		return o instanceof Matrix ;
	}
}