package tests.compte;

import static org.junit.Assert.*;

import org.junit.Test;

import compte.Etablissement;

public class EtablissementTest {

	@Test
	public void testEtablissement() {
		Etablissement etablissement = new Etablissement();
		assertNotNull(etablissement);
	}

	@Test
	public void testGetNumEtablissement() {
		Etablissement etablissement = new Etablissement("15");

		String num = etablissement.getNumEtablissement();
		assertEquals("15", num);
	}

	@Test
	public void testSetNumEtablissement() {
		Etablissement etablissement = new Etablissement("15");

		etablissement.setNumEtablissement("20");
		String num = etablissement.getNumEtablissement();
		assertEquals("20", num);
	}

}
