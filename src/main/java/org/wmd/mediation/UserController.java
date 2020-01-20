package org.wmd.mediation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.entities.User;
import org.wmd.domain.user_management.UserFinder;
import org.wmd.domain.user_management.UserRegistration;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController implements UserMangWS  {

		@Autowired
	private UserFinder userFinder; 
		@Autowired
	private UserRegistration userRegistration;
	
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userFinder.getUsers();
	}

	@RequestMapping(value = "/users/{login}/{pass]", method = RequestMethod.GET)
	@Override
	public Optional<User> getUser(@PathVariable String login, @PathVariable String pass) {
		// TODO Auto-generated method stub
		return userFinder.getUser(login, pass);
	}

	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
	@Override
	public Optional<User> getUserById(@PathVariable Long userId) {
		// TODO Auto-generated method stub
		return userFinder.getUserById(userId);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@Override
	public User registerUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return userRegistration.registerUser(user);
	}


	@RequestMapping(value = "/users/{id}", method = RequestMethod.PATCH)
	@Override
	public User udpateUser(@RequestBody User user, @PathVariable Long id) {
		// TODO Auto-generated method stub
		return userRegistration.udpateUser(user, id);
	}
	
	
//	@CrossOrigin(origins = "*")
//	@RequestMapping(value = "/services/users/{userId}", method = RequestMethod.GET)
//	public List<ProposedService> getServiceByUser(@PathVariable Long userId) {
//		// TODO Auto-generated method stub
//		return userFinder.getServiceByUser(userId);
//	}


}
