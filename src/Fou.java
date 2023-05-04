package projetSynthese;

public class Fou extends projetSynthese.Piece {

	public Fou(String Couleur) {
		super("Fou", Couleur);
	}
	

	public boolean estValide(projetSynthese.Deplacement deplacement) {
		/*Le mouvement du fou est une diagonale, ainsi si l'on fais la diffrence des valeurs absolu des dpalcements X et Y,
		 * le rsultat devrait toujours tre 0.
		 */
		return Math.abs(deplacement.getDeplacementX()) - Math.abs(deplacement.getDeplacementY()) == 0 && !deplacement.isNul();
		
	}
}
