package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private int FORCE_MIN;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		if (this.force >= FORCE_MIN) {
			this.force = force;
		} else {
			assert this.force >= FORCE_MIN;
		}
		
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "' " + texte + "'");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
}
