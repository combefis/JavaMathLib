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
 * @version June 21, 2015
 */
public final class TestMatrix
{
	// Instance variables
	private Matrix m;
	
	@Before
	public void setUp() throws Exception
	{
		m = new Matrix (4, 7);
	}

	@Test
	public void testNbRows()
	{
		// The matrix m must have 4 rows
		assertEquals (4, m.nbRows());
	}

	@Test
	public void testNbColumns()
	{
		// The matrix m must have 7 columns
		assertEquals (7, m.nbColumns());
	}

	@Test
	public void testGet()
	{
		// All the values of the matrix m must be 0
		for (int i = 1; i <= m.nbRows(); i++)
		{
			for (int j = 1; j <= m.nbColumns(); j++)
			{
				assertEquals (0, m.get(i, j), 0);
			}
		}
	}
}