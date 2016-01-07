package in.lolva.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.lolva.services.LolvaServices;

@RestController
@RequestMapping("/")
public class LolvaController {
	
	LolvaServices lolvaServices;
	
	public LolvaServices getLolvaServices() {
		return lolvaServices;
	}



	public void setLolvaServices(LolvaServices lolvaServices) {
		this.lolvaServices = lolvaServices;
	}



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getUserActivity() {
		String result = lolvaServices.getPoints(101);
		return result;
	}
	
}