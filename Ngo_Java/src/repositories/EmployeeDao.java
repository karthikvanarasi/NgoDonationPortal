package repositories;
import entities.*;
import java.util.List;
public interface EmployeeDao {
	int login(Employee e);
	int createNeedyPerson(NeedyPeople n);
	int deleteNeedyPerson(NeedyPeople n);
	NeedyPeople readNeedyPeopleById(int i);
	List<NeedyPeople> readNeedyPeopleByName(String s);
	List<NeedyPeople> readAllNeedyPeople();
	String helpNeedyPerson(DonationDistribution d);
}
