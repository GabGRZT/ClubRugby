package personnes;

public class DirigeantsClub extends Humain{
	
	private int nbJoueurClub;
	private int argentClub;
	public DirigeantsClub(String nom, int age, String fonction, int nbJoueurClub) {
		super(nom, age, fonction);
		this.nbJoueurClub = nbJoueurClub;
		this.argentClub = argentClub;
	}
	
	public void gestionEquipement() {
		
	}
	
	public void acheterBallon(int ballon) {
		if (ballon < 5) {
			System.out.println("Nous devons acheté de nouveaux ballons");
			ballon += 10;
			argentClub -= 100;
			System.out.println("C'est bon, nous les recevrons la semaine prochaine");
		}else {
			System.out.println("Nous avons " + ballon + " ballons. C'est suffisant.");
		}
	}
	
	public void acheterSacPlaquage( int sacPlaquage) {
		if (sacPlaquage < 3) {
			System.out.println("Nous devons acheté de nouveaux sec de plaquages");
			sacPlaquage += 5;
			argentClub -= 100;
			System.out.println("C'est bon, nous les recevrons la semaine prochaine");
		}else {
			System.out.println("Nous avons " + sacPlaquage + " sac de plaquage. C'est suffisant.");
		}
	}
	
	public void acheterGourde(int gourde) {
		if (gourde < 20) {
			System.out.println("Nous devons acheté de nouvelles gourdes");
			gourde += 5;
			argentClub -= 70;
			System.out.println("C'est bon, nous les recevrons la semaine prochaine et ");
		}else {
			System.out.println("Nous avons " + gourde + " gourdes. C'est suffisant.");
		}
	}
	
	public void acheterStrap(int strap) {
		if (strap < 25) {
			System.out.println("Nous devons acheté de nouvelles gourdes");
			strap += 35;
			argentClub -= 50;
			System.out.println("C'est bon, nous les recevrons la semaine prochaine");
		}else {
			System.out.println("Nous avons " + strap + " bandes de strap. C'est suffisant.");
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
		
	}
	
	
	

}
