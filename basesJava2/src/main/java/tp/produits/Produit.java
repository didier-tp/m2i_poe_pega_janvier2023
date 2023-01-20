package tp.produits;

public class Produit {
	
	private Integer numero;
	private String label;
	private Double prix;
	
	
	@Override
	public String toString() {
		return "Produit [numero=" + numero + ", label=" + label + ", prix=" + prix + "]";
	}
	
	

	public Produit() {
		super();
	}



	public Produit(Integer numero, String label, Double prix) {
		super();
		this.numero = numero;
		this.label = label;
		this.prix = prix;
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
    
}
