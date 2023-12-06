package huffman;
import java.util.Map;


public class Feuille extends NoeudAbstrait {
	private Character caractere;
 
 
	public Feuille(Character c, int poids) {
		super(poids);
		caractere = c;
	}
	
 	public void fournitCodes(Map<Character, String> m, String prefixe) {}
 	
 	public Character getNextChar(String s)throws FinDeTexteInattendueException {
 		return null;}
 	
 	public int hauteur() {
 		return 1;}
}
