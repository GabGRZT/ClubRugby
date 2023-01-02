package main;

import personnes.Joueur;

public class ScenarioTestJoueur {

	public static void main(String[] args) {
		Joueur joueur1 = new Joueur ("Luca", 25, "deuxième ligne", false);
		joueur1.sePresenter();
		joueur1.payerLicence(70);
		joueur1.presence(true);
	}
	
	

}
