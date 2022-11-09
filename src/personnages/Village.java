package personnages;

import personnages.Chef;
public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant( Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans " + nom + " du chef " + chef.getNom() + " vivent les gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-" + villageois[i].getNom());
		}
	}

	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30); le tableau a 30 places donc la case d'indice 30 n'existe pas
		
		Chef abraracourcix = new Chef("Abraracourcix",6village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);  
		//System.out.println(gaulois); Renvoie null car un objet ne peut pas etre affiché 
	
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
