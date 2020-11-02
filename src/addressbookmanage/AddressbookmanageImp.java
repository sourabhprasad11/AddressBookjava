package addressbookmanage;
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookmanageImp implements AddressBookManagerinter {
	AddressbookImp abi=new AddressbookImp();
	
	public void newAddressBook() {
		System.out.println("Enter the name for the CSV-file: ");
		Scanner input =new Scanner(System.in);
		String filename=input.nextLine();
		try {
			File file= new File("D:\\javaFiles\\"+filename+".csv");
			if(file.createNewFile()) {
				System.out.println("AddressBook Created");
			}
			else {
				System.out.println("AddressBook name already exists");
			}
		}catch(Exception e){
			System.out.println(e);
		}
			
	}
	
	public void openAddressBook() {
		
		int val=1;
		while(val==1){
			Scanner input =new Scanner(System.in);	
			System.out.println("WELCOME TO THE ADDRESS BOOK MANAGEMENT");
			System.out.println("1. Add Person ");
			System.out.println("2. Edit Person ");
			System.out.println("3. Delete Person");
			System.out.println("4. Sort By Name");
			System.out.println("5. Sort By Zip-code");
			System.out.println("6. Search the person ");
			System.out.println("7. Display the list ");
			System.out.println("8. Quit");
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
				val=0;
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
