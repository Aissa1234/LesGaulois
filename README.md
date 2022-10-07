# LesGaulois
Depot pour le projet de TP1 en ILU1

Aissaoui Mehdi <mehdiaissaoui24@gmail.com>
20:02 (il y a 0 minute)
À moi

package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Chef(String nom, int force, int effetPotion, Village village) {
	this.nom = nom;
	this.force = force;
	this.effetPotion = effetPotion;
	this.village = village;
	}
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
	return "Le chef " + nom + " du village " + village.getNom() + " : ";
	}
	
	public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
	romain.getNom());
	romain.recevoirCoup(force / 3);
	}


}

package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut allerd'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

}package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut allerd'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

}

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
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le gaulois" + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans le machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}

	public static void main(String[] args) {
		asterix (nom = "Astérix", force = 8);
		System.out.println(asterix);

	}

}

package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force= force;
	}
	
	public void parler(String texte) {
		 System.out.println(prendreParole() + "<<" + texte +">>");
	 }
	 private String prendreParole() {
		return "Le romain" + nom +" : ";
	 } 
	 
	 public void recevoirCoup(int forceCoup) {
		 force -= forceCoup;
		 if (force > 0) {
			 parler("Aie");
		 } else { 
			 parler("j'abondonne...");
		 }
	 }
}

