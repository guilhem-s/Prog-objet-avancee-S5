package huffman;


import java.util.Map;
import java.util.TreeMap;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,Double> map = new TreeMap<String,Double>();
		ValueComparator comparateur = new ValueComparator(map);
		TreeMap<String,Double> mapTriee = new TreeMap<String,Double>(comparateur);
		map.put("A",99.5);
		map.put("B",67.4);
		map.put("C",65.2);
		System.out.println("map non-triée: "+map); //La commande suivante affichera map non-triée: {A=99.5, B=67.4, C=65.2}.
		mapTriee.putAll(map);
		System.out.println("resultat du tri: "+ mapTriee); //La commande suivante affichera résultat: {C=65.2, B=67.4, A=99.5}.



		Map<Character, Integer> dictionnaire = new TreeMap<>();

		System.out.println("Clés: " + dictionnaire.keySet());
		System.out.println("Values: " + dictionnaire.values());
		System.out.println("Entrées: " + dictionnaire.entrySet());
	}

}
