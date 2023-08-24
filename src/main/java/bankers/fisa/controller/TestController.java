package bankers.fisa.controller;

import java.util.ArrayList;

import bankers.fisa.entity.*;
import bankers.fisa.entity.ckey.VMckey;
import bankers.fisa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class TestController {

	@Autowired
	private final BankersEmpRepository bankersEmpRepository = null;
	@Autowired
	private final EmpRevenueRepository empRevenueRepository = null;
	@Autowired
	private final CustRepository custRepository = null;
	@Autowired
	private final CreditAlarmRepository creditAlarmRepository = null;
	@Autowired
	private final VMAlarmRepository vmAlarmRepository = null;
	@Autowired
	private final VMRepository vmRepository = null;
	
	
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

		VMAlarm vmAlarm = vmAlarmRepository.findById((long) 1).get();
		System.out.println(vmAlarm.toString());
		return vmAlarm.toString();
	}

	@GetMapping("/vmtest")
	public String vmtest() {
		
		VMckey vmkey = new VMckey(1,"2023-08-22 18:36:05");
		
		VM vm = vmRepository.findById(vmkey).get();
		return vm.toString();
	}
}
