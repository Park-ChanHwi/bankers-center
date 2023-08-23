package bankers.fisa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.BankersEmp;
<<<<<<< HEAD
import bankers.fisa.entity.Cust;
import bankers.fisa.entity.EmpRevenue;
import bankers.fisa.repository.BankersEmpRepository;
=======
import bankers.fisa.entity.CreditAlarm;
import bankers.fisa.entity.Cust;
import bankers.fisa.entity.CustEmp;
import bankers.fisa.entity.EmpRevenue;
import bankers.fisa.repository.BankersEmpRepository;
import bankers.fisa.repository.CreditAlarmRepository;
import bankers.fisa.repository.CustEmpRepository;
>>>>>>> f84e1b2e99c7b5e05179248babf3bf8177ded518
import bankers.fisa.repository.CustRepository;
import bankers.fisa.repository.EmpRevenueRepository;

@RestController
@RequestMapping("/center-test")
public class TestController {
<<<<<<< HEAD
<<<<<<< HEAD
	
	@GetMapping("/test")
	public String test() {	
        return "Center Tesst111";
=======
=======
>>>>>>> f84e1b2e99c7b5e05179248babf3bf8177ded518

	@Autowired
	private final BankersEmpRepository bankersEmpRepository = null;
	@Autowired
	private final EmpRevenueRepository empRevenueRepository = null;
	@Autowired
	private final CustRepository custRepository = null;
<<<<<<< HEAD
=======
	@Autowired
	private final CustEmpRepository custEmpRepository = null;
	@Autowired
	private final CreditAlarmRepository creditAlarmRepository = null;
>>>>>>> f84e1b2e99c7b5e05179248babf3bf8177ded518
	
	@GetMapping("/bankersemp")
	public String getBankersEmp() {
		
		BankersEmp bankersEmp = bankersEmpRepository.findById((long) 1).get();
		System.out.println(bankersEmp.toString());
		return bankersEmp.toString();
<<<<<<< HEAD
=======
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
>>>>>>> f84e1b2e99c7b5e05179248babf3bf8177ded518
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
