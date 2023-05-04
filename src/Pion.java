package projetSynthese;

import projetSynthese.Deplacement;
import projetSynthese.Piece;
public class Pion extends Piece {
	

	public Pion(String Couleur) {
		super("Pion", Couleur);
	}



	public boolean estValide(Deplacement deplacement) {
		if (deplacement.getDeplacementX() == 0)
			if (this.getCouleur().equals("noir")){
				return deplacement.getDeplacementY() <= (deplacement.getDepart().getLigne() == 1 ? 2 : 1) && deplacement.getDeplacementY() > 0;
			}
			else 
				return deplacement.getDeplacementY() >= (deplacement.getDepart().getLigne() == 6 ? -2 : -1) && deplacement.getDeplacementY() < 0;
		return false;				
	}
}
