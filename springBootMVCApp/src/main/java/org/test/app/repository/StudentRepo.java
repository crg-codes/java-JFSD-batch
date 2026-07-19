package org.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.app.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

	
	
}
