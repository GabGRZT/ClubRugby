package main;

import personnes.Joueur;
import personnes.DirigeantsClub;
import personnes.Coachs;

public class ScenarioTestDirigeant {

	public static void main(String[] args) {
		DirigeantsClub dirigeant = new DirigeantsClub ("Christian", 45, "recruteur", 15);
		dirigeant.sePresenter();
		dirigeant.recrutementJoueur(2);

	}

}
