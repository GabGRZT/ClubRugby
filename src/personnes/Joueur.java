package personnes;

public class Joueur extends Humain {	
	private boolean blessure;
	public Joueur(String nom, int age, String fonction, boolean blessure) {
		super(nom, age, fonction);
		this.blessure = blessure;
	}
	
	public boolean presence(boolean presence){
		if (presence) {
			System.out.println("Je serais là.");
			return true;
		} else if (blessure){
			System.out.println("Je ne serais pas là car je suis blesse/malade.");
			return false;
		}else {
			System.out.println("Je ne serais pas là.");
			return false;
		}
	}
	
	public void payerLicence (int argent) {
		System.out.println("J'ai payé ma licence, je peux enfin jouer.");
	}
}
	
	