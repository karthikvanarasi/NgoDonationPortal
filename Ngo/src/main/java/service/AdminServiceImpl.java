package service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


import entities.DonationDistribution;
import entities.Employee;
import repo.AdminDao;

public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao repo;

	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Employee modifyEmployee(Employee e) {
		Employee emp=null;
		return emp;
	}
	
	@Transactional
	public boolean removeEmployee(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Employee findEmployeeById(int i) {
		Employee emp=null;
		emp=repo.findEmployeeById(i);
		return emp;
	}

	@Transactional
	public List<Employee> findEmployeeByName(String s) {
		List<Employee> emp=repo.readEmployeeByName(s);
		return emp;
	}

	@Transactional
	public List<Employee> findAllEmployee() {
		List<Employee> emp=repo.readAllEmployees();
		return emp;
	}

	@Transactional
	public Boolean approveDonation(DonationDistribution d) {
		// TODO Auto-generated method stub
		return null;
	}

}
