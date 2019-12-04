package com.slokam.hr.service;

import com.slokam.hr.entity.MaritalStatus;
import com.slokam.hr.repo.MaritalStatusRepo;

import java.util.*;

public interface MaritalStatusService {
	
	public List<MaritalStatus> getAll();
	public MaritalStatus getById(Integer id);
	public MaritalStatus save(MaritalStatus MaritalStatus);
	public void remove(MaritalStatus MaritalStatus);

}
