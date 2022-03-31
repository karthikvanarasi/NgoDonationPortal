package service;
import entities.*;
import java.util.List;
public interface AdminService {
	boolean addEmployee(Employee e);
	Employee modifyEmployee(Employee e);
	boolean removeEmployee(int i);
	Employee findEmployeeById(int i);
	List<Employee> findEmployeeByName(String s);
	List<Employee> findAllEmployee();
	Boolean approveDonation(DonationDistribution d);
}

