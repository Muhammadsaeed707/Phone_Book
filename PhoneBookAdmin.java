public class PhoneBookAdmin extends User {
	private String emailAddress;

	public PhoneBookAdmin() {
	}

	public PhoneBookAdmin(String user, String pass, String e, PhoneBookDirectory ph) {
		this.username = user;
		this.password = pass;
		this.emailAddress = e;
		this.phoneBookDirectory = ph;
	}

	public void setEmailAddress(String email){
		this.emailAddress = email;
	}

	public String getEmailAddress(){
		return this.emailAddress;
	}

	public void DeleteEntry(String f, String l){
		for(int i = 0; i < 6; i++){
			if ((this.phoneBookDirectory.array1[i].getFirstName()).equals(f) && (this.phoneBookDirectory.array1[i].getLastName()).equals(l)){
				this.phoneBookDirectory.array1[i]= new PhoneBookEntry();
			}
		}
	}

	public void Sort(){
		for(int i = 0; i < 6; i++){
			for(int j = i + 1; j < 6; j++){
				if(this.phoneBookDirectory.array1[i].getID()>this.phoneBookDirectory.array1[j].getID()){
					PhoneBookEntry n = this.phoneBookDirectory.array1[i];
					this.phoneBookDirectory.array1[i] = this.phoneBookDirectory.array1[j];
					this.phoneBookDirectory.array1[j] = n;
				}
			}
		}
	}

	public int LinearSearch(String ph){
		return this.phoneBookDirectory.LinearSearchByPhoneNumber(ph);
	}

	public PhoneBookEntry BinarySearch(int id){
		return this.phoneBookDirectory.SearchByIdBinarySearch(id);
	}

	public void PrintUserInfo(){
		System.out.println("Username: "+ this.username);
		System.out.println("Password: "+ this.password);
		System.out.println("Email Address: "+ this.emailAddress);
		this.phoneBookDirectory.printAllEntries();
	}

	public void ChangePassword(String pass){
		this.password = pass;
	}

	public void ChangeUsername(String user){
		this.username = user;
	}
}