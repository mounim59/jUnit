package tests.compte;

import static org.junit.Assert.*;

import org.junit.Test;

import compte.Numero;

public class NumeroTest {

	@Test
	public void testNumero() {
		Numero n = new Numero();
		assertNotNull(n);
	}

	
	@Test
	public void testGetNumero() {

		Numero n = new Numero("15");
		
		assertEquals("15", n.getNumero());
	}

	@Test
	public void testSetNumero() {
		Numero n = new Numero("15");
		n.setNumero("15");
		assertEquals("15", n.getNumero());
	}

}
