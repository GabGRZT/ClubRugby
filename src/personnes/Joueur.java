package personnes;

public class Joueur extends Humain {
	private String poste;
	
	public Joueur(String nom, int age, String fonction) {
		super(nom, age, fonction);
		this.poste = poste;
	}
	
	public void presenceEntrainement(boolean presence) {
		if (presence) {
			System.out.println("Je serais là pour l'entrainement");	
		} else {
			System.out.println("Je ne serais pas là pour l'entrainement");
		}
	
	}
	
	public void presenceMatc() {
		
	}
}
