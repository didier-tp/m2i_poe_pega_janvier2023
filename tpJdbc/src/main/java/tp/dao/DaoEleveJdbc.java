package tp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import tp.entity.Eleve;

/*
 * la classe DaoEleveJdbc code les méthodes de l'interface DaoEleve avec la techno JDBC
 * la classe DaoEleveJpa code les méthodes de l'interface DaoEleve avec la techno Jpa
 */

public class DaoEleveJdbc implements DaoEleve{
	
	
	private Connection etablirConnection() {
		Connection cn=null;
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/enseignement";
			String username="postgres"; //"root" ou "postgres" ou "admin" ou "sa"
			String password="root"; // "" ou "postgres" ou "...."
			cn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
	
	@Override
	public List<Eleve> findAllEleve() {
		List<Eleve> listeEleves = new ArrayList<>();
		try {
			Connection cn = this.etablirConnection();
			Statement st = cn.createStatement();
			String reqSql = "SELECT * FROM eleve";
			ResultSet rs = st.executeQuery(reqSql);
			while(rs.next()) {
				Eleve e = new Eleve();
				e.setNum_eleve(rs.getInt("num_eleve"));
				e.setNom(rs.getString("nom"));
				e.setPrenom(rs.getString("prenom"));
				e.setNum_classe(rs.getInt("num_classe"));
				listeEleves.add(e);
			}
			rs.close();
			st.close();
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeEleves;
	}
	
	Integer recupValeurAutoIncrPk(PreparedStatement pst){
		Integer pk=null;
		try {
			ResultSet rsKeys = pst.getGeneratedKeys();
			if(rsKeys.next()){ pk= rsKeys.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return pk;
	}

	@Override
	public void saveEleve(Eleve e) {
		try {
			Connection cn = this.etablirConnection();
			String reqSql = "INSERT INTO eleve(nom,prenom,num_classe) VALUES(?,?,?)";
			PreparedStatement pst = cn.prepareStatement(reqSql,Statement.RETURN_GENERATED_KEYS );
			pst.setString(1, e.getNom());
			pst.setString(2, e.getPrenom());
			pst.setInt(3, e.getNum_classe());
			int nbLignes  = pst.executeUpdate();
			Integer pkNumEleve = recupValeurAutoIncrPk(pst);
			e.setNum_eleve(pkNumEleve);
			System.out.println("nbLignes inserees = " + nbLignes);
			pst.close();
			cn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Eleve findEleveByNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void updateEleve(Eleve e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEleve(int num) {
		// TODO Auto-generated method stub
		
	}
}
