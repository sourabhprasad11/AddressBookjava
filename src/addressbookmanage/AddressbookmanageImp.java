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
		File file =new File("D:\\javaFiles");
		String[] filenamesD=file.list();
		if (filenamesD== null) {
			System.out.println("File with the name does not exists");
		}
		else {
			for(int i=0; i<filenamesD.length; i++ ) {
				String filename=filenamesD[i];
				System.out.println(filename);
			}
		}
		System.out.println("Enter the File-name to be used: ");
		Scanner ip =new Scanner(System.in);
		String fileip= ip.nextLine();
		String line="";
		try {
			BufferedReader br= new BufferedReader(new FileReader("D:\\javaFiles\\"+fileip+".csv"));
			while((line =br.readLine())!= null) {
				String[] s= line.split(",");
				System.out.println("FirstName:"+s[0]+"\nLastName:"+s[1]+"\nPhone:"+s[2]+"\nZipCode:"+s[3]+"\nCity:"+s[4]+"\nState:"+s[5]);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

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
		abi.writeToFile();		

	}
	
	public void saveasAddressBook() {
		abi.writeToFile();
	
		System.out.println("SuccessFully saved the Data");
		System.out.println("Enter the file-name to be renamed: ");
		Scanner ip=new Scanner(System.in);
		String fileoldname=ip.nextLine();
		File fileold=new File("D:\\javaFiles\\"+fileoldname+".csv");
		System.out.println("Enter the new-name of the file: ");
		String filenewname=ip.nextLine();
		File filenew=new File("D:\\javaFiles\\"+filenewname+".csv");
		boolean b=fileold.renameTo(filenew);
		if(b) {
			System.out.println("Saved to"+filenew+"file");
		}else {
			
		}
	}
	
	public void closeAddressBook() {
	
	}
	
	public void quit() {
	
	}
}
