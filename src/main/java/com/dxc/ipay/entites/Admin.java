package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Admin implements Serializable{
	
	@Id
	private String adminName;
	
	private String passsword;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", passsword=" + passsword + "]";
	}
	
	
}
