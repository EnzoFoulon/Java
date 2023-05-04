package projetSynthese;
import projetSynthese.Deplacement;
import projetSynthese.Piece;
public class Tour extends Piece {
	public Tour(String Couleur) {
		super("Tour", Couleur);
	}
	public boolean estValide(Deplacement deplacement) {
		return deplacement.getDeplacementX() * deplacement.getDeplacementY() == 0 && !deplacement.isNul();
	}

}
