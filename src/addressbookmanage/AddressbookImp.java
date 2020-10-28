package addressbookmanage;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookImp implements AddressBookinter {
	ArrayList<Person> addressArrList= new ArrayList<>();

	public void addPerson() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the First-Name: ");
		String firstname =input.nextLine();
		
		System.out.println("Enter the Last-Name: ");
		String lastname =input.nextLine();
		
		System.out.println("Enter the Phone-Number: ");
		long phone =input.nextLong();
		
		System.out.println("Enter the Zip-Code: ");
		int zipcode =input.nextInt();
		
		System.out.println("Enter the City: ");
		String city=input.next();
		
		System.out.println("Enter the State: ");
		String state =input.next();
				
		Person person= new Person(firstname, lastname, phone, zipcode, city, state);
		addressArrList.add(person);
		System.out.println("Entries done Successfully");
		System.out.println();
	}
	
	public void editPerson() {
		
		
	}
	public void deletePerson() {
	
	}
	public void sortbyName() {
		
	}
	
	public void sortbyZip() {
	
	}
	
	public void searchPerson() {
		
	}
	
	public void display() {
		for(Person person:addressArrList) {
			System.out.println(person.toString());
			System.out.println();
		}
	}
}

