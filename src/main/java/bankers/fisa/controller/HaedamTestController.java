package bankers.fisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bankers.fisa.entity.VM;
import bankers.fisa.entity.ckey.VMckey;
import bankers.fisa.repository.VMRepository;

@RestController
public class HaedamTestController {
	@Autowired
	private final VMRepository vmRepository = null;
	
	@GetMapping("/vmtest")
	public String vmtest() {
		
		VMckey vmkey = new VMckey(1,"2023-08-22 18:36:05");
		
		VM vm = vmRepository.findById(vmkey).get();
		return vm.toString();
	}
}
