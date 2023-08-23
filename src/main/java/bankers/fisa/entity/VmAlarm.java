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
@Entity(name = "vm_alarm")
public class VMAlarm {
    @Id
    private int alarm_number;

    private int vm_number;
    private int cpu1;
    private int cpu2;
    private int ram1;
    private int ram2;
    private int storage1;
    private int storage2;
}
