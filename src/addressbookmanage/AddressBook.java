package addressbookmanage;
import java.io.File;
import java.util.Scanner;


public class AddressBook {
	public static void main(String[] args) {
		int val=1;
		while(val==1){
			AddressbookmanageImp abmi=new AddressbookmanageImp();
			System.out.println("***WELCOME TO THE ADDRESS BOOK***");
			System.out.println("1. Create New AddressBook");
			System.out.println("2. Open AddressBook");
			System.out.println("3. Save AddressBook");
			System.out.println("4. SaveAs AddressBook");
			System.out.println("5. Close AddressBook");
			System.out.println("6. Quit");
			System.out.println("Enter the number from above: ");
		
			Scanner ip=new Scanner(System.in);
			int ans=ip.nextInt();
			
			switch(ans) {
				case 1: 
						abmi.newAddressBook();
						break;
				case 2: 
						abmi.openAddressBook();
						break;
				case 3: 
						abmi.saveAddressBook();
						break;
				case 4: 
						abmi.saveasAddressBook();
						break;
				case 5: 
						abmi.closeAddressBook();
						break;
				case 6: 
					System.exit(0);
					break;
			default:
					System.out.println("You have entered the wrong number...Terminating the application");
					// break;
			}
		}
	}

}
