package com.slokam.hr.service;

import com.slokam.hr.entity.Religion;
import com.slokam.hr.repo.ReligionRepo;

import java.util.*;

public interface ReligionService {
	
	public List<Religion> getAll();
	public Religion getById(Integer id);
	public Religion save(Religion Religion);
	public void remove(Religion Religion);

}
