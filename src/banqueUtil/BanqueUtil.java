package banqueUtil;

public class BanqueUtil {
	
	public int etablissement(String s) {
		
		int n =Integer.parseInt(s);
		
		if (s.length() == 5) {
			return 5;
		}
		if (s.matches("^\\p{Digit}+$")){
			throw new NumberFormatException();
		}
		
		
		return n;
	}

}
