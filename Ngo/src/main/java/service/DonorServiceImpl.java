package service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import entities.Donation;
import entities.Donor;
import repo.DonorDao;

public class DonorServiceImpl implements DonorService {
	@Autowired
	DonorDao repo;

	@Transactional
	public boolean registerDonor(Donor d) {
		
		return false;
	}
	@Transactional
	public boolean login(Donor d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Donation donateToNGO(Donation d) {
		Donation don=null;
		don=repo.donateToNGO(don);
		return don;
	}

	@Transactional
	public void sendThankyouMailToDonator(Donor d) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public String forgotPassword(String s) {
		String str=null;
		str=repo.forgotPassword(str);
		return str;
	}

	@Transactional
	public String resetPassword(String s) {
		String str=null;
		str=repo.resetPassword(str);
		return str;
	}

	@Transactional
	public void emailPasswordToDonor(String s) {
		// TODO Auto-generated method stub

	}

}
