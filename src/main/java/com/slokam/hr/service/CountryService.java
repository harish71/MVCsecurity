package com.slokam.hr.service;

import com.slokam.hr.entity.Country;
import com.slokam.hr.repo.CountryRepo;

import java.util.*;

public interface CountryService {
	
	public List<Country> getAll();
	public Country getById(Integer id);
	public Country save(Country Country);
	public void remove(Country Country);

}
