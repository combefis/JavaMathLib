// TestMatrix.java

package be.ukonline.mathlib.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.ukonline.mathlib.Matrix;

/**
 * Test class of the Matrix class
 * 
 * @author Sébastien Combéfis
 * @version July 13, 2015
 */
public final class TestMatrix
{
	// Instance variables
	private Matrix matrixA, matrixB;
	
	@Before
	public void setUp() throws Exception
	{
		matrixA = new Matrix (3, 7);
		matrixB = new Matrix (5, 2);
	}

	@Test
	public void testNbRows()
	{
		// "matrixA" must have 3 rows
		assertEquals (3, matrixA.nbRows());
		
		// "matrixB" must have 5 rows
		assertEquals (5, matrixB.nbRows());
	}

	@Test
	public void testNbColumns()
	{
		// "matrixA" must have 7 columns
		assertEquals (7, matrixA.nbColumns());
		
		// "matrixB" must have 2 columns
		assertEquals (2, matrixB.nbColumns());
	}

	@Test
	public void testGet()
	{
		// All the values of "matrixA" must be 0
		for (int i = 1; i <= matrixA.nbRows(); i++)
		{
			for (int j = 1; j <= matrixA.nbColumns(); j++)
			{
				assertEquals (0, matrixA.get(i, j), 0);
			}
		}
		
		// All the values of "matrixB" must be 0
		for (int i = 1; i <= matrixB.nbRows(); i++)
		{
			for (int j = 1; j <= matrixB.nbColumns(); j++)
			{
				assertEquals (0, matrixB.get(i, j), 0);
			}
		}
	}
	
	@Test
	public void testIsSquareMatrix()
	{
		// "matrixA" and "matrixB" are not squared matrices
		assertFalse (matrixA.isSquareMatrix());
		assertFalse (matrixB.isSquareMatrix());
	}
	
	@Test
	public void testToString()
	{
		String expected;
		
		// String representation of "matrixA" must be
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		expected = "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]";
		assertEquals (expected, matrixA.toString());
		
		// String representation of "matrixB" must be
		// [0.0, 0.0]
		// [0.0, 0.0]
		// [0.0, 0.0]
		// [0.0, 0.0]
		// [0.0, 0.0]
		expected = "[0.0, 0.0]\n"
				 + "[0.0, 0.0]\n"
				 + "[0.0, 0.0]\n"
				 + "[0.0, 0.0]\n"
				 + "[0.0, 0.0]";
		assertEquals (expected, matrixB.toString());
	}
}