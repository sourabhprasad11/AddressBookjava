package addressbookmanage;
import java.io.File;
import java.util.Scanner;



public class AddressBook {

	public static void main(String[] args) {
		
		AddressbookmanageImp abmi=new AddressbookmanageImp();
		System.out.println("1. New AddressBook");
		System.out.println("2. Open AddressBook");
		System.out.println("3. Save AddressBook");
		System.out.println("4. SaveAs AddressBook");
		System.out.println("5. Close AddressBook");
		System.out.println("0. Quit");
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number from above: ");
		int ans=ip.nextInt();
		
		do {
		switch(ans) {
			case 1: 
					abmi.newAddressBook();
					//System.out.println("working");
					break;
			case 2: 
					abmi.openAddressBook();
					//System.out.println("working");
				break;
			case 3: 
					abmi.saveAddressBook();
					//System.out.println("working");
				break;
			case 4: 
					abmi.saveasAddressBook();
					//System.out.println("working");
				break;
			case 5: 
					abmi.closeAddressBook();
					//System.out.println("working");
				break;
			case 6: 
					abmi.quit();
					//System.out.println("working");
				break;
			default:
					System.out.println("You have entered the wrong number...Terminating the application");
					ans=0;
				break;
			}
		}while(ans!=0);
		
		ip.close();

		
	}

}
