package com.slokam.hr.service.impl;

import com.slokam.hr.entity.AddType;
import com.slokam.hr.repo.AddTypeRepo;
import com.slokam.hr.service.AddTypeService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AddTypeServiceImpl implements AddTypeService {

      
   

	@Autowired
	private AddTypeRepo repo;
	
	@Override
	public List<AddType> getAll() {
		return repo.findAll();
	}

	@Override
	public AddType getById(Integer id) {
		
		Optional<AddType> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public AddType save(AddType todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(AddType todo) {
		repo.delete(todo);
	}
}
