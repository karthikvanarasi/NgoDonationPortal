package entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="tbl_Address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	@Column(name="city_name", length=20)
	private String city;
	@Column(name="state_name", length=20)
	private String state;
	@Column(name="pin_num")
	private String pin;
	@Column(name="landmark_name", length=20)
	private String landmark;
	
	
}

