class PhoneBookDirectory {
	PhoneBookEntry[] array1 = new PhoneBookEntry[6];

	public int addEntry(PhoneBookEntry entry) {
		int k = 0;
		for (int i = 0; i < 6; i++) {
			if (array1[i].equals("")) {
				array1[1] = entry;
				k = 1;
				break;
			}	
		}
		return k;
	}

	public void printAllEntries() {
		for (int i = 0; i < array1.length; i++) {
			array1[i].printBookEntry();
		}
	}

	public int LinearSearchByPhoneNumber(String phoneNumber) {
		int k = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i].getPhoneNumber() == phoneNumber) {
				k = 1;
				break;
			}
		}
		return k;
	}

	public PhoneBookEntry SearchByIdBinarySearch(int id) {
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if (array1[i].getID() > array1[j].getID()) {
					PhoneBookEntry n = array1[i];
					array1[i] = array1[j];
					array1[j] = n;
				}
			}
		}
		int i = 0;
		int j = 5;
		int mid;
		while(i <= j){
			mid = (i + j) / 2;
			if(id == array1[mid].getID()) {
				return array1[mid];
			}
			if(id < array1[mid].getID()) {
				j = mid - 1;
			}
			else {
				i = mid + 1;
			}
		}
		return new PhoneBookEntry();
	}

	public int Edit(String firstName, String lastName) {
		int k = 0;
		for (int i = 0; i < 6; i++) {
			if ((array1[i].getFirstName()).equals(firstName) && (array1[i].getLastName()).equals(lastName)) {
				k = 1;
				array1[i].setFirstName(firstName);
				array1[i].setLastName(lastName);
				break;
			}
		}
		return k;
	}
}