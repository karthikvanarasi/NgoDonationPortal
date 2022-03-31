package entities;
import java.time.LocalDate;
public class DonationDistribution {
	private int distributionId;
	private double amountDistributed;
	private LocalDate dateOfDistribution;
	private LocalDate approvalOrRejectedDate;
	private String status;
	private NeedyPeople needyPeople;
	private Employee employee;
	private DonationItem donationItem;
	public DonationDistribution(int distributionId, double amountDistributed, LocalDate dateOfDistribution,
			LocalDate approvalOrRejectedDate, String status, NeedyPeople needyPeople, Employee employee,
			DonationItem donationItem) {
		this.distributionId = distributionId;
		this.amountDistributed = amountDistributed;
		this.dateOfDistribution = dateOfDistribution;
		this.approvalOrRejectedDate = approvalOrRejectedDate;
		this.status = status;
		this.needyPeople = needyPeople;
		this.employee = employee;
		this.donationItem = donationItem;
	}
	public int getDistributionId() {
		return distributionId;
	}
	public void setDistributionId(int distributionId) {
		this.distributionId = distributionId;
	}
	public double getAmountDistributed() {
		return amountDistributed;
	}
	public void setAmountDistributed(double amountDistributed) {
		this.amountDistributed = amountDistributed;
	}
	public LocalDate getDateOfDistribution() {
		return dateOfDistribution;
	}
	public void setDateOfDistribution(LocalDate dateOfDistribution) {
		this.dateOfDistribution = dateOfDistribution;
	}
	public LocalDate getApprovalOrRejectedDate() {
		return approvalOrRejectedDate;
	}
	public void setApprovalOrRejectedDate(LocalDate approvalOrRejectedDate) {
		this.approvalOrRejectedDate = approvalOrRejectedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public NeedyPeople getNeedyPeople() {
		return needyPeople;
	}
	public void setNeedyPeople(NeedyPeople needyPeople) {
		this.needyPeople = needyPeople;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public DonationItem getDonationItem() {
		return donationItem;
	}
	public void setDonationItem(DonationItem donationItem) {
		this.donationItem = donationItem;
	}
	@Override
	public String toString() {
		return "DonationDistribution [distributionId=" + distributionId + ", amountDistributed=" + amountDistributed
				+ ", dateOfDistribution=" + dateOfDistribution + ", approvalOrRejectedDate=" + approvalOrRejectedDate
				+ ", status=" + status + ", needyPeople=" + needyPeople + ", employee=" + employee + ", donationItem="
				+ donationItem + "]";
	}
}

