package huffman;
import java.util.Map;

public class Noeud extends NoeudAbstrait {
	private NoeudAbstrait gauche;
	private NoeudAbstrait droit;
 
	public Noeud(int poids, NoeudAbstrait g, NoeudAbstrait d) {
		super(poids);
		gauche = g;
		droit = d;}
 
 
	public void fournitCodes(Map<Character, String> m, String prefixe) {}
	
	public Character getNextChar(String s)throws FinDeTexteInattendueException {
		return null;}
	
	public int hauteur() {return 1;}
}