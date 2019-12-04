package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.ContactDetails;
				@Repository
				public interface ContactDetailsRepo extends JpaRepository<ContactDetails, Integer> {

				}
