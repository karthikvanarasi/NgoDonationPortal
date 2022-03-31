package repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entities.NeedyPeople;

@Repository
public interface NeedyPeopleDao extends JpaRepository<NeedyPeople,Integer>{
	int CreateNeedyPerson(NeedyPeople n);
	boolean readLoginData(NeedyPeople n);
	boolean requestForHelp(NeedyPeople n);

}
