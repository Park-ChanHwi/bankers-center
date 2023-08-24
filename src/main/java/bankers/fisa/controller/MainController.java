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
	public String vmList(
			@RequestParam("loginID") String loginID, 
			@RequestParam("loginPW") String loginPW) {
		String result = "false";
		CustEmp player = null;
		try {
			player = custEmpRepository.findById(loginID).get();
		} catch (Exception e) {
			return result;
		}
		if (player != null) {
			if (loginPW.equals(player.getCust_pw())) {
				List<VM> vmlist = vmRepository.findAll();
				result = "";
				for(VM vm : vmlist) {
					result += vm.toString() + ",";
				}
			}
			return result.substring(0, result.length());
		} else {
			return result;
		}
	}

	@PostMapping("/login")
	public String login(
			@RequestParam("loginID") String loginID, 
			@RequestParam("loginPW") String loginPW) {
		String result = "false";
		CustEmp player = null;
		try {
			player = custEmpRepository.findById(loginID).get();
		} catch (Exception e) {
			return result;
		}
		if (player != null) {
			if (loginPW.equals(player.getCust_pw())) {
				result = "true";
			}
			return result;
		} else {
			return result;
		}
	}
}
