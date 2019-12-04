package com.slokam.hr.service;

import com.slokam.hr.entity.Gender;
import com.slokam.hr.repo.GenderRepo;

import java.util.*;

public interface GenderService {
	
	public List<Gender> getAll();
	public Gender getById(Integer id);
	public Gender save(Gender Gender);
	public void remove(Gender Gender);

}
