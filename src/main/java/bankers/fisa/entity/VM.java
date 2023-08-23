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
	private String vm_address;
	private String vm_state;
	private int cust_emp_number;
	@Override
	public String toString() {
		return vmckey.toString() + "_" + vm_name + "_" + vm_catal_type + "_" + vm_address + "_" + vm_state + "_" + cust_emp_number;
	}
	
	
}
