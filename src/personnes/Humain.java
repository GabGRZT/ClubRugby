package personnes;

public class Humain {
	private String nom;
	private int age;
	private String fonction;
	
	public Humain(String nom, int age, String fonction) {
		this.nom = nom;
		this.age = age;
		this.fonction = fonction;
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public String getFonction() {
		return fonction;
	}
	
	public void sePresenter() {
		System.out.println("Bonjour, je m'appelle "
							+ nom
							+ ", j'ai "
							+ age
							+ " ans et je suis "
							+ fonction
							+ " dans le club.");
	}

}
