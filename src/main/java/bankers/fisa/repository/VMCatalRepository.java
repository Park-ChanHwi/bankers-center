package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.VMCatal;

@Repository
public interface VMCatalRepository extends JpaRepository<VMCatal, Long> {

}
