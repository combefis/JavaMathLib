// TestSinus.java

package be.ukonline.mathlib.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.ukonline.mathlib.Matrix;
import be.ukonline.mathlib.Sinus;

/**
 * Test class of the Sinus class
 * 
 * @author Sébastien Combéfis
 * @version July 24, 2015
 */
public final class TestSinus
{
	// Instance variables
	private Sinus sinus;
		
	@Before
	public void setUp() throws Exception
	{
		sinus = new Sinus();
	}

	@Test
	public void testGetValue()
	{
		// sinus(0) should be 0
		assertEquals(Math.sin(0), sinus.getValue(0), 0);
		
		// sinus(pi/2) should be 1
		assertEquals(Math.sin(Math.PI / 2), sinus.getValue(Math.PI /2), 0);
	}
}