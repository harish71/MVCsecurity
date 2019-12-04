package com.slokam.hr.service.impl;

import com.slokam.hr.entity.City;
import com.slokam.hr.repo.CityRepo;
import com.slokam.hr.service.CityService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CityServiceImpl implements CityService {

      
   

	@Autowired
	private CityRepo repo;
	
	@Override
	public List<City> getAll() {
		return repo.findAll();
	}

	@Override
	public City getById(Integer id) {
		
		Optional<City> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public City save(City todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(City todo) {
		repo.delete(todo);
	}
}
