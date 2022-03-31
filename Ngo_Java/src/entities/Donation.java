package entities;
import java.time.LocalDate;
public class Donation {
	private int donationId;
	private double donationAmount;
	private LocalDate donationDate;
	private DonationItem item;
	private Donor donor;
	public Donation(int donationId, double donationAmount, LocalDate donationDate, DonationItem item, Donor donor) {
		this.donationId = donationId;
		this.donationAmount = donationAmount;
		this.donationDate = donationDate;
		this.item = item;
		this.donor = donor;
	}
	public int getDonationId() {
		return donationId;
	}
	public void setDonationId(int donationId) {
		this.donationId = donationId;
	}
	public double getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(double donationAmount) {
		this.donationAmount = donationAmount;
	}
	public LocalDate getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(LocalDate donationDate) {
		this.donationDate = donationDate;
	}
	public DonationItem getItem() {
		return item;
	}
	public void setItem(DonationItem item) {
		this.item = item;
	}
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	@Override
	public String toString() {
		return "Donation [donationId=" + donationId + ", donationAmount=" + donationAmount + ", donationDate="
				+ donationDate + ", item=" + item + ", donor=" + donor + "]";
	}
}
