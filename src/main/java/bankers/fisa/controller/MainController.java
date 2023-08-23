package bankers.fisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.CustEmp;
import bankers.fisa.repository.CustEmpRepository;

@RestController
@RequestMapping("/controller")
public class MainController {
	
	@Autowired
	private final CustEmpRepository custEmpRepository = null;
	
	@PostMapping("/login")
	public String getBankersEmp(
			@RequestParam("loginID") String loginID,
			@RequestParam("loginPW") String loginPW) {
		
		String result = "false";
		
		CustEmp custEmp = null;
		try {
			custEmp = custEmpRepository.findById(loginID).get();
		} catch (Exception e) {
			return result;
		}
		
		if(custEmp != null) {
			
			if(loginPW.equals(custEmp.getCust_pw()) ) {
				result = "true";
			}
			
			return result;
		}else {
			return result;
		}
	}
}
