// TestMatrix.java

package be.ukonline.mathlib.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import be.ukonline.mathlib.Matrix;

/**
 * Test class of the Matrix class
 * 
 * @author Sébastien Combéfis
 * @version July 26, 2015
 */
public final class TestMatrix
{
	// Instance variables
	private double[][] data = new double[][] {{1, 2, 3}, {4, 5, 6}};
	private Matrix matrixA, matrixB, matrixC, matrixD;
	
	@Before
	public void setUp() throws Exception
	{
		matrixA = new Matrix (3, 7);
		matrixB = new Matrix (5, 2);
		matrixC = new Matrix (data);
		matrixD = new Matrix (6);
	}

	@Test
	public void testNbRows()
	{
		// "matrixA" must have 3 rows
		assertEquals (3, matrixA.nbRows());
		
		// "matrixB" must have 5 rows
		assertEquals (5, matrixB.nbRows());
		
		// "matrixC" must have 2 rows
		assertEquals (2, matrixC.nbRows());
		
		// "matrixD" must have 6 rows
		assertEquals (6, matrixD.nbRows());
	}

	@Test
	public void testNbColumns()
	{
		// "matrixA" must have 7 columns
		assertEquals (7, matrixA.nbColumns());
		
		// "matrixB" must have 2 columns
		assertEquals (2, matrixB.nbColumns());
		
		// "matrixC" must have 3 columns
		assertEquals (3, matrixC.nbColumns());
		
		// "matrixD" must have 6 columns
		assertEquals (6, matrixD.nbColumns());
	}

	@Test
	public void testGet()
	{
		// All the values of "matrixA" must be 0
		for (int i = 1; i <= matrixA.nbRows(); i++)
		{
			for (int j = 1; j <= matrixA.nbColumns(); j++)
			{
				assertEquals (0, matrixA.get (i, j), 0);
			}
		}
		
		// All the values of "matrixB" must be 0
		for (int i = 1; i <= matrixB.nbRows(); i++)
		{
			for (int j = 1; j <= matrixB.nbColumns(); j++)
			{
				assertEquals (0, matrixB.get (i, j), 0);
			}
		}
		
		// The values of "matrixC" must be those of "data"
		for (int i = 1; i <= matrixC.nbRows(); i++)
		{
			for (int j = 1; j <= matrixC.nbColumns(); j++)
			{
				assertEquals (data[i - 1][j - 1], matrixC.get (i, j), 0);
			}
		}
		
		// All the values of "matrixD" must be 0
		for (int i = 1; i <= matrixD.nbRows(); i++)
		{
			for (int j = 1; j <= matrixD.nbColumns(); j++)
			{
				assertEquals (0, matrixD.get (i, j), 0);
			}
		}
	}
	
	@Test
	public void testIsSquareMatrix()
	{
		// "matrixA", "matrixB" and "matrixC" are not square matrices
		assertFalse (matrixA.isSquareMatrix());
		assertFalse (matrixB.isSquareMatrix());
		assertFalse (matrixC.isSquareMatrix());
		
		// "matrixD" is a square matrix
		assertTrue (matrixD.isSquareMatrix());
	}
	
	@Test
	public void testTranspose()
	{
		double[][] expected;
		
		// Testing transpose for each matrix
		expected = new double[][] {
			{0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0}
		};
		assertEquals(new Matrix (expected), matrixA.transpose());
		
		expected = new double[][] {
			{0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0}
		};
		assertEquals(new Matrix (expected), matrixB.transpose());
		
		expected = new double[][] {
			{1.0, 4.0},
			{2.0, 5.0},
			{3.0, 6.0}
		};
		assertEquals(new Matrix (expected), matrixC.transpose());
		
		assertEquals (matrixD, matrixD.transpose());
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
		
		// String representation of "matrixC" must be
		// [1.0, 2.0, 3.0]
		// [4.0, 5.0, 6.0]
		expected = "[1.0, 2.0, 3.0]\n"
				 + "[4.0, 5.0, 6.0]";
		assertEquals (expected, matrixC.toString());
		
		// String representation of "matrixD" must be
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		expected = "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]\n"
				 + "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]";
		assertEquals (expected, matrixD.toString());
	}
	
	@Test
	public void testEquals()
	{
		double[][] expected;
		double[][] notexpected;
		
		// All the matrices must not be equal to null
		// nor to an object that is not an instance of Matrix
		assertFalse (matrixA.equals (null));
		assertFalse (matrixA.equals (""));
		
		assertFalse (matrixB.equals (null));
		assertFalse (matrixB.equals (new Date()));
		
		assertFalse (matrixC.equals (null));
		assertFalse (matrixC.equals (new Integer (42)));
		
		assertFalse (matrixD.equals (null));
		assertFalse (matrixD.equals (new Object()));
		
		// Testing equalities for matrices
		// Must return true when comparing two equal matrices
		expected = new double[][] {
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
		};
		assertEquals (new Matrix (expected), matrixA);
		
		expected = new double[][] {
			{0.0, 0.0},
			{0.0, 0.0},
			{0.0, 0.0},
			{0.0, 0.0},
			{0.0, 0.0}
		};
		assertEquals (new Matrix (expected), matrixB);
		
		assertEquals (new Matrix (this.data), matrixC);
		
		expected = new double[][] {
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
			{0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
		};
		assertEquals (new Matrix (expected), matrixD);
		
		// Testing equalities that must fail
		// Must return false when comparing two different matrices
		// Dimensions must be the same
		notexpected = new double[][] {
			{1, 0},
			{0, 1}
		};
		assertNotEquals (new Matrix (notexpected), matrixC);
		
		// Values must be the same
		notexpected = new double[][] {
			{1, 2, 3},
			{4, 5, 7}
		};
		assertNotEquals (new Matrix (notexpected), matrixC);
	}
}