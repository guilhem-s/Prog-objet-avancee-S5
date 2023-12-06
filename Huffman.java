package huffman;
import java.util.Map;
import java.util.TreeMap;


public class Huffman {
	private Map<Character, String> dictionnaire;
	private NoeudAbstrait arbre;


	public Huffman(String texte) {
		initArbre(compteCaracteres(texte));
		initDictionnaire();
	}


	private Map<Character, Integer> compteCaracteres(String texte) {
		int count;
		Map<Character, Integer> occurrences = new TreeMap<>();
		char c;
		int i;
		while(texte.length() != 0) {	 
			count = 1;
			c = texte.charAt(0);
			texte = texte.substring(1);
			i = 0;
			while(i != texte.length()) {  
				if(texte.charAt(i) == c) {  
					count++;
					texte = texte.substring(0, i) + texte.substring(i+1);
				} else i++;
				occurrences.put(c, count);}}
		return occurrences;
		}

	
	
	public void initArbre(Map<Character, Integer> occurrences) {
		ListeTriee liste = new ListeTriee();
		for(Character c : occurrences.keySet()) {
			liste.add(new Feuille(c, occurrences.get(c)));
		}
		while(liste.size() != 1) {
			NoeudAbstrait a = liste.get(0);
			NoeudAbstrait b = liste.get(1);
			int poids = a.getPoids() + b.getPoids();
			Noeud n = new Noeud(poids, a, b);
			liste.remove(a); liste.remove(b);
			liste.add(n);			
		}
	}

	private void initDictionnaire() {}

	public NoeudAbstrait getArbre() {
		return arbre;
	}

	public Map<Character, String> getDictionnaire() {
		return dictionnaire;
	}

	public String code(String texte) throws CaractereInconnuException {
		return null;
	}
	public String decode(String texte) throws FinDeTexteInattendueException {
		return null;
	}
}
