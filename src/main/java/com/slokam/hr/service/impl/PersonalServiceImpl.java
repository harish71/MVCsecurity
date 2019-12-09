package com.slokam.hr.service.impl;

import com.slokam.hr.entity.Personal;
import com.slokam.hr.repo.PersonalRepo;
import com.slokam.hr.service.PersonalService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonalServiceImpl implements PersonalService {

      
   

	@Autowired
	private PersonalRepo repo;
	
	@Override
	public List<Personal> getAll() {
		return repo.findAll();
	}

	@Override
	public Personal getById(Integer id) {
		
		Optional<Personal> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Personal save(Personal todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Personal todo) {
		repo.delete(todo);
	}

	@Override
	public void deleteByid(Integer id) {
		repo.deleteById(id);
		
	}
}
