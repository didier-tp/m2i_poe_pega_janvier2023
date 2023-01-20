package tp;

import tp.dao.DaoEleve;
import tp.dao.DaoEleveJdbc;
import tp.entity.Eleve;

public class MyApp {

	public static void main(String[] args) {
		DaoEleve daoEleve = new DaoEleveJdbc();
		Eleve nouvelEleve = new Eleve(null,"nomZZZ" , "prenomYYY" , 1);
		daoEleve.saveEleve(nouvelEleve);
		System.out.println("numero auto incrémenté de l'élève=" + nouvelEleve.getNum_eleve());
		for(Eleve e : daoEleve.findAllEleve()) {
			System.out.println(e);
		}
        //...
	};

}
