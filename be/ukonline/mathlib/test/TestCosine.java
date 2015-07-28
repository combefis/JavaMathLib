// TestCosine.java

package be.ukonline.mathlib.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import be.ukonline.mathlib.Cosine;

/**
 * Test class of the Cosine class
 * 
 * @author Sébastien Combéfis
 * @version July 28, 2015
 */
public final class TestCosine
{
	// Instance variables
	private Cosine cosineA, cosineB, cosineC, cosineD;
		
	@Before
	public void setUp() throws Exception
	{
		// cos(x)
		cosineA = new Cosine (1, 1, 0);
		
		// cos(-2x)
		cosineB = new Cosine (1, -2, 0);
		
		// -2.5 * cos(3x + 5)
		cosineC = new Cosine (-2.5, 3, 5);
		
		// 5 * cos(-2x - 4)
		cosineD = new Cosine (5, -2, -4);
	}

	@Test
	public void testGetValue()
	{
		// cos(0) should be 1
		assertEquals (Math.cos (0), cosineA.getValue (0), 0);
		
		// cos(pi/2) should be 0
		assertEquals (Math.cos (Math.PI / 2), cosineA.getValue (Math.PI /2), 0);
		
		// -2.5 * cos(3 * 0 + 5) should be
		assertEquals (-2.5 * Math.cos (5), cosineC.getValue (0), 0);
		
		// -2.5 * cos(3 * -1 + 5) should be
		assertEquals (-2.5 * Math.cos (2), cosineC.getValue (-1), 0);
		
		// 5 * cos(-2 * 0 - 4) should be
		assertEquals (5 * Math.cos (-4), cosineD.getValue (0), 0);
		
		// 5 * cos(-2 * 2 - 4) should be
		assertEquals (5 * Math.cos (-8), cosineD.getValue (2), 0);
	}
	
	@Test
	public void testToString()
	{
		assertEquals ("cos (x)", cosineA.toString());
		assertEquals ("cos (-2.0x)", cosineB.toString());
		assertEquals ("-2.5 cos (3.0x + 5.0)", cosineC.toString());
		assertEquals ("5.0 cos (-2.0x - 4.0)", cosineD.toString());
	}
	
	@Test
	public void testEquals()
	{
		// All the cosine functions must not be equal to null
		// nor to an object that is not an instance of Cosine
		assertFalse (cosineA.equals (null));
		assertFalse (cosineA.equals (""));
		
		assertFalse (cosineB.equals (null));
		assertFalse (cosineB.equals (new GregorianCalendar()));
		
		assertFalse (cosineC.equals (null));
		assertFalse (cosineC.equals (new ArrayList<>()));
		
		assertFalse (cosineD.equals (null));
		assertFalse (cosineD.equals (new Object()));
		
		// Testing equalities for cosine functions
		// Must return true when comparing two equal cosine functions
		assertTrue (cosineA.equals (new Cosine (1, 1, 0)));
		assertTrue (cosineB.equals (new Cosine (1, -2, 0)));
		assertTrue (cosineC.equals (new Cosine (-2.5, 3, 5)));
		assertTrue (cosineD.equals (new Cosine (5, -2, -4)));
		
		// Testing equalities that must fail
		// Must return false when comparing two different cosine functions
		assertFalse (cosineA.equals (new Cosine (0, 1, 0)));
		assertFalse (cosineA.equals (new Cosine (1, 0, 0)));
		assertFalse (cosineA.equals (new Cosine (1, 1, 1)));
		assertFalse (cosineB.equals (new Cosine (-8, 2, 15)));
		assertFalse (cosineC.equals (new Cosine (-2.5, 3, -5)));
		assertFalse (cosineD.equals (new Cosine (-5, 2, 4)));
	}
}