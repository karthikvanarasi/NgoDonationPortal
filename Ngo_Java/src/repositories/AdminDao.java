package repositories;
import entities.*;
import java.util.List;
public interface AdminDao {
	int CreateEmployee(Employee e);
	Employee updateEmployee(Employee e);
	int deleteEmployee(int i);
	Employee readEmployeeById(int i);
	List<Employee> readEmployeeByName(String s);
	List<Employee> readAllEmployees();
	boolean approveDonation(DonationDistribution d);
}
