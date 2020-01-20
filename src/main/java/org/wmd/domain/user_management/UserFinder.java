package org.wmd.domain.user_management;

import java.util.List;
import java.util.Optional;

import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.entities.User;

public interface UserFinder {

	public List<User> getUsers();
	public Optional<User> getUser(String login, String pass);

	public Optional<User> getUserById(Long userId);
	
	public List<ProposedService> getServiceByUser(Long userId);

}
