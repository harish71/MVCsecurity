package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Gender;
				@Repository
				public interface GenderRepo extends JpaRepository<Gender, Integer> {

				}
