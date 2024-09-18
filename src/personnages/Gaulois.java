package personnages;

public class Gaulois {

	public static void main(String[] args) {
		
	}

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	private int force;
	private int effetPotion = 1;

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
}
