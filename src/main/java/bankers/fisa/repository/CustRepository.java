package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.Cust;

@Repository
public interface CustRepository extends JpaRepository<Cust, Long> {

}
