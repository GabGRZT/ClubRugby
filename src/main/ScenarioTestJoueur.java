package main;

import personnes.Joueur;

public class ScenarioTestJoueur {

	public static void main(String[] args) {
		Joueur joueur1 = new Joueur ("Luca", 25, "deuxième ligne", false, 40, 10);
		joueur1.sePresenter();
		joueur1.payerLicence(70);
		joueur1.presence();
		Joueur joueur2 = new Joueur ("Simon", 28, "troisième ligne", false, 45, 15);
		joueur1.plaquerAdversaire(joueur2);
		joueur2.fairePasse(joueur1);
	}
	
	

}
