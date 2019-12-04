package com.slokam.hr.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.hr.entity.AddType;
				@Repository
				public interface AddTypeRepo extends JpaRepository<AddType, Integer> {

				}
