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
@Table(name="tbl_Employee")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	@Column(name="employee_name", length=20)
	private String employeeName;
	@Column(name="email", length=20)
	private String email;
	@Column(name="phone", length=20)
	private String phone;
	@Column(name="user_name", length=20)
	private String username;
	@Column(name="password", length=20)
	private String password;
	@Column(name="address_name", length=20)
	@OneToOne
	@JoinColumn(name="AddressId" , referencedColumnName="AddressId")
	private Address address;
}

