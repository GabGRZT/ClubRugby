package personnes;

public class Coachs extends Humain {
	
	private Joueur [] participant;
	private int nbJoueur = 0 ;
	private int nbLicence;
	
	public Coachs(String nom, int age, String fonction) {
		super(nom, age, fonction);
	}
	
	public void faireEntrainement(Joueur joueur) {
		for (int i = 0; i < nbLicence; i++) {
			joueur.presence("OUI");
			participant[i] = joueur;
		}
		if (participant.length < 15){
			System.out.println("Entrainement annulé");
		} else {
			System.out.println("Entrainement maintenu");
		}

	}
}
