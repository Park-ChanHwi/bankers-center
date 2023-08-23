package bankers.fisa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class MainController {
	
	@PostMapping("/login")
	public String getBankersEmp(@RequestParam("loginID") String loginID) {
		
		String result = "false";
		if(loginID.equals("asd123")) {
			result = "true";
		}
		return result;
	}
}
