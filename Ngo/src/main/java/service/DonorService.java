package service;
import entities.*;
public interface DonorService {
	boolean registerDonor(Donor d);
	boolean login(Donor d);
	Donation donateToNGO(Donation d);
	void sendThankyouMailToDonator(Donor d);
	String forgotPassword(String s);
	String resetPassword(String s);
	void emailPasswordToDonor(String s);
}
