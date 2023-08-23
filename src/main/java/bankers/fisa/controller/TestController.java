package bankers.fisa.controller;

import java.util.ArrayList;

import bankers.fisa.entity.*;
import bankers.fisa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	@Autowired
	private final VmAlarmRepository vmAlarmRepository = null;
	@Autowired
	private  final VmCatalRepository vmCatalRepository = null;
	
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

	@GetMapping("/vmalarm")
	public String getVmAlarm(){

		VmAlarm vmAlarm = vmAlarmRepository.findById((long) 1).get();
		System.out.println(vmAlarm.toString());
		return vmAlarm.toString();
	}

	@GetMapping("/vmcatal")
	public String getVmCatel(){

		VmCatal vmCatal = vmCatalRepository.findById((long) 1).get();
		System.out.println(vmCatal.toString());
		return  vmCatal.toString();
	}
//	git push test by sanggeon
}
