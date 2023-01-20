package tp;

import tp.dao.DaoEleve;
import tp.dao.DaoEleveJdbc;
import tp.entity.Eleve;

public class MyApp {

	public static void main(String[] args) {
		DaoEleve daoEleve = new DaoEleveJdbc();
		Eleve nouvelEleve = new Eleve(999,"nomXxx" , "prenomYYY" , 1);
		daoEleve.saveEleve(nouvelEleve);
		for(Eleve e : daoEleve.findAllEleve()) {
			System.out.println(e);
		}
        //...
	};

}
