package com.slokam.hr.service;

import com.slokam.hr.entity.City;
import com.slokam.hr.repo.CityRepo;

import java.util.*;

public interface CityService {
	
	public List<City> getAll();
	public City getById(Integer id);
	public City save(City City);
	public void remove(City City);

}
