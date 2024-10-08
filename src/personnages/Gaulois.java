package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetpotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " 
	+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	/*
	 * @Override public String toString() { return "Gaulois [nom=" + nom +
	 * ", force=" + force + ", effetpotion=" + effetpotion + "]"; }
	 */

	public static void main(String[] args) {
		new Gaulois("Astérix", 8);
		//System.out.println("Astérix");
		// TODO creer un main permettant de tester la classe Gaulois
	}
}
