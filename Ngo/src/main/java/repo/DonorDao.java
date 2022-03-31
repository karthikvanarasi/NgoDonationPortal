package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Donation;
import entities.Donor;

@Repository
public interface DonorDao extends JpaRepository<Donor,Integer>{
	int CreateDonor(Donor d);
	int login(Donor d);
	Donation donateToNGO(Donation d);
	String forgotPassword(String s);
	String resetPassword(String s);
}

