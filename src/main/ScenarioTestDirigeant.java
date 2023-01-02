package main;

import personnes.Joueur;
import personnes.DirigeantsClub;
import personnes.Coachs;

public class ScenarioTestDirigeant {

	public static void main(String[] args) {
		DirigeantsClub recruteur = new DirigeantsClub ("Fabien", 35, "recruteur", 15, 80000);
		recruteur.sePresenter();
		recruteur.recrutementJoueur(2);
		DirigeantsClub secretaire = new DirigeantsClub ("Christian", 45, "secretaire", 17, 80000);
		secretaire.sePresenter();
		secretaire.acheterBallon(5);
		secretaire.acheterSacPlaquage(5);
		secretaire.acheterGourde(4);
		secretaire.acheterStrap(4);
		secretaire.gestionArgentClub();
		
	}

}
