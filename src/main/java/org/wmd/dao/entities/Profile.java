package org.wmd.dao.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Profile implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private boolean isSmooker;
	private boolean isHandicap;

	// X-Preferences : TODO

	// BankPaymentInfos & TelecomPaymentInfos : TODO
	private double balance;

	public Profile() {
		super();
	}

	public Profile(Date birthDate, boolean isSmooker, boolean isHandicap, double balance) {
		super();
		this.birthDate = birthDate;
		this.isSmooker = isSmooker;
		this.isHandicap = isHandicap;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isSmooker() {
		return isSmooker;
	}

	public void setSmooker(boolean isSmooker) {
		this.isSmooker = isSmooker;
	}

	public boolean isHandicap() {
		return isHandicap;
	}

	public void setHandicap(boolean isHandicap) {
		this.isHandicap = isHandicap;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
