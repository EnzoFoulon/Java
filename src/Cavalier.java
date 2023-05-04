package projetSynthese;
import projetSynthese.Piece;
import projetSynthese.Deplacement;


public class Cavalier extends Piece {
	

	public Cavalier(String Couleur) {
		super("Cavalier", Couleur);
	}

	public boolean estValide(Deplacement deplacement) {
		/*Verifie si le quotient des deux deplacement est gal a 2 ou  .5, se qui garantie que la
		 * piece  fait un mouvement en "L".
		 */
		return (Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY())) == 2 |
				(Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY())) == .5;
	}
}
