package tests.banqueUtil;

import static org.junit.Assert.*;

import org.junit.Test;

import banqueUtil.BanqueUtil;

public class BanqueUtilTest {

	private BanqueUtil b = new BanqueUtil();
	@Test
	public void testEtablissement() {
	 
		assertEquals(5, b.etablissement("51111"));
	}
	
	@Test (expected = NumberFormatException.class)
	public void testEtablissException() {
		b.etablissement("1254e");
	}

}
