package huffman;
import java.util.Collection;
import java.util.LinkedList;


@SuppressWarnings("serial")
public class ListeTriee extends LinkedList<NoeudAbstrait> {
	public ListeTriee() {}


	public ListeTriee(Collection<? extends NoeudAbstrait> c) { 
		super(c);		
	}

	public boolean add(NoeudAbstrait n) {
		boolean ajout = super.add(n);
		this.sort(Comparable::compareTo);
		return ajout;
	}

	public boolean addAll(Collection<? extends NoeudAbstrait> c) {
		boolean ajout = super.addAll(c);
		this.sort(Comparable::compareTo);
		return ajout;
	}
}
