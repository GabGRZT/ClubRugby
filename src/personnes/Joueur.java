package personnes;

public class Joueur extends Humain {	
	
	public Joueur(String nom, int age, String fonction) {
		super(nom, age, fonction);
	}
	
	public void presence(String presence)		 {
		if (presence == "OUI") {
			System.out.println("Je serais là.");	
		} else if (presence == "NON BLESSE"){
			System.out.println("Je ne serais pas là car je suis blesse/malade.");
		}else {
			System.out.println("Je ne serais pas là.");
		}
	}
		
	
}
	
	