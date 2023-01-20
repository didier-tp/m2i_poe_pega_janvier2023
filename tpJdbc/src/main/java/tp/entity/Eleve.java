package tp.entity;

public class Eleve {
	
	private Integer num_eleve;
	private String nom;
	private String prenom;
	private Integer num_classe;
	
	@Override
	public String toString() {
		return "Eleve [num_eleve=" + num_eleve + ", nom=" + nom + ", prenom=" + prenom + ", num_classe=" + num_classe
				+ "]";
	}

	public Eleve(Integer num_eleve, String nom, String prenom, Integer num_classe) {
		super();
		this.num_eleve = num_eleve;
		this.nom = nom;
		this.prenom = prenom;
		this.num_classe = num_classe;
	}

	public Eleve() {
		super();
	}

	public Integer getNum_eleve() {
		return num_eleve;
	}

	public void setNum_eleve(Integer num_eleve) {
		this.num_eleve = num_eleve;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getNum_classe() {
		return num_classe;
	}

	public void setNum_classe(Integer num_classe) {
		this.num_classe = num_classe;
	}
	
	

}
