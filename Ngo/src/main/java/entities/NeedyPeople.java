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
@Table(name="tbl_NeedyPeople")

public class NeedyPeople {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int needyPersonId;
	@Column(name="person_name", length=20)
	private String needyPersonName;
	@Column(name="phone_num", length=20)
	private String phone;
	@Column(name="family_income", length=20)
	private double familyIncome;
	@Column(name="address_name", length=20)
	@OneToOne
	@JoinColumn(name="AddressId" , referencedColumnName="AddressId")
	private Address address;
	
	
}