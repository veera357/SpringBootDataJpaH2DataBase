package in.veera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.veera.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
