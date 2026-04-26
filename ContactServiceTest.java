package Contact;

import junit.framework.TestCase;

import main.Contact;
import main.ContactService;


public class ContactServiceTest {
	  private ContactService service;
	  private Contact contact;

	  @BeforeEach
	  void setUp() {
	    service = new ContactService();
	    contact = new Contact("10001", "Bruce", "Wayne", "2051234567", "456 Magnolia Terrace");
	  }

	  @Test
	  void testAddContactSuccess() {
	    assertTrue(service.addContact(contact));
	  }

	  @Test
	  void testAddContactDuplicateId() {
	    service.addContact(contact);
	    Contact duplicate = new Contact("10001", "Clark", "Kent", "1238675309", "789 Mountain Drive");
	    assertFalse(service.addContact(duplicate));
	  }

	  @Test
	  void testDeleteContactSuccess() {
	    service.addContact(contact);
	    assertTrue(service.deleteContact("10001"));
	  }

	  @Test
	  void testDeleteContactNotFound() {
	    assertFalse(service.deleteContact("99999"));
	  }

	  @Test
	  void testUpdateFirstNameSuccess() {
	    service.addContact(contact);
	    assertTrue(service.updateFirstName("10001", "Clark"));
	    assertEquals("Clark", service.getContact("10001").getFirstName());
	  }

	  @Test
	  void testUpdateFirstNameNotFound() {
	    assertFalse(service.updateFirstName("99999", "Clark"));
	  }

	  @Test
	  void testUpdateLastNameSuccess() {
	    service.addContact(contact);
	    assertTrue(service.updateLastName("10001", "Kent"));
	    assertEquals("Kent", service.getContact("10001").getLastName());
	  }

	  @Test
	  void testUpdatePhoneNumberSuccess() {
	    service.addContact(contact);
	    assertTrue(service.updatePhoneNumber("10001", "1238675309"));
	    assertEquals("1238675309", service.getContact("10001").getPhoneNumber());
	  }

	  @Test
	  void testUpdateAddressSuccess() {
	    service.addContact(contact);
	    assertTrue(service.updateAddress("10001", "789 Mountain Drive"));
	    assertEquals("789 Mountain Drive", service.getContact("10001").getAddress());
	  }

	  @Test
	  void testUpdateFieldNotFound() {
	    assertFalse(service.updateLastName("99999", "Kent"));
	    assertFalse(service.updatePhoneNumber("99999", "1231234567"));
	    assertFalse(service.updateAddress("99999", "102 Maple Circle"));
	  }
	}