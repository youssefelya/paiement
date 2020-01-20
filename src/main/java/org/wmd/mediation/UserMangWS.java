package org.wmd.mediation;

import java.util.List;
import java.util.Optional;

import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.entities.User;

public interface UserMangWS {
	
	public Optional<User> getUser(String login, String pass);
	User registerUser(User user);
	public User udpateUser(User user, Long id);
	public Optional<User> getUserById(Long userId);
	public List<User> getUsers();
	//public List<ProposedService> getServiceByUser(Long idUser);
}
