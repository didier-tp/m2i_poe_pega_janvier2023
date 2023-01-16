package tp;

public class Personne {
	
	public String prenom;
	public String nom;
	public String email;

	public Integer taille; //null par défaut

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", taille=" + taille + "]";
	}
	
	public void grandir(int accroissement){
		this.taille = this.taille + accroissement;
	}

}
