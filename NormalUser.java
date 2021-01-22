public class NormalUser extends User {
	private int id;

	public NormalUser() {
	}

	public NormalUser(int i, String user, String pass, PhoneBookDirectory ph) {
		this.id = i;
		this.username = user;
		this.password = pass;
		this.phoneBookDirectory = ph;
	}

	public void setId(int i) {
		this.id = i;
	}

	public int getId() {
		return this.id;
	}

	public void PrintUserInfo() {
		System.out.println("id: "+ this.id);
		System.out.println("Username: "+ this.username);
		System.out.println("Password: "+ this.password);
		this.phoneBookDirectory.printAllEntries();
	}
}