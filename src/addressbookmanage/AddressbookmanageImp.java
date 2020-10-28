package addressbookmanage;
//import com.opencsv.CSVWriter;
import java.io.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressbookmanageImp implements AddressBookManagerinter {
	
	AddressbookImp abi=new AddressbookImp();
	
	public void newAddressBook() {
			
	}
	
	public void openAddressBook() {
		int val=1;
		while(val==1){
			Scanner input =new Scanner(System.in);	
			System.out.println("1. Add Person ");
			System.out.println("2. Edit Person ");
			System.out.println("3. Delete Person");
			System.out.println("4. Sort By Name");
			System.out.println("5. Sort By Zip-code");
			System.out.println("6. Search the person ");
			System.out.println("7. Display the list ");
			System.out.println("8. Return to the main menu");
			System.out.println("Enter the choice: ");
			int choice=input.nextInt();
		switch(choice) {
			case 1:
				abi.addPerson();
				break;
			case 2:
				abi.editPerson();
				break;
			case 3:
				abi.deletePerson();
				break;
			case 4:
				abi.sortbyName();
				break;
			case 5:
				abi.sortbyZip();
				break;
			case 6: 
				abi.searchPerson();
				break;
			case 7:
				abi.display();
				break;
			case 8:
				System.out.println("quit");
				System.exit(0);
				break;
			default:
				System.out.println("Error: Given the wrong input");
			}
		}
	}
	
	public void saveAddressBook() {
	
	}
	
	public void saveasAddressBook() {
		
	}
	
	public void closeAddressBook() {
	
	}
	
	public void quit() {
	
	}
}
