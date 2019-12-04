package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.Country;
				@Repository
				public interface CountryRepo extends JpaRepository<Country, Integer> {

				}
