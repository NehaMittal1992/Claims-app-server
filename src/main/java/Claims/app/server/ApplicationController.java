package Claims.app.server;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String getName() {
		return "hello";
	}
	
	@Autowired
	private ClaimRepository claimRepository;
	
	@GetMapping("/claim")
	public List getClaim() {
		 List claim = new ArrayList<>();
		 claimRepository.findAll().forEach(claim::add);
		return claim;
	}
	
	@GetMapping("/addClaim")
	public void addClaim() {
		CLAIM claim = new CLAIM(1, "PA1001", "glass", 77);
		claimRepository.save(claim);
    }
}
