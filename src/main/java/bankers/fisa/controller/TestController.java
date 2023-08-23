package bankers.fisa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.BankersEmp;
import bankers.fisa.entity.CreditAlarm;
import bankers.fisa.entity.Cust;
import bankers.fisa.entity.CustEmp;
import bankers.fisa.entity.EmpRevenue;
import bankers.fisa.repository.BankersEmpRepository;
import bankers.fisa.repository.CreditAlarmRepository;
import bankers.fisa.repository.CustEmpRepository;
import bankers.fisa.repository.CustRepository;
import bankers.fisa.repository.EmpRevenueRepository;

@RestController
@RequestMapping("/center-test")
public class TestController {

	@Autowired
	private final BankersEmpRepository bankersEmpRepository = null;
	@Autowired
	private final EmpRevenueRepository empRevenueRepository = null;
	@Autowired
	private final CustRepository custRepository = null;
	@Autowired
	private final CustEmpRepository custEmpRepository = null;
	@Autowired
	private final CreditAlarmRepository creditAlarmRepository = null;
	
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
	
	@GetMapping("/custemp")
	public String getCustEmp() {
		
		CustEmp custEmp = custEmpRepository.findById((long) 1).get();
		System.out.println(custEmp.toString());
		return custEmp.toString();
	}
	
	@GetMapping("/creditalarm")
	public String getCreditAlarm() {
		
		CreditAlarm creditAlarm = creditAlarmRepository.findById((long) 1).get();
		System.out.println(creditAlarm.toString());
		return creditAlarm.toString();
	}
	
	@GetMapping("/vmlist")
	public String vmlist() {
		
		ArrayList<BankersEmp> bankersEmp = 
				(ArrayList<BankersEmp>)bankersEmpRepository.findAll();
		
		System.out.println(bankersEmp.toString());
		return bankersEmp.toString();
	}
//	git push test by sanggeon
}
