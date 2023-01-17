package tp;

public class MyApp {

	public static void main(String[] args) {
		//testTypeElementaire();
		//testConversion();
		//testCercle();
		testPersonne();
		//testAdresse();
		//testString();
		//testTableau();
	}
	
	public static void testTableau() {
		 //tab doit être un tableau de 6 cases de type double
		double[] tab = { 2.0 , 7 , 9 , 3 , 6 , 1 };
		 /*
		 double[] tab = null;
		 tab = new double[6];
		 tab[0]=2.0;
		 tab[1]=7;
		 tab[2]=9;
		 tab[3]=3;
		 tab[4]=6;
		 tab[5]=1;
		 */
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
		System.out.println("p1=" + p1);//.toString() appelé implicitement
		System.out.println("p1Bis=" + p1Bis);
		if(p1.equals(p1Bis)) {
			//NB: pour avoir le bon comportement, la méthode .equals() doit êtte codée
			//sur la classe Personne (via assistant source/generate hashCode and equals
			System.out.println("les objets p1 et p1Bis ont mêmes valeurs ");
		}else{
			System.out.println("les objets p1 et p1Bis n'ont mêmes valeurs ");
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
		
		System.out.println("espérance de vie moyenne des Personnes en france=" 
		                   + Personne.getEsperanceVie());
		Personne.setEsperanceVie(84.2);
		System.out.println("nouvelle espérance de vie moyenne des Personnes en france=" 
                            + Personne.getEsperanceVie());
		
		System.out.println("age majorité en france=" + Personne.getAgeMajorite());
	}
	
	public static void testCercle() {
		Cercle c1=null, c2=null;
		c1 = new Cercle();
		//c1.rayon = 100; c1.xc = 50; c1.yc = 50; //V1 avec xc,yc,rayon public
		c1.setRayon(100); c1.setXc(50); c1.setYc(50);
		c1.setRayon(-70); //on demande au cercle c1 de modifier son rayon à -70
		                  //mais l'objet c1 refuse la valeur invalide dans .setRayon()
		System.out.println("valeurs du c1=" + c1.toString());
		System.out.println("perimetre de c1="+ c1.perimetre());
		c2 = new Cercle(60,60,200);
		c2.zoomer(2);
		//System.out.println("rayon de c2="+ c2.rayon);//V1 avec rayon public
		System.out.println("rayon de c2="+ c2.getRayon()); //V2 avec rayon private
		//System.out.println("valeurs du c2=" + c2.toString());
		System.out.println("valeurs du c2=" + c2); //avec appel implicite de .toString()
	}
	
	public static void testClasseEnveloppe() {
		int age1 = 25;
		//age1 = null; //null = valeur impossible sur int
		Integer age2 ;
		age2=25; //equivalent à écrire age2 = new Integer(25);
		age2=26; //équivalent à écrire age2 = new Integer(26);
		age2 = null; //null = valeur possible (et quelquefois par défaut) d'un Integer
		//la valeur null est pratique (et utile) : ça provient d'un null SQL 
		//ou d'une zone de saisie laissée à vide.
	}
	
	
	public static void testConversion() {
		String sA="5"; //sA est de type String (souvent après une saisie au clavier dans formulaire HTML)
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
		
		//déclarer les variables z1 et z2 de type double.
		//convertir "2.6" en numérique et stocker ça dans z1;
		//convertir la valeur 2 en double et stocker ça dans z2
		//afficher le résultat de la multiplication de z1 par z2
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
