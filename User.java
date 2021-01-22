public class User {
	protected String username;
	protected String password;
	PhoneBookDirectory phoneBookDirectory = new PhoneBookDirectory();

	public User() {
	}

	public User(String user, String pass, PhoneBookDirectory ph) {
		this.username = user;
		this.password = pass;
		this.phoneBookDirectory = ph;
	}

	public void setUsername(String user) {
		this.username = user;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public void AddEntry(PhoneBookEntry e) {
		this.phoneBookDirectory.addEntry(e);
	}

	public void EditEntry(String f, String l){
		this.phoneBookDirectory.Edit(f,l);
	}

	public void PrintUserInfo(){
		System.out.println("Username: "+ this.username);
		System.out.println("Password: "+ this.password);
		this.phoneBookDirectory.printAllEntries();
	}
}
