class PhoneBookEntry {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String zipCode;
	private String phoneNumber;

	public PhoneBookEntry() {
		super();
	}

	public PhoneBookEntry(int id, String firstName, String lastName, String email, String zipCode, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	public PhoneBookEntry(String firstName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
	}

	public PhoneBookEntry(String firstName) {
		super();
		this.firstName = firstName;
	}

	public void printBookEntry() {
		System.out.println("Id:"+id);
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Email: "+email);
		System.out.println("Zip Code: "+zipCode);
		System.out.println("Phone Number: "+phoneNumber);
	}

	public int getID() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
