package com.slokam.hr.service.impl;

import com.slokam.hr.entity.ContactDetails;
import com.slokam.hr.repo.ContactDetailsRepo;
import com.slokam.hr.service.ContactDetailsService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ContactDetailsServiceImpl implements ContactDetailsService {

      
   

	@Autowired
	private ContactDetailsRepo repo;
	
	@Override
	public List<ContactDetails> getAll() {
		return repo.findAll();
	}

	@Override
	public ContactDetails getById(Integer id) {
		
		Optional<ContactDetails> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public ContactDetails save(ContactDetails todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(ContactDetails todo) {
		repo.delete(todo);
	}
}
