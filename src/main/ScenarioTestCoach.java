package main;

import personnes.Coachs;
import personnes.Joueur;

public class ScenarioTestCoach {

	public static void main(String[] args) {
		Coachs coach1 = new Coachs ("Vincent", 38, "entraineur");
		coach1.sePresenter();
		Joueur joueur1 = new Joueur ("Luca", 25, "deuxième ligne", false, 45, 10);
		Joueur joueur2 = new Joueur ("Simon", 28, "troisième ligne", false, 45, 15);
		coach1.demandePresenceEntrainement(joueur1);
		coach1.demandePresenceEntrainement(joueur2);
		coach1.prepareEntrainement();
		
	}
}
