package com.slokam.hr.service;

import com.slokam.hr.entity.Personal;
import com.slokam.hr.repo.PersonalRepo;

import java.util.*;

public interface PersonalService {
	
	public List<Personal> getAll();
	public Personal getById(Integer id);
	public Personal save(Personal Personal);
	public void remove(Personal Personal);
	public void deleteByid(Integer id);
	

}
