package com.slokam.hr.service;

import com.slokam.hr.entity.State;
import com.slokam.hr.repo.StateRepo;

import java.util.*;

public interface StateService {
	
	public List<State> getAll();
	public State getById(Integer id);
	public State save(State State);
	public void remove(State State);

}
