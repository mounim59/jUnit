package tests.compte;

import static org.junit.Assert.*;

import org.junit.Test;

import compte.Guichet;

public class GuichetTest {

	@Test
	public void testGuichet() {
		Guichet g = new Guichet();
		assertNotNull(g);
	}

	@Test
	public void testGetNumGuichet() {
		Guichet g = new Guichet("15");
		assertEquals("15", g.getNumGuichet());
		
	}

	@Test
	public void testSetNumGuichet() {
		Guichet g = new Guichet();
		g.setNumGuichet("15");
		assertEquals("15", g.getNumGuichet());
	}

}
