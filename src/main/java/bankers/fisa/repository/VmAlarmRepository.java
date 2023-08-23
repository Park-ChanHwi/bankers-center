package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.VmAlarm;

@Repository
public interface VmAlarmRepository extends JpaRepository <VmAlarm, Long> {
}
