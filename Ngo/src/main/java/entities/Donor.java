package entities;

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
@Table(name="tbl_Donor")

public class Donor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int donorId;
	@Column(name="donor_name", length=20)
	private String donorName;
	@Column(name="donor_email", length=20)
	private String donorEmail;
	@Column(name="donor_phone", length=20)
	private String donorPhone;
	@Column(name="donor_username", length=20)
	private String donorUsername;
	@Column(name="donor_password", length=20)
	private String donorPassword;
	@Column(name="address_name", length=20)
	@OneToOne
	@JoinColumn(name="AddressId" , referencedColumnName="AddressId")
	private Address address;
}

