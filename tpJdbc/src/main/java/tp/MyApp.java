package tp;

import tp.dao.DaoEleve;
import tp.dao.DaoEleveJdbc;

public class MyApp {

	public static void main(String[] args) {
		DaoEleve daoEleve = new DaoEleveJdbc();
		daoEleve.findAllEleve();
        //...
	};

}
