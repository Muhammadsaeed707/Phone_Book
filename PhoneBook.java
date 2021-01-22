import java.util.Scanner;
public class PhoneBook {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String fname,lname,email,zip,phoneNumber;

		System.out.println("Enter first person details (All the arguments)");

		System.out.print("Enter id : ");
		id=sc.nextInt();
		sc.nextLine();

		System.out.print("Enter first name : ");
		fname=sc.nextLine();

		System.out.print("Enter last name : ");
		lname=sc.nextLine();

		System.out.print("Enter email : ");
		email=sc.nextLine();

		System.out.print("Enter zip : ");
		zip=sc.nextLine();

		System.out.print("Enter phone number : ");
		phoneNumber=sc.nextLine();

		PhoneBookEntry firstPerson = new PhoneBookEntry(id,fname,lname,email,zip,phoneNumber);

		firstPerson.printBookEntry();

		System.out.println("\n\n\nEnter second person details(First name and Phone Number only)");

		System.out.print("Enter first name : ");
		fname=sc.nextLine();

		System.out.print("Enter phone number : ");
		phoneNumber=sc.nextLine();

		PhoneBookEntry secondPerson = new PhoneBookEntry(fname,phoneNumber);

		System.out.println(secondPerson.getFirstName() + "," + secondPerson.getPhoneNumber());

		System.out.println("\n\n\nEnter third person details(First name only)");

		System.out.print("Enter first name : ");
		fname=sc.nextLine();

		PhoneBookEntry thirdPerson = new PhoneBookEntry(fname);

		System.out.println(thirdPerson.getFirstName());
	}
}
