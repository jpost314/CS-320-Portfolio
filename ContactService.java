package Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
  private final Map<String, Contact> contacts = new HashMap<>();

  //Add contact if contact ID is unique
  public boolean addContact(Contact contact) {
    if (contact == null || contacts.containsKey(contact.getContactId())) {
      return false;
    }
    contacts.put(contact.getContactId(), contact);
    return true;
  }

  //Delete contact via contact ID
  
  public boolean deleteContact(String contactId) {
    return contacts.remove(contactId) != null;
  }

  //Revise first name
  
  public boolean updateFirstName(String contactId, String firstName) {
    Contact contact = contacts.get(contactId);
    if (contact != null) {
      contact.setFirstName(firstName);
      return true;
    }
    return false;
  }

  //Revise last name
  
  public boolean updateLastName(String contactId, String lastName) {
    Contact contact = contacts.get(contactId);
    if (contact != null) {
      contact.setLastName(lastName);
      return true;
    }
    return false;
  }

  //Revise phone number
  
  public boolean updatePhoneNumber(String contactId, String phoneNumber) {
    Contact contact = contacts.get(contactId);
    if (contact != null) {
      contact.setPhoneNumber(phoneNumber);
      return true;
    }
    return false;
  }

  //Revise address
  
  public boolean updateAddress(String contactId, String address) {
    Contact contact = contacts.get(contactId);
    if (contact != null) {
      contact.setAddress(address);
      return true;
    }
    return false;
  }

  //Get contact via contact ID
  
  public Contact getContact(String contactId) {
    return contacts.get(contactId);
  }
}