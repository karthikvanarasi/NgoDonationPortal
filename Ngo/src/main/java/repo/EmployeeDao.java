package repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.DonationDistribution;
import entities.Employee;
import entities.NeedyPeople;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	int login(Employee e);
	int createNeedyPerson(NeedyPeople n);
	int deleteNeedyPerson(NeedyPeople n);
	NeedyPeople readNeedyPeopleById(int i);
	List<NeedyPeople> readNeedyPeopleByName(String s);
	List<NeedyPeople> readAllNeedyPeople();
	String helpNeedyPerson(DonationDistribution d);

}
