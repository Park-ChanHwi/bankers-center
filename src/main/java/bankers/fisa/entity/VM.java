package bankers.fisa.entity;

import bankers.fisa.entity.ckey.VMckey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "VM")
public class VM {
	@EmbeddedId
	private VMckey vmckey;
	
	private String vm_name;
	private String vm_catal_type;
	private String vm_state;
	private int cust_emp_number;
}
