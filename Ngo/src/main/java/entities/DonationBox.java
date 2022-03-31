package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="tbl_DonationBox")
       
public class DonationBox {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String ngoName;
	 @Column(name="registration_number", length=20)
     private String registrationNumber;
     @Column(name="account_number", length=20)
     private String accountNumber;
     @Column(name="total_collection", length=20)
     private double totalCollection;

	
}