package projetSynthese;
import projetSynthese.Case;
import projetSynthese.Deplacement;
public interface MethodesEchiquier
{
	
	public abstract void debuter();
	public abstract Case getCase(int ligne, int colonne);
	public abstract boolean cheminPossible (Deplacement deplacement);
	public abstract boolean captureParUnPionPossible(Deplacement deplacement);
}
