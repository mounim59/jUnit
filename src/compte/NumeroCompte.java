package compte;

public class NumeroCompte {

	private Etablissement etablissement;
	private Guichet guichet;
	private Numero numero;
	private Rib rib;

	
	/**
	 * 
	 */
	public NumeroCompte() {
		super();
	}

	/**
	 * @param etablissement
	 * @param guichet
	 * @param numero
	 * @param rib
	 */
	public NumeroCompte(Etablissement etablissement, Guichet guichet, Numero numero, Rib rib) {
		super();
		this.etablissement = etablissement;
		this.guichet = guichet;
		this.numero = numero;
		this.rib = rib;
	}

	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	public Guichet getGuichet() {
		return guichet;
	}

	public void setGuichet(Guichet guichet) {
		this.guichet = guichet;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public Rib getRib() {
		return rib;
	}

	public void setRib(Rib rib) {
		this.rib = rib;
	}

}
