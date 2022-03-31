package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name="tbl_DonationItem")

public class DonationItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	@Column(name="item_name", length=20)
	private String itemDescription;
	DonationType donationType;
	
	@Enumerated(EnumType.STRING)
	private DonationType type;
	
}