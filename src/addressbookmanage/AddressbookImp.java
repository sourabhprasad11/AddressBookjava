package addressbookmanage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AddressbookImp implements AddressBookinter {
	public static ArrayList<Person> addressArrList= new ArrayList<>();

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
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Phone-number for updating the details: ");
		long phn= input.nextLong();
		
		for(Person person: addressArrList) {
			if(phn==person.phone){
				System.out.println("1. FirstName");
				System.out.println("2. LastName");
				System.out.println("3. Zipcode");
				System.out.println("4. City");
				System.out.println("5. State");
				System.out.println("Enter the choice from the above: ");
				int choice=input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the new value for First-Name: ");
					String first_name=input.next();
					person.setFirstname(first_name);
					break;
				case 2:
					System.out.println("Enter the new value for Last-Name: ");
					String last_name=input.next();
					person.setLastname(last_name);
					break;
				case 3:
					System.out.println("Enter the new value for Zip-code: ");
					int zip_code=input.nextInt();
					person.setZipcode(zip_code);
					break;
				case 4:
					System.out.println("Enter the new value for City: ");
					String city_c=input.next();
					person.setCity(city_c);
					break;
				case 5:
					System.out.println("Enter the new value for State: ");
					String state_s=input.next();
					person.setState(state_s);
					break;
				default:
					System.out.println("Value entered is wrong");
					break;
				}
			}
			
		}
		
	}
	public void deletePerson() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Phone Number of the person: ");
		long phone= input.nextLong();
		for(int i=0;i<addressArrList.size();i++){
			long phn_num= addressArrList.get(i).phone;
			if(phone==phn_num) {
				addressArrList.remove(i);
				System.out.println("Entry deleted successfully");
			}
			else {
				System.out.println("Phone number not found");
			}
		
		}
			
	}
	
	public void sortbyName() {
		Collections.sort(addressArrList, new Namecomparator());
		System.out.println("Sorted by Name");
		for(Person person: addressArrList) {
			System.out.println(person.toString());
		}
		
	}
	
	public void sortbyZip() {
		Collections.sort(addressArrList, new Zipcomparator());
		System.out.println("Sorted by Zip-code");
		for(Person person: addressArrList) {
			System.out.println(person.toString());
		}
	}
	
	public void searchPerson() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the First-Name of the person: ");
		String name= input.next();
		for(Person person: addressArrList) {
			if(name.equals(person.firstname)){
				System.out.println(person.toString());
				System.out.println();
			}
		}
	}
	
	public void display() {
		for(Person person:addressArrList) {
			System.out.println(person.toString());
			System.out.println();
		}
	}
	
		
}

