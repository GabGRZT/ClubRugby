package personnes;

public class Coachs extends Humain {
	
	private String [] participant;
	private int nbJoueurPresent = 0;
	
	public Coachs(String nom, int age, String fonction) {
		super(nom, age, fonction);
		this.participant = participant;
	}
	
	public void demandePresenceEntrainement(Joueur joueur) {
			if(joueur.presence()) {
				participant [nbJoueurPresent] = joueur.getNom();
				nbJoueurPresent += 1;
				System.out.println("Il y a " + participant[0] + ".");
			}
	}
	
	public void prepareEntrainement () {
		if (participant.length < 2) {
			System.out.println("Entrainement annulé");
		}else {
			System.out.println("Entrainement maintenu");
		}
	}
	
		
}
