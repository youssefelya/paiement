package org.wmd.mediation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wmd.dao.entities.ProposedService;
import org.wmd.domain.user_management.ProposedServices;
import org.wmd.domain.user_management.UserFinder;

@CrossOrigin(origins = "*")
@RequestMapping(value = "/orders")
@RestController
public class OrderController {
	
	@Autowired
	private UserFinder userFinder; 
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public List<ProposedService> getServiceByUser(@PathVariable Long userId) {
		// TODO Auto-generated method stub
		return userFinder.getServiceByUser(userId);
	}


}
