package huffman;

import java.util.Comparator;
import java.util.Map;

class ValueComparator implements Comparator<String> {

	Map<String, Double> base;

    public ValueComparator(Map<String, Double> base) {
        this.base = base;
    }

    // Compare method to compare values
    @Override
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return 1; // -1 to sort in descending order
        } else {
            return -1;
        }
    }
}