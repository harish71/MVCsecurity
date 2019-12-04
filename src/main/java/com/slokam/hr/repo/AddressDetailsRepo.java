package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.AddressDetails;
				@Repository
				public interface AddressDetailsRepo extends JpaRepository<AddressDetails, Integer> {

				}
