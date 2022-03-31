package service;
import entities.*;
public interface NeedyPeopleService {
	boolean registerNeedyPerson(NeedyPeople n);
	boolean login(NeedyPeople n);
	boolean requestForHelp(NeedyPeople n);
}
