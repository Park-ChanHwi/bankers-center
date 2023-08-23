package bankers.fisa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vm_catal")
public class VMCatal {
    @Id
    private int catal_number;

    private String vm_type;
    private String vm_cpu;
    private  String vm_ram;
    private String vm_storage;
}
