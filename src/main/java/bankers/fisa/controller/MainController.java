package bankers.fisa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.CustEmp;
import bankers.fisa.entity.VM;
import bankers.fisa.repository.CustEmpRepository;
import bankers.fisa.repository.VMRepository;

@RestController
@RequestMapping("/controller")
public class MainController {

	@Autowired
	private final CustEmpRepository custEmpRepository = null;
	@Autowired
	private final VMRepository vmRepository = null;

	@PostMapping("/custemp")
	public String custEmp(@RequestParam("custEmpNumber") int custEmpNumber) {
		try {
			return custEmpRepository.findbyCustEmpNumber(custEmpNumber).toString();
		} catch (Exception e) {
			return "false";
		}
	}
	
	@PostMapping("/vmlist")
	public String vmlist(
			@RequestParam("loginID") String id, 
			@RequestParam("loginPW") String pw) {
		if(login(id, pw)) {
			List<VM> vmlist = vmRepository.findAllLatestVM();
			String result = new String();
			for(VM vm : vmlist) {
				result += vm.toString() + ",";
			}
			return result;
		}else {
			return "false";
		}
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
