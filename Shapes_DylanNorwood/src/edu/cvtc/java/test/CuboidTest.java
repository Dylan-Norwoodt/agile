package edu.cvtc.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.java.Cuboid;

public class CuboidTest {
	
	Cuboid cube1 = new Cuboid(2, 2, 2);
	Cuboid cube2 = new Cuboid(1, 1, 1);
	Cuboid cube3 = new Cuboid(5, 5, 5);
	

	@Test
	public void testConstructor() {
		
		
		assertTrue(cube1 instanceof Cuboid);
	}
	
	@Test
	public void testGetWidth() {
		
		assertEquals(2, cube1.getWidth(), 0.0);
	}
	
	@Test 
	public void testGetHeight() {
		
		assertEquals(2, cube1.getHeight(), 0.0);
	}
	
	@Test
	public void testGetDepth() {
		
		assertEquals(2, cube1.getDepth(), 0.0);
	}
	
	@Test 
	public void testSurfaceArea() {
		
		assertEquals(24, cube1.surfaceArea(), 0.01 );
		assertEquals(6, cube2.surfaceArea(), 0.01);
		assertEquals(150, cube3.surfaceArea(), 0.01 );
	}
	
	@Test
	public void testVolume() {
		assertEquals(8, cube1.volume(), 0.01);
		assertEquals(1, cube2.volume(), 0.01);
		assertEquals(125, cube3.volume(), 0.01);
	}
	
}
