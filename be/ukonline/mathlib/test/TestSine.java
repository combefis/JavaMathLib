// TestSine.java

package be.ukonline.mathlib.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import be.ukonline.mathlib.Sine;

/**
 * Test class of the Sine class
 * 
 * @author Sébastien Combéfis
 * @version July 26, 2015
 */
public final class TestSine
{
	// Instance variables
	private Sine sineA, sineB, sineC, sineD;
		
	@Before
	public void setUp() throws Exception
	{
		// sin(x)
		sineA = new Sine (1, 1, 0);
		
		// sin(-2x)
		sineB = new Sine (1, -2, 0);
		
		// -2.5 * sin(3x + 5)
		sineC = new Sine (-2.5, 3, 5);
		
		// 5 * sin(-2x - 4)
		sineD = new Sine (5, -2, -4);
	}

	@Test
	public void testGetValue()
	{
		// sin(0) should be 0
		assertEquals (Math.sin (0), sineA.getValue (0), 0);
		
		// sin(pi/2) should be 1
		assertEquals (Math.sin (Math.PI / 2), sineA.getValue (Math.PI /2), 0);
		
		// -2.5 * sin(3 * 0 + 5) should be
		assertEquals (-2.5 * Math.sin (5), sineC.getValue (0), 0);
		
		// -2.5 * sin(3 * -1 + 5) should be
		assertEquals (-2.5 * Math.sin (2), sineC.getValue (-1), 0);
		
		// 5 * sin(-2 * 0 - 4) should be
		assertEquals (5 * Math.sin (-4), sineD.getValue (0), 0);
		
		// 5 * sin(-2 * 2 - 4) should be
		assertEquals (5 * Math.sin (-8), sineD.getValue (2), 0);
	}
	
	@Test
	public void testToString()
	{
		assertEquals ("sin (x)", sineA.toString());
		assertEquals ("sin (-2.0x)", sineB.toString());
		assertEquals ("-2.5 sin (3.0x + 5.0)", sineC.toString());
		assertEquals ("5.0 sin (-2.0x - 4.0)", sineD.toString());
	}
	
	@Test
	public void testEquals()
	{
		// All the sine functions must not be equal to null
		// nor to an object that is not an instance of Sine
		assertFalse (sineA.equals (null));
		assertFalse (sineA.equals (""));
		
		assertFalse (sineB.equals (null));
		assertFalse (sineB.equals (new GregorianCalendar()));
		
		assertFalse (sineC.equals (null));
		assertFalse (sineC.equals (new ArrayList<>()));
		
		assertFalse (sineD.equals (null));
		assertFalse (sineD.equals (new Object()));
		
		// Testing equalities for sine functions
		// Must return true when comparing two equal sine functions
		assertTrue (sineA.equals (new Sine (1, 1, 0)));
		assertTrue (sineB.equals (new Sine (1, -2, 0)));
		assertTrue (sineC.equals (new Sine (-2.5, 3, 5)));
		assertTrue (sineD.equals (new Sine (5, -2, -4)));
		
		// Testing equalities that must fail
		// Must return false when comparing two different sine functions
		assertFalse (sineA.equals (new Sine (0, 1, 0)));
		assertFalse (sineA.equals (new Sine (1, 0, 0)));
		assertFalse (sineA.equals (new Sine (1, 1, 1)));
		assertFalse (sineB.equals (new Sine (-8, 2, 15)));
		assertFalse (sineC.equals (new Sine (-2.5, 3, -5)));
		assertFalse (sineD.equals (new Sine (-5, 2, 4)));
	}
}