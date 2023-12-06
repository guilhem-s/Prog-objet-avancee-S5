package huffman;
import java.util.Map;
import java.util.PriorityQueue;
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
		Map<Character, Integer> dictionnaire = new TreeMap<>();
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
				dictionnaire.put(c, count);}}
		return dictionnaire;}
	
	
	private PriorityQueue<Noeud> initFilePrioritaire(Map<Character, Integer> occurrences) {
        PriorityQueue<Noeud> filePrioritaire = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            filePrioritaire.add(new Feuille(entry.getKey(), entry.getValue()));
        }
        return filePrioritaire;
    }
	
	
	public void initArbre(Map<Character, Integer> occurrences) {
        PriorityQueue<NoeudArbre> filePrioritaire = initFilePrioritaire(occurrences);

        // Construction de l'arbre de Huffman
        while (filePrioritaire.size() > 1) {
            NoeudAbstrait gauche = filePrioritaire.poll();
            NoeudAbstrait droite = filePrioritaire.poll();
            NoeudAbstrait nouveauNoeud = new Noeud(gauche, droite);
            filePrioritaire.add(nouveauNoeud);
        }

        // L'arbre est le seul élément restant dans la file de priorité
        this.arbre = filePrioritaire.poll();
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