package equipement;

public class Equipement {
	
	private int nbBallon;
	private int nbSacPlaquage;
	private int nbGourde;
	private int nbStrap;
	
	public Equipement(int nbBallon, int nbSacPlaquage, int nbGourde, int nbStrap) {
		this.nbBallon = nbBallon;
		this.nbSacPlaquage = nbSacPlaquage;
		this.nbGourde = nbGourde;
		this.nbStrap = nbStrap;
	}

	public int getNbBallon() {
		return nbBallon;
	}

	public int getNbSacPlaquage() {
		return nbSacPlaquage;
	}

	public int getNbGourde() {
		return nbGourde;
	}

	public int getNbStrap() {
		return nbStrap;
	}
	
}
