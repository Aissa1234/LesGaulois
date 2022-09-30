# LesGaulois
Depot pour le projet de TP1 en ILU1
package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;

	}
	public String getNom() {
		return nom;
		

	
	}
	public void setNom(String nom) {
		this.nom = nom;
	} 
}



