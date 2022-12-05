package com.trax.services;

import java.util.List;
import com.trax.entities.Contact;

public interface ContactService {
	
		public void saveContact(Contact contact);	//Supply the contact object to this 

		public List<Contact> getAllContacts();

		public Contact findContactById(long id);
}
