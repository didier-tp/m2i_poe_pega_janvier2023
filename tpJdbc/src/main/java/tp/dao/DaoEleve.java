package tp.dao;

import java.util.List;
import tp.entity.Eleve;

/*
 * DAO = Data Access Object 
 * comporte des traitements CRUD 
 * (Create : INSERT INTO , Recherche : SELECT , Update, Delete)
 */
public interface DaoEleve {
   public void saveEleve(Eleve e);
   public Eleve findEleveByNum(int num);
   public List<Eleve> findAllEleve();
   public void updateEleve(Eleve e);
   public void deleteEleve(int num);
}
