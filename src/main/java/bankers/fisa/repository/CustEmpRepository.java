package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.CustEmp;

@Repository
public interface CustEmpRepository extends JpaRepository<CustEmp, String> {
	@Query(value = "SELECT * FROM cust_emp WHERE cust_emp_number=?", nativeQuery = true)
	CustEmp findbyCustEmpNumber(int cust_emp_number);
}
