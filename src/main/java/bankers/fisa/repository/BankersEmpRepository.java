package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.BankersEmp;

@Repository
public interface BankersEmpRepository extends JpaRepository<BankersEmp, Long>{

}
