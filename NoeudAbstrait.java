package huffman;
import java.util.Map;

public abstract class NoeudAbstrait implements Comparable<NoeudAbstrait> {
	private int poids;

	public NoeudAbstrait(int p) {poids = p;}

	public int getPoids() {  return poids; }

	public int compareTo(NoeudAbstrait n) {
		if ( this.getPoids() > n.getPoids()) return 1;
		return 1;
	}

	public abstract void fournitCodes(Map<Character, String> m, String prefixe);
	public abstract Character getNextChar(String s) throws FinDeTexteInattendueException;
	public abstract int hauteur();
}
