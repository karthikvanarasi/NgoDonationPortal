package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Admin;
import entities.DonationDistribution;
import entities.Employee;

@Repository
public interface AdminDao extends JpaRepository <Admin,Integer>{
	int CreateEmployee(Employee e);
	Employee updateEmployee(Employee e);
	int deleteEmployee(int i);
	Employee findEmployeeById(int i);
	List<Employee> readEmployeeByName(String s);
	List<Employee> readAllEmployees();
	boolean approveDonation(DonationDistribution d);
	
	
}

