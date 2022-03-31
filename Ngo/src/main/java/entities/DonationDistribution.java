package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tbl_DonationDistribution")

public class DonationDistribution {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int distributionId;
	@Column(name="amount_distributed", length=20)
	private double amountDistributed;
	@Column(name="date_of_distribution", length=20)
	private LocalDate dateOfDistribution;
	@Column(name="approval_Or_RejectedDate", length=20)
	private LocalDate approvalOrRejectedDate;
	@Column(name="status_name", length=20)
	private String status;
	
	@OneToOne
	@JoinColumn(name="NeedyPersonId" , referencedColumnName="NeedyPersonId")
	private NeedyPeople needyPeople;
	@OneToOne
	@JoinColumn(name="EmployeeId" , referencedColumnName="EmployeeId")
	private Employee employee;
	@OneToOne
	@JoinColumn(name="DonationId" , referencedColumnName="DonationId")
	private DonationItem donationItem;
}
