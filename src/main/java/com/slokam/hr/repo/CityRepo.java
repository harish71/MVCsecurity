package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.City;
				@Repository
				public interface CityRepo extends JpaRepository<City, Integer> {

				}
