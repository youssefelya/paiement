package org.wmd.mediation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wmd.dao.entities.ProposedService;
import org.wmd.domain.user_management.ProposedServices;
import org.wmd.domain.user_management.UserFinder;

@CrossOrigin(origins = "*")
@RestController
public class UserManagement implements UserManagementWS {

	@Autowired
	ProposedServices proposedServices;
	@Autowired
	private UserFinder userFinder; 

	@Override
	@GetMapping("/services")
	public List<ProposedService> showServices() {
		return proposedServices.getServices();
	}

	@Override
	@GetMapping("/services/{id}")
	public Optional<ProposedService> getServiceDetails(@PathVariable(value = "id") Long serviceId) {
		return proposedServices.getServiceById(serviceId);
	}

	@RequestMapping(value = "/service", method = RequestMethod.POST)
	@Override
	public ProposedService addService(@RequestBody ProposedService prosedService) {
		// TODO Auto-generated method stub
		return proposedServices.addService(prosedService);
	}
	
//	@CrossOrigin(origins = "*")
//	@RequestMapping(value = "/services/users/{userId}", method = RequestMethod.GET)
//	public List<ProposedService> getServiceByUser(@PathVariable Long userId) {
//		// TODO Auto-generated method stub
//		return userFinder.getServiceByUser(userId);
//	}


}
