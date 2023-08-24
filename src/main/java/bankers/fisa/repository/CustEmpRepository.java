package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.CustEmp;

@Repository
public interface CustEmpRepository extends JpaRepository<CustEmp, String> {

}
