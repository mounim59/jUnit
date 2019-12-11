package tests.compte;

import static org.junit.Assert.*;

import org.junit.Test;

import compte.Rib;

public class RibTest {

	@Test
	public void testRib() {
		Rib r = new Rib();
		assertNotNull(r);
	}

	

	@Test
	public void testGetNumRib() {
		Rib r = new Rib("15");
		assertEquals("15", r.getNumRib());
	}

	@Test
	public void testSetNumRib() {
		Rib r = new Rib("15");
		assertEquals("15", r.getNumRib());
	}

}
