package tp;

import javax.swing.JOptionPane;

import tp.personnes.Adresse;
import tp.personnes.Employe;
import tp.personnes.Personne;
import tp.volant.Avion;
import tp.volant.FeuilleVolante;
import tp.volant.Helicoptere;
import tp.volant.ObjetVolantAbstrait;
import tp.volant.Volant;

public class MyApp {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Bienvenue MyApp"); 
		//testTypeElementaire();
		//testConversion();
		//testCercle();
		//testPersonne();
		//testEmploye();
		//testAdresse();
		//testString();
		//testTableau();
		//testObjetVolant();
		testTransportable();
	}
	
	public static void testTransportable() {
		Transportable choseTransportable =null;
        Bagage b1=null,b2=null;
        b1 = new Bagage ();
        b1.setPoids(6.0);b1.setVolume(15.0);
        System.out.println("b1 = "+b1.toString());
        b2 = new Bagage(10.0,20.0);
        System.out.println("b2 = "+b1.toString());
        
        Personne p1 = new Employe("jean","Aimare","jean.Aimare@DeTravailler.com",170,1,"passPass",2000.0);
        System.out.println("p1 = "+p1.toString());
        
        choseTransportable=b1;
        System.out.println("poids de chose transportable ="+choseTransportable.getPoids());
        choseTransportable=p1;
        System.out.println("poids de chose transportable ="+choseTransportable.getPoids());
	}
	
	public static void testObjetVolant() {
		Volant choseVolanteQuelconque = null;
		//choseVolanteQuelconque = new Volant();//new direct interdit sur classe interface
		ObjetVolantAbstrait objVolant = null;
		//objVolant = new ObjetVolantAbstrait();//new direct interdit sur classe abstraite
		objVolant = new Avion(); /*objVolant.setAltitude(500);*/
		choseVolanteQuelconque = objVolant;
		//choseVolanteQuelconque.decoller(); impossible car l'interface Volant ne comporte pas
		//l'operation d�coller()
		System.out.println( objVolant.toString());
		System.out.println("avion qui d�colle : " + objVolant.decoller());
		System.out.println("altitude chose volante: " + choseVolanteQuelconque.getAltitude());
		objVolant = new Helicoptere();
		System.out.println( objVolant.toString());
		System.out.println("h�licoptere qui d�colle : " + objVolant.decoller());
		
		choseVolanteQuelconque = new FeuilleVolante();
		System.out.println("altitude chose volante: " + choseVolanteQuelconque.getAltitude());
	}
	
	public static void testEmploye() {
		Employe e1=null;
		e1=new Employe();
		e1.setPrenom("jean");e1.setNom("Bon"); //appels des m�thodes h�rit�es
		e1.setTaille(160); e1.setEmail("jean.Bon@iciOuLa.fr");
		e1.setSalaire(2500.0); //appel d'une m�thode sp�cifique aux employ�s
		e1.setMotDePasse("motDePasse"); e1.setNumeroEmploye(1);
		System.out.println("e1="+e1.toString()); //appel d'une m�thode red�finie sur classe Employe
		
		Employe e2=new Employe("jean","Aimare","jean.Aimare@DeTravailler.com",170,2,"passPass",2000.0);
		System.out.println("e2="+e2.toString());
		
		Personne refPersonneQuelconque=null; 
		refPersonneQuelconque = new Personne("prenom" , "nom" , "nom.prenom@xy.com" , 160);
		refPersonneQuelconque.grandir(5);
		System.out.println(refPersonneQuelconque.toString());
		System.out.println("autorisations=" + refPersonneQuelconque.getAutorisations());
		refPersonneQuelconque = new Employe("jean","QuiRit","jean.QuiRit@xy.com",170,3,"passPass",2600.0);
		if(refPersonneQuelconque instanceof Employe) {
			( (Employe)refPersonneQuelconque).setSalaire(2700.0);
		}
		System.out.println(refPersonneQuelconque.toString());
		System.out.println("autorisations=" + refPersonneQuelconque.getAutorisations());
		/*
		//POSSIBLE MAIS DECONSEILLE (LE POLYMORPHISME c'est MIEUX ):
		if(refPersonneQuelconque instanceof Employe) {
			//alors on affiche une par une les partie de Employe
		}else 
			if(refPersonneQuelconque instanceof Personne) {
				//alors on affiche une par une les partie de Personne
			}
		*/
	} 
	
	public static final int TAILLE_TAB = 6;
	
	public static void testTableau() {
		 //tab doit �tre un tableau de 6 cases de type double
		//double[] tab = { 2.0 , 7 , 9 , 3 , 6 , 1 };
		
		 double[] tab = null;
		 tab = new double[TAILLE_TAB];
		 tab[0]=2.0;
		 tab[1]=7;
		 tab[2]=9;
		 tab[3]=3;
		 tab[4]=6;
		 tab[5]=1;
	
		 //calculer et afficher la moyenne
		 double somme = 0;
		 for(int i=0;i<tab.length;i++) {
			 somme += tab[i]; //somme = somme + tab[i];
		 }
		 double moyenne  = somme / tab.length;
		 System.out.println("moyenne=" + moyenne);
	}
	
	public static void testString() {
		String s1 = "2023-01-17";
		//String sMois = s1.split("-")[1];
		String sMois = s1.substring(5,7);
		System.out.println("sMois="+sMois);
		
		String s2="CBA";
		int n = s2.length();
		StringBuilder buffer = new StringBuilder();
		/*for(int i=0;i<s2.length();i++){
			buffer.append(s2.charAt(n-i-1));
			}*/
		for(int i=s2.length()-1;i>=0;i--){
		   buffer.append(s2.charAt(i));
		}
		String s2Inverse=buffer.toString();
		
		System.out.println("s2Inverse="+s2Inverse);
	}
	
	
	public static void testAdresse() {
		Adresse a1 = new Adresse();
		System.out.println("a1="+a1);
		a1.setNum("7Bis"); a1.setRue("rue Xy"); a1.setCodePostal("75001"); a1.setVille("Paris");
		System.out.println("a1="+a1);
		
		Adresse a2 = new Adresse("12" , "rue elle" , "76000" , "Rouen");
		System.out.println("a2="+a2);
		System.out.println("codePostal de Rouen="+a2.getCodePostal());
	}
	
	public static void testPersonne() {
		Personne p1=null ,p1Bis=null, p2=null;
		p1=new Personne("alex","Therieur","alex.therieur@xyz.com",120);
	    p1.grandir(5);
		p1Bis=new Personne("alex","Therieur","alex.therieur@xyz.com",120);
	    p1Bis.grandir(5);
		System.out.println("p1=" + p1);//.toString() appel� implicitement
		System.out.println("p1Bis=" + p1Bis);
		if(p1.equals(p1Bis)) {
			//NB: pour avoir le bon comportement, la m�thode .equals() doit �tte cod�e
			//sur la classe Personne (via assistant source/generate hashCode and equals
			System.out.println("les objets p1 et p1Bis ont m�mes valeurs ");
		}else{
			System.out.println("les objets p1 et p1Bis n'ont m�mes valeurs ");
		}
		p2=new Personne();
		System.out.println("p2=" + p2);//.toString() implicite
		p2.setPrenom("axelle"); p2.setNom("Aire") ; p2.setEmail("axelle.Aire@xyz.com");
		p2.setTaille(130); p2.grandir(6);
		System.out.println("p2=" + p2);//.toString() implicite
		p2.setTaille(-60);
		System.out.println("p2=" + p2);//.toString() implicite
		
		p2.setAdresse(new Adresse("3bis" , "rue xy" , "75001" , "Paris"));
		p2.getAdresse().setCodePostal("75002");
		System.out.println("adresse de p2=" + p2.getAdresse());
		
		System.out.println("esp�rance de vie moyenne des Personnes en france=" 
		                   + Personne.getEsperanceVie());
		Personne.setEsperanceVie(84.2);
		System.out.println("nouvelle esp�rance de vie moyenne des Personnes en france=" 
                            + Personne.getEsperanceVie());
		
		System.out.println("age majorit� en france=" + Personne.getAgeMajorite());
	}
	
	public static void testCercle() {
		Cercle c1=null, c2=null;
		c1 = new Cercle();
		//c1.rayon = 100; c1.xc = 50; c1.yc = 50; //V1 avec xc,yc,rayon public
		c1.setRayon(100); c1.setXc(50); c1.setYc(50);
		c1.setRayon(-70); //on demande au cercle c1 de modifier son rayon � -70
		                  //mais l'objet c1 refuse la valeur invalide dans .setRayon()
		System.out.println("valeurs du c1=" + c1.toString());
		System.out.println("perimetre de c1="+ c1.perimetre());
		c2 = new Cercle(60,60,200);
		c2.zoomer(2);
		//System.out.println("rayon de c2="+ c2.rayon);//V1 avec rayon public
		System.out.println("rayon de c2="+ c2.getRayon()); //V2 avec rayon private
		//System.out.println("valeurs du c2=" + c2.toString());
		System.out.println("valeurs du c2=" + c2); //avec appel implicite de .toString()
		
		double d  = Cercle.distanceEntreCentresDe2Cercles(c1, c2);
		System.out.println("distance entre c1 et c2 = " + d);
	}
	
	public static void testClasseEnveloppe() {
		int age1 = 25;
		//age1 = null; //null = valeur impossible sur int
		Integer age2 ;
		age2=25; //equivalent � �crire age2 = new Integer(25);
		age2=26; //�quivalent � �crire age2 = new Integer(26);
		age2 = null; //null = valeur possible (et quelquefois par d�faut) d'un Integer
		//la valeur null est pratique (et utile) : �a provient d'un null SQL 
		//ou d'une zone de saisie laiss�e � vide.
	}
	
	
	public static void testConversion() {
		String sA="5"; //sA est de type String (souvent apr�s une saisie au clavier dans formulaire HTML)
		int a = Integer.parseInt(sA);
		String sB="6"; 
		int b = Integer.parseInt(sB);
		System.out.println("sA+sB="+ (sA + sB)); 
		System.out.println("a+b="+ (a + b)); 
		
		double x = Double.parseDouble(sA); // x vaut 5.0 ou 5
		double y ;
		y= a / b ; 
		System.out.println("y=a/b="+ y); //0 ou 0.0
		y = x / b ; 
		System.out.println("y=x/b="+ y); 
		
		//d�clarer les variables z1 et z2 de type double.
		//convertir "2.6" en num�rique et stocker �a dans z1;
		//convertir la valeur 2 en double et stocker �a dans z2
		//afficher le r�sultat de la multiplication de z1 par z2
		double z1,z2;
		z1=Double.parseDouble("2.6");
		z2 = (double) 2; //ou bien z2 = 2;
		double res= z1*z2;
		System.out.println("res=z1*z2=" + res);
		int resAsInt = (int) res;
		System.out.println("res (en int)=" + resAsInt);
	}
	
	public static void testTypeElementaire() {
		String sDate = "lundi 16 janvier 2023";
		//char ca = 'a';
		sDate=sDate.toUpperCase();
		System.out.println(sDate); 
		
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("c="+c);
		
		double x=2 , y=3.3;
		double z = x+y;
		System.out.println("z="+z);
	}

}
