package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Home  implements Serializable{
	
	
	private String register;
	private String login;
	private String admin;
	
	public String getRegister() {
		return register;
	}
	
	public void setRegister(String register) {
		this.register = register;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Bank [register=" + register + ", login=" + login + ", admin=" + admin + "]";
	}

}
