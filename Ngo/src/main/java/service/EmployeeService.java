package service;
import entities.*;
import java.util.List;
public interface EmployeeService {
	boolean login(Employee e);
	boolean addNeedyPerson(NeedyPeople n);
	boolean removeNeedyPerson(NeedyPeople n);
	NeedyPeople findNeedyPeopleById(int i);
	List<NeedyPeople> findNeedyPeopleByName(String s);
	List<NeedyPeople> findAllNeedyPeople();
	String helpNeedyPerson(DonationDistribution d);
}
