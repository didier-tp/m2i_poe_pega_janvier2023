package tp.personnes;

import tp.Transportable;

public class Personne /* extends Object */ implements Transportable {
	
	private static double esperanceVie = 83.0;
	private static int ageMajorite = 18;
	private String prenom;
	private String nom;
	private String email;
	private Integer taille; //null par d�faut (0 par d�faut si int plut�t que Integer)
    private Adresse adresse ; /* = new Adresse(); */
    private final static double POIDS_MOYEN = 70.0;
    private final static double VOLUME_MOYEN = 70.0;
    
    //A coder diff�remment sur la classe Employe qui h�rite de Personne
    //red�finition/override � faire
    public String getAutorisations() {
    	return "EmprunterDesLivres,ConsulterCatalogue";
    }
	
	
	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", taille=" + taille + "]";
	}
	

	public Personne(String prenom, String nom, String email, Integer taille) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.taille = taille;
	}
	

	
	public Personne(String prenom, String nom, String email, Integer taille, Adresse adresse) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.taille = taille;
		this.adresse = adresse;
	}


	public Personne() {
		super();
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((taille == null) ? 0 : taille.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (taille == null) {
			if (other.taille != null)
				return false;
		} else if (!taille.equals(other.taille))
			return false;
		return true;
	}



	public void grandir(int accroissement){
		this.taille = this.taille + accroissement;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getTaille() {
		return taille;
	}


	
	public void setTaille(Integer taille) {
		if(taille < 0) {
			System.err.println("non mais �a va la t�te, une personne ne peut pas avoir une taille n�gative");
			System.err.println("this de la classe Personne refuse de changer sa taille dans ce cas de figure !");
			return;//on arr�te l'execution de la m�thode avant la fin ordinaire
		}
		this.taille = taille;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public static double getEsperanceVie() {
		return esperanceVie;
	}


	public static void setEsperanceVie(double esperanceVie) {
		Personne.esperanceVie = esperanceVie;
	}


	public static int getAgeMajorite() {
		return ageMajorite;
	}


	public static void setAgeMajorite(int ageMajorite) {
		Personne.ageMajorite = ageMajorite;
	}


	@Override
	public double getPoids() {
		return Personne.POIDS_MOYEN;
	}


	@Override
	public double getVolume() {
		return VOLUME_MOYEN;
	}
	
	
	

}
