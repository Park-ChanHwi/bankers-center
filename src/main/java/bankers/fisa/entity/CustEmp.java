package bankers.fisa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cust_emp")
public class CustEmp {
	@Id
	private int cust_emp_number;
<<<<<<< HEAD
=======
	private int cust_number;
	private String cust_email;
	private String cust_id;
	private String cust_pw;
	private String cust_pos;
>>>>>>> f84e1b2e99c7b5e05179248babf3bf8177ded518
	
	

}
