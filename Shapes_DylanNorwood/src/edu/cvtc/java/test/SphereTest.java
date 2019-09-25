package edu.cvtc.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.java.Sphere;

public class SphereTest {
	
	MessageBoxSub messageBox = new MessageBoxSub();

	Sphere sphere1 = new Sphere(messageBox, 1);
	Sphere sphere2 = new Sphere(messageBox, 2);
	Sphere sphere3 = new Sphere(messageBox, 3);

	
	@Test
	public void testConstructor() {
		
		assertTrue(sphere1 instanceof Sphere);
	}
	
	@Test
	public void testGetRadius() {
		
		assertEquals(1, sphere1.getRadius(), 0.0);
	}
	
	@Test
	public void testSurfaceArea() {
		
		assertEquals(12.57, sphere1.surfaceArea(), 0.01);
		assertEquals(50.27, sphere2.surfaceArea(), 0.01);
		assertEquals(113.1, sphere3.surfaceArea(), 0.01);
	}
	
	@Test 
	public void testVolume() {
		
		assertEquals(4.19, sphere1.volume(), 0.01);
		assertEquals(33.51, sphere2.volume(), 0.01);
		assertEquals(113.1, sphere3.volume(), 0.01);
	}
	
	@Test 
	public void testRender() {
		sphere1.render();
		sphere2.render();
		sphere3.render();
	}
	
	
}
