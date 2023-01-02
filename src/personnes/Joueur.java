package personnes;

public class Joueur extends Humain {	
	private boolean blessure;
	private int puissance;
	private int adresse;

	public Joueur(String nom, int age, String fonction, boolean blessure, int puissance, int adresse) {
		super(nom, age, fonction);
		this.blessure = blessure;
		this.puissance = puissance;
		this.adresse = adresse;
	}
	
	public int getPuissance() {
		return puissance;
	}
	
	public boolean presence(){
		if (! blessure) {
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
	
	public void plaquerAdversaire(Joueur adversaire) {
		if (puissance > adversaire.getPuissance()) {
			System.out.println("Je suis capable de plaquer "+ adversaire.getNom() + ".");
		}else {
			System.out.println(adversaire.getNom() + " va arriver à me passer !");
		}
	}
	
	public void fairePasse(Joueur joueur) {
		if (adresse >= 10) {
			System.out.println("Je peux faire la passe à " + joueur.getNom() + "!");
		}else {
			System.out.println("Je vais pas pouvoir faire une passe aussi longue à " + joueur.getNom() + ".");
		}
	}
}
	
	