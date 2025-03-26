package net.javaguides.ems.repository;

import net.javaguides.ems.entity.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {
}
