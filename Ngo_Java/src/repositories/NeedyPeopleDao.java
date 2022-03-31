package repositories;
import entities.*;
public interface NeedyPeopleDao {
	int CreateNeedyPerson(NeedyPeople n);
	boolean readLoginData(NeedyPeople n);
	boolean requestForHelp(NeedyPeople n);
}
