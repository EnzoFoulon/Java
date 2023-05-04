package projetSynthese;
import projetSynthese.Deplacement;
import projetSynthese.Piece;

public class Reine extends Piece{

	public Reine(String Couleur) {
		super("Reine", Couleur);
	}
	public boolean estValide(Deplacement deplacement) {
		return (Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0
				| deplacement.getDeplacementX() * deplacement.getDeplacementY() == 0) && !deplacement.isNul();
	}
}
