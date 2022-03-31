package service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import entities.DonationDistribution;
import entities.Employee;
import entities.NeedyPeople;
import repo.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao repo;
	
	@Transactional
	public boolean login(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean addNeedyPerson(NeedyPeople n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean removeNeedyPerson(NeedyPeople n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public NeedyPeople findNeedyPeopleById(int i) {
		NeedyPeople need=null;
		need=repo.readNeedyPeopleById(i);
		return need;
	}

	@Transactional
	public List<NeedyPeople> findNeedyPeopleByName(String s) {
		List<NeedyPeople> need=repo.readNeedyPeopleByName(s);
		return need;
	}

	@Transactional
	public List<NeedyPeople> findAllNeedyPeople() {
		List<NeedyPeople> need=repo.readAllNeedyPeople();
		return need;
	}

	@Transactional
	public String helpNeedyPerson(DonationDistribution d) {
		String str=null;
		str=repo.helpNeedyPerson(d);
		return str;
	}

}

