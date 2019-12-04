package com.slokam.hr.service.impl;

import com.slokam.hr.entity.State;
import com.slokam.hr.repo.StateRepo;
import com.slokam.hr.service.StateService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StateServiceImpl implements StateService {

      
   

	@Autowired
	private StateRepo repo;
	
	@Override
	public List<State> getAll() {
		return repo.findAll();
	}

	@Override
	public State getById(Integer id) {
		
		Optional<State> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public State save(State todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(State todo) {
		repo.delete(todo);
	}
}
