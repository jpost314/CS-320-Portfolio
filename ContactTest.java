package Contact;

import junit.framework.TestCase;

import main.Contact;

public class ContactTest extends TestCase {

	@Test
	  void testValidContact() {
	    Contact contact = new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    assertEquals("BAT404", contact.getContactId());
	    assertEquals("Bruce", contact.getFirstName());
	    assertEquals("Wayne", contact.getLastName());
	    assertEquals("1008675309", contact.getPhoneNumber());
	    assertEquals("27 Gotham Drive", contact.getAddress());
	  }

	  //ID testing
	
	  @Test
	  void testContactIdNull() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact(null, "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Must use a valid ID"));
	  }

	  @Test
	  void testContactIdEmpty() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Must use a valid ID"));
	  }

	  @Test
	  void testContactIdTooLong() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT4048675309", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Contact ID cannot exceed 10 characters"));
	  }

	  //First name testing
	  
	  @Test
	  void testFirstNameNull() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", null, "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("First name cannot be null/empty"));
	  }

	  @Test
	  void testFirstNameEmpty() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "", "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("First name cannot be null/empty"));
	  }

	  @Test
	  void testFirstNameTooLong() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Brucelington", "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("First name cannot exceed 10 characters"));
	  }

	  //Last name testing
	  
	  @Test
	  void testLastNameNull() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", null, "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Last name cannot be null/empty"));
	  }

	  @Test
	  void testLastNameEmpty() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Last name cannot be null/empty"));
	  }

	  @Test
	  void testLastNameTooLong() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Waynesonwaynesmith", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Last name cannot be more than 10 characters"));
	  }

	  //Phone number testing
	  
	  @Test
	  void testPhoneNumberNull() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", null, "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Phone number cannot be null/empty"));
	  }

	  @Test
	  void testPhoneNumberEmpty() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Phone number cannot be null/empty"));
	  }

	  @Test
	  void testPhoneNumberTooShort() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Phone number must be 10 digits"));
	  }

	  @Test
	  void testPhoneNumberTooLong() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "10086753091", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Phone number must be 10 digits"));
	  }

	  @Test
	  void testPhoneNumberNonDigits() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "100867530", "27 Gotham Drive");
	    });
	    assertTrue(exception.getMessage().contains("Phone number must be 10 digits"));
	  }

	  //Address testing
	  
	  @Test
	  void testAddressNull() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "1008675309", null);
	    });
	    assertTrue(exception.getMessage().contains("Address cannot be null/empty"));
	  }

	  @Test
	  void testAddressEmpty() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "1008675309", "");
	    });
	    assertTrue(exception.getMessage().contains("Address cannot be null/empty"));
	  }

	  @Test
	  void testAddressTooLong() {
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	      new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Wayne Manor Gotham Harbor Arkham Hospital Drive");
	    });
	    assertTrue(exception.getMessage().contains("Address cannot be more than 30 characters"));
	  }

	  //Setter testing
	  
	  @Test
	  void testSetFirstName() {
	    Contact contact = new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    contact.setFirstName("Thomas");
	    assertEquals("Thomas", contact.getFirstName());
	  }

	  @Test
	  void testSetLastName() {
	    Contact contact = new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    contact.setLastName("Elliot");
	    assertEquals("Elliot", contact.getLastName());
	  }

	  @Test
	  void testSetPhoneNumber() {
	    Contact contact = new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    contact.setPhoneNumber("8675309027");
	    assertEquals("8675309027", contact.getPhoneNumber());
	  }

	  @Test
	  void testSetAddress() {
	    Contact contact = new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");
	    contact.setAddress("15 Arkham Way");
	    assertEquals("15 Arkham Way", contact.getAddress());
	  }

	  @Test
	  void testInvalidSetters() {
	    Contact contact = new Contact("BAT404", "Bruce", "Wayne", "1008675309", "27 Gotham Drive");

	    Exception firstNameException = assertThrows(IllegalArgumentException.class, () -> {
	      contact.setFirstName(null);
	    });
	    assertTrue(firstNameException.getMessage().contains("First name cannot be null/empty"));

	    Exception lastNameException = assertThrows(IllegalArgumentException.class, () -> {
	      contact.setLastName(null);
	    });
	    assertTrue(lastNameException.getMessage().contains("Last name cannot be null/empty"));

	    Exception phoneException = assertThrows(IllegalArgumentException.class, () -> {
	      contact.setPhoneNumber("onetwofour");
	    });
	    assertTrue(phoneException.getMessage().contains("Phone number must be 10 digits"));

	    Exception addressException = assertThrows(IllegalArgumentException.class, () -> {
	      contact.setAddress(null);
	    });
	    assertTrue(addressException.getMessage().contains("Address cannot be null/empty"));
	  }
}
