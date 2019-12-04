package com.slokam.hr.service;

import com.slokam.hr.entity.ContactDetails;
import com.slokam.hr.repo.ContactDetailsRepo;

import java.util.*;

public interface ContactDetailsService {
	
	public List<ContactDetails> getAll();
	public ContactDetails getById(Integer id);
	public ContactDetails save(ContactDetails ContactDetails);
	public void remove(ContactDetails ContactDetails);

}
