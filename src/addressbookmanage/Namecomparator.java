package addressbookmanage;
import java.util.Comparator;

public class Namecomparator implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		return p1.firstname.compareTo(p2.firstname);
	}
}
