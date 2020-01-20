package org.wmd.domain.user_management;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.entities.User;
import org.wmd.dao.repositories.UserRepository;

@Service
public class UserRegistry implements UserRegistration, UserFinder {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> getUser(String login, String password) {
		return userRepository.findByLoginAndPassword(login, password);
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return userRepository.findById(userId);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return  userRepository.findAll();
	}

	@Override
	public List<ProposedService> getServiceByUser(Long userId) {
		User user =  userRepository.findById(userId).get();
		return (List<ProposedService>) user.getServices();
	}



	@Override
	public User udpateUser(User user, Long id) {
		User us = userRepository.findById(id).get();
		if(us!=null) {
		Collection<ProposedService> userServ =  us.getServices();
		for(ProposedService service : user.getServices()) {
			userServ.add(service);
		}
			us.setServices(userServ);
			us.getProfile().setBalance(user.getProfile().getBalance());
			user = us;
			return userRepository.saveAndFlush(user);
		}
		return  null;
	}

}
