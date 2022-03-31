package repositories;
import entities.*;
public interface DonorDao {
	int CreateDonor(Donor d);
	int login(Donor d);
	Donation donateToNGO(Donation d);
	String forgotPassword(String s);
	String resetPassword(String s);
}
