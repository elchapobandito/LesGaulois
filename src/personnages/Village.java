package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef + " vivent les légendaires :");

		for (int i = 0; i < this.nbVillageois; i++) {
			System.out.println(trouverHabitant(i));
		}
	}

	public static void main() {
		Village village = new Village("Village des irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		// remove this useless assignment to local variable 'gaulois'

		Chef chef = new Chef("Abraracourcix", 6, village);
		Gaulois chefg = new Gaulois(chef.getNom(), chef.getForce());
		village.ajouterHabitant(chefg);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// rien ne se passe
		// print un objet de la classe Gaulois impossible ?
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}
}