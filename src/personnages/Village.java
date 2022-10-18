package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;

	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterVillageois(Gaulois g) {
		villageois[nbVillageois] = g;
		nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int n) {
		return villageois[n];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " habitent :");
		for (int i = 0;i<nbVillageois;i++) {
			System.out.println(villageois[i].getNom());
		

}
}
}
