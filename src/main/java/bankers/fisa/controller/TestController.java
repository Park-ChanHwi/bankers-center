package bankers.fisa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.BankersEmp;
import bankers.fisa.entity.Cust;
import bankers.fisa.entity.EmpRevenue;
import bankers.fisa.repository.BankersEmpRepository;
import bankers.fisa.repository.CustRepository;
import bankers.fisa.repository.EmpRevenueRepository;

@RestController
@RequestMapping("/center-test")
public class TestController {
<<<<<<< HEAD
	
	@GetMapping("/test")
	public String test() {	
        return "Center Tesst111";
=======

	@Autowired
	private final BankersEmpRepository bankersEmpRepository = null;
	@Autowired
	private final EmpRevenueRepository empRevenueRepository = null;
	@Autowired
	private final CustRepository custRepository = null;
	
	@GetMapping("/bankersemp")
	public String getBankersEmp() {
		
		BankersEmp bankersEmp = bankersEmpRepository.findById((long) 1).get();
		System.out.println(bankersEmp.toString());
		return bankersEmp.toString();
	}
	
	@GetMapping("/emprevenue")
	public String getEmpRevenue() {
		
		EmpRevenue empRevenue = empRevenueRepository.findById((long) 1).get();
		System.out.println(empRevenue.toString());
		return empRevenue.toString();		
	}
	
	
	@GetMapping("/cust")
	public String getCust() {
		
		Cust cust = custRepository.findById((long) 1).get();
		System.out.println(cust.toString());
		return cust.toString();
	}
	
	@GetMapping("/vmlist")
	public String vmlist() {
		
		ArrayList<BankersEmp> bankersEmp = 
				(ArrayList<BankersEmp>)bankersEmpRepository.findAll();
		
		System.out.println(bankersEmp.toString());
		return bankersEmp.toString();
>>>>>>> 13d81d62335b05930665eaf8278c3f28fd6433db
	}

}
