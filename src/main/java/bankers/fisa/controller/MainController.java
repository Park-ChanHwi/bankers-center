package bankers.fisa.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.CustEmp;
import bankers.fisa.entity.VM;
import bankers.fisa.entity.ckey.VMckey;
import bankers.fisa.repository.CustEmpRepository;
import bankers.fisa.repository.VMRepository;

@RestController
@RequestMapping("/center")
public class MainController {

	@Autowired
	private final CustEmpRepository custEmpRepository = null;
	@Autowired
	private final VMRepository vmRepository = null;
	
	@PostMapping("/getvm")
	public String getvm(
			@RequestParam("id") String id,
			@RequestParam("vmnumber") String vmnumber) {
		return vmRepository.findLatestVM(vmnumber).toString();
	}
	
	@PostMapping("/vmcreate")
	public String vmcreate(
			@RequestParam("vmname") String vmname,
			@RequestParam("catalType") String catalType,
			@RequestParam("creater") String creater) {
		try {
			int custEmpNumber = custEmpRepository.findById(creater).get().getCust_emp_number();
			
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			String date = dateFormat.format(new Date());
			
			System.out.println(date);
			VMckey vmckey = new VMckey(vmRepository.getMAXNumber() + 1, date);
			VM newVM = new VM(vmckey, vmname, catalType, "preparing", "OFF", custEmpNumber);
			
			vmRepository.save(newVM);
			
			return "true";
		} catch (Exception e) {
			return "false";
		}
	}
	
	@PostMapping("/custemp")
	public String custEmp(@RequestParam("custEmpNumber") int custEmpNumber) {
		try {
			return custEmpRepository.findbyCustEmpNumber(custEmpNumber).toString();
		} catch (Exception e) {
			return "false";
		}
	}
	
	@PostMapping("/vmlist")
	public String vmlist(@RequestParam("id") String id) {
		List<VM> vmlist = vmRepository.findAllLatestVM();
		String result = new String();
		for(VM vm : vmlist) {
			result += vm.toString() + ",";
		}
		return result;
	}

	@PostMapping("/login")
	public String loginPage(
			@RequestParam("loginID") String id, 
			@RequestParam("loginPW") String pw) {
		if(login(id, pw)) {
			return "true";
		}else {
			return "false";
		}
	}
	
	private boolean login(String id, String pw) {
		try {
			CustEmp player = custEmpRepository.findById(id).get();
			if (pw.equals(player.getCust_pw())) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
