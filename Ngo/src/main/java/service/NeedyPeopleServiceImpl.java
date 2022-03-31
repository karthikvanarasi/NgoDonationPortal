package service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import entities.NeedyPeople;
import repo.NeedyPeopleDao;

public class NeedyPeopleServiceImpl implements NeedyPeopleService {
	@Autowired
	NeedyPeopleDao repo;

	@Transactional
	public boolean registerNeedyPerson(NeedyPeople n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean login(NeedyPeople n) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean requestForHelp(NeedyPeople n) {
		// TODO Auto-generated method stub
		return false;
	}

}
