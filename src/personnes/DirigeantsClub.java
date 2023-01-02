package personnes;

import equipement.Equipement;

public class DirigeantsClub extends Humain{ 
	
	private int nbJoueurClub;
	private int argentClub;
	
	public DirigeantsClub(String nom, int age, String fonction, int nbJoueurClub, int argentClub) {
		super(nom, age, fonction);
		this.nbJoueurClub = nbJoueurClub;
		this.argentClub = argentClub;
	}
	
	public void acheterBallon(int stockBallon) {
		if (stockBallon < 5) {
			System.out.println("Nous devons acheté de nouveaux ballons");
			for (int i = 0; i < stockBallon; i++) {
				stockBallon += 1;
				argentClub -= 70;
			}
			System.out.println("C'est bon, nous avons " + stockBallon +" ballons.");
		}else {
			System.out.println("Nous avons " + stockBallon + " ballons. C'est suffisant.");
		}
	}
	
	public void acheterSacPlaquage( int StockSacPlaquage) {
		if (StockSacPlaquage < 3) {
			System.out.println("Nous devons acheté de nouveaux sac de plaquages");
			for (int i = 0; i < StockSacPlaquage; i++) {
				StockSacPlaquage += 1;
				argentClub -= 50;
			}
			System.out.println("C'est bon, nous avons " + StockSacPlaquage +"sac de plaquages.");
		}else {
			System.out.println("Nous avons " + StockSacPlaquage + " sac de plaquage. C'est suffisant.");
		}
	}
	
	public void acheterGourde(int stockGourde) {
		if (stockGourde < 20) {
			System.out.println("Nous devons acheté de nouvelles gourdes");
			for (int i = stockGourde; i < 20; i++) {
				stockGourde += 1;
				argentClub -= 5;
			}
			System.out.println("C'est bon, nous avons " + stockGourde +" gourdes. ");
		}else {
			System.out.println("Nous avons " + stockGourde + " gourdes. C'est suffisant.");
		}
	}
	
	public void acheterStrap(int stockStrap) {
		if (stockStrap < 25) {
			System.out.println("Nous devons acheté de nouvelles bandes de strap.");
			for (int i = stockStrap; i < 25; i++) {
				stockStrap += 1;
				argentClub -= 5;
			}
			System.out.println("C'est bon, nous avons " + stockStrap +" bandes de strap.");
		}else {
			System.out.println("Nous avons " + stockStrap + " bandes de strap. C'est suffisant.");
		}
	}
	
	public void recrutementJoueur(int nbJoueurRecrute) {
		if (nbJoueurClub < 20) {
			System.out.println("Le club doit recruter de nouveaux joueurs !");
			nbJoueurClub += nbJoueurRecrute;
			System.out.println("Nous avons recrute " + nbJoueurRecrute + " joueurs. Il y a maintenant " + nbJoueurClub +" joueurs.");
		}else {
			System.out.println("Il y a beaucoup de joueur dans l'equipe, nous verrons le recrutement plus tard.");
		}	
	}
	
	public void gestionArgentClub() {
		System.out.println("Argent du club : " + argentClub);
	}
}

