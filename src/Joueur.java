
public class Joueur {
	Point pion;
	String pseudo;
	double distanceParcourue;
	
	public Joueur(Point posDepart, String pseudo) {
		pion = posDepart.clone();
	}
}
