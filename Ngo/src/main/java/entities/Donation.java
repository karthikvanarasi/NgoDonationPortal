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
@Table(name="tbl_Donation")

public class Donation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int donationId;
	@Column(name="donation_amount", length=30)
	private double donationAmount;
	@Column(name="donation_date", length=20)
	private LocalDate donationDate;
	@OneToOne
	@JoinColumn(name="ItemId" , referencedColumnName="ItemId")
	private DonationItem item;
	@OneToOne
	@JoinColumn(name="DonorId" , referencedColumnName="DonorId")
	private Donor donor;
}
