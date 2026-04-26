package Contact;

public class Contact {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		
	    validateContactId(contactId);
	    validateFirstName(firstName);
	    validateLastName(lastName);
	    validatePhoneNumber(phoneNumber);
	    validateAddress(address);

	    this.contactId = contactId;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNumber = phoneNumber;
	    this.address = address;
	    
	  }


	public String getContactId() {

	    return contactId;

	  }



	  public String getFirstName() {

	    return firstName;

	  }



	  public String setFirstName(String firstName) {

	    validateFirstName(firstName);

	    this.firstName = firstName;

	    return this.firstName;

	  }



	  public String getLastName() {

	    return lastName;

	  }



	  public String setLastName(String lastName) {

	    validateLastName(lastName);

	    this.lastName = lastName;

	    return this.lastName;

	  }



	  public String getPhoneNumber() {

	    return phoneNumber;

	  }



	  public String setPhoneNumber(String phoneNumber) {

	    validatePhoneNumber(phoneNumber);

	    this.phoneNumber = phoneNumber;

	    return this.phoneNumber;

	  }



	  public String getAddress() {

	    return address;

	  }



	  public String setAddress(String address) {

	    validateAddress(address);

	    this.address = address;

	    return this.address;

	  }



	  /* Contact must have a unique ID string that is < 11 characters. 

	     The contact ID must not be null/empty or updatable. */

	  private void validateContactId(String contactId) {

	    if (contactId == null || contactId.isEmpty()) {

	      throw new IllegalArgumentException("Contact ID cannot be null/empty");

	    }

	    if (contactId.length() > 10) {

	      throw new IllegalArgumentException("Contact ID cannot be more than 10 characters");

	    }

	  }



	  /* The contact must have a first name field < 11 characters.

	     The first name field cannot be null/empty. */

	  private void validateFirstName(String firstName) {

	    if (firstName == null || firstName.isEmpty()) {

	      throw new IllegalArgumentException("First name cannot be null/empty");

	    }

	    if (firstName.length() > 10) {

	      throw new IllegalArgumentException("First name cannot be more than 10 characters");

	    }

	  }



	  /* The contact must have a last name field < 11 characters.

	     The last name field cannot be null/empty. */

	  private void validateLastName(String lastName) {

	    if (lastName == null || lastName.isEmpty()) {

	      throw new IllegalArgumentException("Last name cannot be null/empty");

	    }

	    if (lastName.length() > 10) {

	      throw new IllegalArgumentException("Last name cannot be more than 10 characters");

	    }

	  }



	  /* The contact must have a phone number field == 10 characters.

	     The phone number field cannot be null/empty. */

	  private void validatePhoneNumber(String phoneNumber) {

	    if (phoneNumber == null || phoneNumber.isEmpty()) {

	      throw new IllegalArgumentException("Phone number cannot be null/empty");

	    }

	    if (!phoneNumber.matches("\\d{10}")) {

	      throw new IllegalArgumentException("Phone number must be 10 digits");

	    }

	  }



	  /* The contact must have a address field < 31 characters.

	     The address field cannot be null/empty. */

	  private void validateAddress(String address) {

	    if (address == null || address.isEmpty()) {

	      throw new IllegalArgumentException("Address cannot be null/empty");

	    }

	    if (address.length() > 30) {

	      throw new IllegalArgumentException("Address cannot be more than 30 characters");

	    }

	  }
}
