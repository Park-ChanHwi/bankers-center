package bankers.fisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankers.fisa.entity.VM;
import bankers.fisa.entity.ckey.VMckey;

@Repository
public interface VMRepository extends JpaRepository<VM, VMckey>{

}
