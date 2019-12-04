package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Religion;
				@Repository
				public interface ReligionRepo extends JpaRepository<Religion, Integer> {

				}
