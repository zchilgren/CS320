package main;

public class Contact {
	
	private static final int CONTACT_PHONE_LEN = 10;
	private static final byte CONTACT_ID_LEN = 10;
	private static final byte CONTACT_FNAME_LEN = 10;
	private static final byte CONTACT_LNAME_LEN = 10;
	private static final byte CONTACT_ADDRESS_LEN = 30;
	private static final String INITIALIZER = "INITIAL";
	private static final String INITIALIZER_NUM = "1235559999";
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	Contact() {
		this.contactId = INITIALIZER;
		this.firstName = INITIALIZER;
		this.lastName = INITIALIZER;
		this.phoneNum = INITIALIZER;
		this.address = INITIALIZER;
	}
	
	Contact(String contactId) {
		updateContactId(contactId);
		this.firstName = INITIALIZER;
		this.lastName = INITIALIZER;
		this.phoneNum = INITIALIZER_NUM;
		this.address = INITIALIZER;
	}
	
	Contact(String contactId, String firstName) {
		updateContactId(contactId);
		this.firstName = INITIALIZER;
		this.lastName = INITIALIZER;
		this.phoneNum = INITIALIZER_NUM;
		this.address = INITIALIZER;
	}
	
	Contact(String contactId, String firstName, String lastName) {
		updateContactId(contactId);
		updateFirstName(firstName);
		updateLastName(lastName);
		this.phoneNum = INITIALIZER_NUM;
		this.address = INITIALIZER;
	}
	
	Contact(String contactId, String firstName, String lastName, String phoneNum) {
		updateContactId(contactId);
		updateFirstName(firstName);
		updateLastName(lastName);
		updatePhoneNum(phoneNum);
		this.address = INITIALIZER;
	}
	
	Contact(String contactId, String firstName, String lastName, String phoneNum, String address) {
		updateContactId(contactId);
		updateFirstName(firstName);
		updateLastName(lastName);
		updatePhoneNum(phoneNum); 
		updateAddress(address);
	}
	
	protected final String getContactId() { return contactId; }
	protected final String getFirstName() { return firstName; }
	protected final String getLastName() { return lastName; }
	protected final String getPhoneNumber() { return phoneNum; }
	protected final String getAddress() { return address; }
	
	protected void updateFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("First name cannot be empty");
		} else if (firstName.length() > CONTACT_FNAME_LEN) {
			throw new IllegalArgumentException ("First name cannot be longer than " + CONTACT_FNAME_LEN + " characters");
		} else {
			this.firstName = firstName;
			}
	}
	
	protected void updateLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be empty");
		} else if (lastName.length() > CONTACT_LNAME_LEN) {
			throw new IllegalArgumentException ("Last name cannot be longer than " + CONTACT_LNAME_LEN + " characters");
		} else {
		this.lastName = lastName;
		}
	}
	
	protected void updatePhoneNum(String phoneNum) {
		String regex = "[0-9]+";
		if (phoneNum == null) {
			throw new IllegalArgumentException ("Phone number cannot be empty.");
		} else if (phoneNum.length() != CONTACT_PHONE_LEN) {
			throw new IllegalArgumentException("Phone number length invalid. Ensure it is" + CONTACT_PHONE_LEN + " digits.");
		} else if (!phoneNum.matches(regex)) {
			throw new IllegalArgumentException ("Phone number cannot have anything but numbers");
		} else {
		this.phoneNum = phoneNum;
		}
	}
	
	protected void updateAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Address cannot be empty");
		} else if (address.length() > CONTACT_ADDRESS_LEN) {
			throw new IllegalArgumentException("Address cannot be longer than " + CONTACT_ADDRESS_LEN + " characters");
		} else {
		this.address = address;
		}
	}
	
	protected void updateContactId(String contactId) {
		if (contactId == null) {
			throw new IllegalArgumentException("Contact ID cannot be empty");
		} else if (contactId.length() > CONTACT_ID_LEN) {
			throw new IllegalArgumentException ("Contact ID cannot be longer than" + CONTACT_ID_LEN + " characters");
		} else {
			this.contactId = contactId;
		}
	}
}