package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.juniper.api.Test;

public class ContactTest {
	protected String contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest;
	protected String tooLongContactId, tooLongFirstName, tooLongLastName, tooLongPhoneNumber, tooShortPhoneNumber, tooLongAddress;
}

	@BeforeEach 
	void setUp() {
		contactId = "10293A475F";
		firstNameTest = "James";
		lastNameTest = "Dean";
		phoneNumberTest = "4204092211";
		addressTest = "7811 Thompson St, Palatine, IL 60067";
		tooLongContactId = "112233445566778899";
		tooLongFirstName = "The Big James";
		tooLongLastName = "Deaning";
		tooLongPhoneNumber = "12345678910";
		tooShortPhoneNumber = "1234567";
		tooLongAddress = "7811 Thompson Streeet, Palatine, Illinois 60067";
	}

	@Test
	void contactTest() {
		Contact contact = new Contact();
		assertAll("constructor",
				()
					-> assertNotNull(contact.getContactId()),
				()
					-> assertNotNull(contact.getFirstName()),
				()
					-> assertNotNull(contact.getLastName()),
				()
					-> assertNotNull(contact.getPhoneNumber()),
				()
					-> assertNotNull(contact.getAddress()));
	}
	
	@Test
	void contactIdConstructorTest() {
		Contact contact = new Contact(contactId);
		assertAll("constructor one",
				()
					-> assertNotNull(contactId, contact.getContactId()),
				()
					-> assertNotNull(contact.getFirstName()),
				()
					-> assertNotNull(contact.getLastName()),
				()
					-> assertNotNull(contact.getPhoneNumber()),
				()
					-> assertNotNull(contact.getAddress()));
	}
	
	@Test
	void contactIdAndFirstNameConstructorTest() {
		Contact contact = new Contact(contactId, firstNameTest);
		assertAll("constructor two",
				()
					-> assertNotNull(contactId, contact.getContactId()),
				()
					-> assertNotNull(firstNameTest, contact.getFirstName()),
				()
					-> assertNotNull(contact.getLastName()),
				()
					-> assertNotNull(contact.getPhoneNumber()),
				()
					-> assertNotNull(contact.getAddress()));
	}
	
	@Test
	void contactIdAndFullNameConstructorTest() {
		Contact contact = new Contact(contactId, firstNameTest, lastNameTest);
		assertAll("constructor three",
				()
					-> assertNotNull(contactId, contact.getContactId()),
				()
					-> assertNotNull(firstNameTest, contact.getFirstName()),
				()
					-> assertNotNull(lastNameTest, contact.getLastName()),
				()
					-> assertNotNull(contact.getPhoneNumber()),
				()
					-> assertNotNull(contact.getAddress()));
	}
	
	@Test
	void contactIdAndFullNamePhoneNumberConstructorTest() {
		Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest);
		assertAll("constructor four",
				()
					-> assertNotNull(contactId, contact.getContactId()),
				()
					-> assertNotNull(firstNameTest, contact.getFirstName()),
				()
					-> assertNotNull(lastNameTest, contact.getLastName()),
				()
					-> assertNotNull(phoneNumberTest, contact.getPhoneNumber()),
				()
					-> assertNotNull(contact.getAddress()));
	}
	
	@Test
	void allTheProperThingsConstructorTest() {
		Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
		assertAll("constructor all",
				()
					-> assertNotNull(contactId, contact.getContactId()),
				()
					-> assertNotNull(firstNameTest, contact.getFirstName()),
				()
					-> assertNotNull(lastNameTest, contact.getLastName()),
				()
					-> assertNotNull(phoneNumberTest, contact.getPhoneNumber()),
				()
					-> assertNotNull(addressTest, contact.getAddress()));
	}
	
	@Test
	void updateFirstNameTest() {
		Contact contact = new Contact();
		contact.updateFirstName(firstNameTest);
		assertAll(
				"first name",
				()
					-> assertEquals(firstNameTest, contact.getFirstName),
				()
					-> assertThrows (IllegalArgumentException.class,
				()
					-> contact.updateFirstName(null)),
				()
					-> assertThrows(IllegalArgumentException.class,
				() 
					-> contact.updateFirstName(tooLongFirstName)));
	}
	
	@Test
	void updateLastNameTest() {
		Contact contact = new Contact();
		contact.updateLastName(lastNameTest);
		assertAll(
				"last name",
				()
					-> assertEquals(lastNamelest, contact.getLastName),
				()
					-> assertThrows(IllegalArgumentException.class,
				()
					-> contact.updateLastName(null)),
				()
					-> assertThrows(IllegalArgumentException.class,
				()
					-> contact.updateLastName(tooLongFirstName)));
	}
	
	@Test
	void updatePhoneNumberTest() {
		Contact contact = new Contact();
		contact.updatePhoneNumber (phoneNumberTest);
		assertAll(
				"phone number",
				()
					-> assertEquals(phoneNumberTest, contact.getPhoneNumber),
				()
					-> assertThrows(IllegalArgumentException.class,
				()
					-> contact.updatePhoneNumber(null)),
				()
					-> assertThrows(IllegalArgumentException.class,
				()
					-> contact.updatePhoneNumber(tooLongPhoneNumber)),
				()
					-> assertThrows(IllegalArgumentException.class,
				() 
					-> contact.update.PhoneNumber(tooShortPhoneNumber)),
				()
					-> assertThrows(IllegalArgumentException.class,
				()
					-> contact.updatePhoneNumber(contactId)));
	}
	
	@Test
	void updateAddressTest() {
		Contact contact = new Contact();
		contact.updateAddress(addressTest);
		assertAll(
				"address",
				()
					-> assertEquals(addressTest, contact.getAddress),
				()
					-> assertThrows(IllegalArgumentException.class,
				()
					-> contact.updateAddress(null)),
				()
					-> assertThrowsIllegalArgumentException.class,
				()
					-> contact.updateAddress(tooLongAddress)));			
	}
	
	@Test
	void updateContactIdTest() {
		Contact contact = new Contact();
		contact.updateContactId(contactId);
		assertAll(
				"contact ID",
				()
					-> assertEquals(contactid, contact.getContactId(),
				()
					-> assertThrowsIllegalArgumentException.class,
				()
					-> contact.updateContactId(null)),
				()
					-> assertThrows(IllegalArgumentException.class,
				() 
					-> contact.updateContactId(tooLongContactId)));
		}
}
