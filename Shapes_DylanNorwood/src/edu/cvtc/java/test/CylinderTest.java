package edu.cvtc.java.test;

import static org.junit.Assert.*;

import org.junit.Test;


import edu.cvtc.java.Cylinder;

public class CylinderTest {

	Cylinder cylinder1 = new Cylinder(2, 2);
	Cylinder cylinder2 = new Cylinder(1, 1);
	Cylinder cylinder3 = new Cylinder(5, 5);
	

	@Test
	public void testConstructor() {
		
		
		assertTrue(cylinder1 instanceof Cylinder);
	}
	
	@Test
	public void testGetRadius() {
		
		assertEquals(2, cylinder1.getRadius(), 0.0);
	}
	
	@Test 
	public void testGetHeight() {
		
		assertEquals(2, cylinder1.getHeight(), 0.0);
	}
	

	@Test 
	public void testSurfaceArea() {
		
		assertEquals(50.27, cylinder1.surfaceArea(), 0.01 );
		assertEquals(12.57, cylinder2.surfaceArea(), 0.01 );
		assertEquals(314.16, cylinder3.surfaceArea(), 0.01);
	}
	
	@Test
	public void testVolume() {
		assertEquals(25.13, cylinder1.volume(), 0.01);
		assertEquals(3.14, cylinder2.volume(), 0.01);
		assertEquals(392.7, cylinder3.volume(), 0.01);
	}

}
