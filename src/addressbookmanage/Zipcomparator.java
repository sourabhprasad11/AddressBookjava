package addressbookmanage;
import java.util.Comparator;
import java.lang.Integer;

public class Zipcomparator implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.zipcode,p2.zipcode);
	}

}
