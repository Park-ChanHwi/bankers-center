package bankers.fisa.entity.ckey;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@SuppressWarnings("serial")
public class VMckey implements Serializable{
	private int vm_number;
	private String vm_create_date;
}
