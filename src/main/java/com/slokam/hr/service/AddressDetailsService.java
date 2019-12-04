package com.slokam.hr.service;

import com.slokam.hr.entity.AddressDetails;
import com.slokam.hr.repo.AddressDetailsRepo;

import java.util.*;

public interface AddressDetailsService {
	
	public List<AddressDetails> getAll();
	public AddressDetails getById(Integer id);
	public AddressDetails save(AddressDetails AddressDetails);
	public void remove(AddressDetails AddressDetails);

}
