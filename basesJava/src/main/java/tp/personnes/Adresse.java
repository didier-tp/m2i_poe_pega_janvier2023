package tp.personnes;

public class Adresse {
  //num, rue, codePostal, ville
	private String num;
	private String rue;
	private String codePostal;
	private String ville;
	
	
	
	public Adresse(String num, String rue, String codePostal, String ville) {
		super();
		this.num = num;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	public Adresse() {
		super();
	}



	@Override
	public String toString() {
		return "Adresse [num=" + num + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
