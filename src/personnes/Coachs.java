package personnes;

import personnes.Joueur;

public class Coachs extends Humain {
	
	private Joueur [] participant;
	private int nbJoueurPresent = 0 ;
	
	public Coachs(String nom, int age, String fonction) {
		super(nom, age, fonction);
	}
	
	public void demandePresenceEntrainement(Joueur joueur) {
		if(joueur.presence(true)) {
			participant[nbJoueurPresent] = joueur;
			nbJoueurPresent += 1;
		}
	}
		
	public void nombreJoueurEntrainement() {
		for (int i = 0; i < participant.length; i++) {
			demandePresenceEntrainement(null);
		}
		if (participant.length < 15){
			System.out.println("Entrainement annulé");
		} else {
			System.out.println("Entrainement maintenu");
		}
	}
}
