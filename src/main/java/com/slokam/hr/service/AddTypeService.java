package com.slokam.hr.service;

import com.slokam.hr.entity.AddType;
import com.slokam.hr.repo.AddTypeRepo;

import java.util.*;

public interface AddTypeService {
	
	public List<AddType> getAll();
	public AddType getById(Integer id);
	public AddType save(AddType AddType);
	public void remove(AddType AddType);

}
