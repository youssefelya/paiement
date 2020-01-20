package org.wmd.dao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wmd.dao.entities.User;

//This is an Interface.
//No need Annotation here.
public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByLoginAndPassword(String login, String password);

}
