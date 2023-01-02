package personnes;

public class Coachs extends Humain {
	
	private Joueur [] participant;
	private int nbJoueur = 0 ;
	
	public Coachs(String nom, int age, String fonction) {
		super(nom, age, fonction);
		this.participant = participant;
	}
	
	public void faireEntrainement () {
			if (Joueur.presenceEntrainement(1)) {
				nbJoueur += 1;
				participant[nbJoueur];
			}
		
		if (participant.length < 15){
			System.out.println("Entrainement annulé");
		} else {
			System.out.println("Entrainement maintenu");
		}
		
		
	}

}
