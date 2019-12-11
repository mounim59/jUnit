package tests.compte;

import static org.junit.Assert.*;

import org.junit.Test;

import compte.Etablissement;
import compte.Guichet;
import compte.Numero;
import compte.NumeroCompte;
import compte.Rib;

public class NumeroCompteTest {

	private Etablissement e = new Etablissement("15");
	private Guichet g = new Guichet("20");
	private Numero n = new Numero("25");
	private Rib r = new Rib("30");
	private NumeroCompte nc = new NumeroCompte(e, g, n, r);

	@Test
	public void testNumeroCompte() {
		NumeroCompte num = new NumeroCompte();
		assertNotNull(num);
	}

	@Test
	public void testNumeroCompteEtablissementGuichetNumeroRib() {

		assertNotNull(nc);
	}

	@Test
	public void testGetEtablissement() {

		assertEquals("15", e.getNumEtablissement());
	}

	@Test
	public void testSetEtablissement() {

		e.setNumEtablissement("100");
		assertEquals("100", e.getNumEtablissement());
	}

	@Test
	public void testGetGuichet() {

		assertEquals("20", g.getNumGuichet());
	}

	@Test
	public void testSetGuichet() {

		g.setNumGuichet("48");
		assertEquals("48", g.getNumGuichet());
	}

	@Test
	public void testGetNumero() {

		assertEquals("25", n.getNumero());
	}

	@Test
	public void testSetNumero() {

		n.setNumero("68");
		assertEquals("68", n.getNumero());
	}

	@Test
	public void testGetRib() {

		assertEquals("30", r.getNumRib());
	}

	@Test
	public void testSetRib() {

		r.setNumRib("95");
		assertEquals("95", r.getNumRib());
	}

}
