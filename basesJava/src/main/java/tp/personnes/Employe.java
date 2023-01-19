package tp.personnes;

public class Employe extends Personne{
	
	public enum TypeEmploye { BIBLIOTHECAIRE , RESPONSABLE }
	private TypeEmploye type = TypeEmploye.BIBLIOTHECAIRE; //+get/set
	
    private Integer numeroEmploye = null;
    private String motDePasse;
    private Double salaire;
    

    //red�finir la fonction toString en rappelant en interne 
    //la version cod�e sur super classe Personne et en 
    //ajoutant par concat�nation les valeurs des attributs suppl�mentaires
    /*
    public String toString() {
    	String persString  = super.toString();
    	return persString + " (Employe) numeroEmploye= "+numeroEmploye 
    			+ " motDePasse=" + motDePasse + " salaire=" + salaire;
    }*/
    
    @Override
	public String toString() {
		return "Employe [numeroEmploye=" + numeroEmploye + ",type="+ type + ", motDePasse=" + motDePasse + ", salaire=" + salaire
				+ ", partie heritee de Personne=" + super.toString() + "]";
	}
    
  
    
    
    //constructeurs : 1 avec z�ro param�tre
    //et d'autres (ex: Employe(String prenom, String nom, String email, Integer taille,
    //                         Integer numeroEmploye ,String motDePasse, Double salaire  )
    

	


	//+get/set
    public Integer getNumeroEmploye() {
		return numeroEmploye;
	}
	

	@Override
	public String getAutorisations() {
		return "GererEmprunt, ..."; 
	}




	public Employe() {
		super();
	}


	public Employe(String prenom, String nom, String email, Integer taille, 
			Integer numeroEmploye, String motDePasse,	Double salaire) {
		super(prenom, nom, email, taille);
		this.numeroEmploye = numeroEmploye;
		this.motDePasse = motDePasse;
		this.salaire = salaire;
	}



	public void setNumeroEmploye(Integer numeroEmploye) {
		this.numeroEmploye = numeroEmploye;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public TypeEmploye getType() {
		return type;
	}

	public void setType(TypeEmploye type) {
		this.type = type;
	}
	
}
