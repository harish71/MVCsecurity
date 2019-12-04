package com.slokam.hr.service.impl;

import com.slokam.hr.entity.AddressDetails;
import com.slokam.hr.repo.AddressDetailsRepo;
import com.slokam.hr.service.AddressDetailsService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AddressDetailsServiceImpl implements AddressDetailsService {

      
   

	@Autowired
	private AddressDetailsRepo repo;
	
	@Override
	public List<AddressDetails> getAll() {
		return repo.findAll();
	}

	@Override
	public AddressDetails getById(Integer id) {
		
		Optional<AddressDetails> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public AddressDetails save(AddressDetails todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(AddressDetails todo) {
		repo.delete(todo);
	}
}
