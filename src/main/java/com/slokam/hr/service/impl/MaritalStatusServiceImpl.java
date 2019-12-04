package com.slokam.hr.service.impl;

import com.slokam.hr.entity.MaritalStatus;
import com.slokam.hr.repo.MaritalStatusRepo;
import com.slokam.hr.service.MaritalStatusService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {

      
   

	@Autowired
	private MaritalStatusRepo repo;
	
	@Override
	public List<MaritalStatus> getAll() {
		return repo.findAll();
	}

	@Override
	public MaritalStatus getById(Integer id) {
		
		Optional<MaritalStatus> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public MaritalStatus save(MaritalStatus todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(MaritalStatus todo) {
		repo.delete(todo);
	}
}
