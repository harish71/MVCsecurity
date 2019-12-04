package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.MaritalStatus;
				@Repository
				public interface MaritalStatusRepo extends JpaRepository<MaritalStatus, Integer> {

				}
