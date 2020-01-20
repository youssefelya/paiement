package org.wmd.domain.user_management;

import org.wmd.dao.entities.User;

public interface UserRegistration {

	public User registerUser(User user);
	public User udpateUser(User user, Long id);
	

}
