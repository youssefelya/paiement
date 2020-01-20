package org.wmd.dao.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 15)
	private String login;
	@Column(length = 15)
	private String password;

	@OneToOne
	private Profile profile;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinTable(name = "USER_SERVICE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "SERVICE_ID"))
	private Collection<ProposedService>  services;

	public User() {
		super();
	}

	/**
	 * @param login
	 * @param password
	 * @param profile
	 * @param services
	 */
	public User(String login, String password, Profile profile, Collection<ProposedService> services) {
		super();
		this.login = login;
		this.password = password;
		this.profile = profile;
		this.services = services;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the profile
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * @return the services
	 */
	public Collection<ProposedService> getServices() {
		return services;
	}

	/**
	 * @param services the services to set
	 */
	public void setServices(Collection<ProposedService> services) {
		this.services = services;
	}

	
	

}
