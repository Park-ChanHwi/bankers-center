package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.VMAlarm;

@Repository
public interface VMAlarmRepository extends JpaRepository <VMAlarm, Long> {
}
