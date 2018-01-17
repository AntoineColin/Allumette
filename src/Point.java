import java.awt.Color;

public class Point {
	double posx, posy;
	Color couleur;
	
	public Point(double posx, double posy) {
		this.posx = posx;
		this.posy = posy;
		//creer une couleur random
	}
	
	public Point clone() {
		return new Point(posx, posy);
	}
}
