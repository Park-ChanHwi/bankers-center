package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.VmCatal;

@Repository
public interface VmCatalRepository extends JpaRepository<VmCatal, Long> {

}
