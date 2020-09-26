package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Admin implements Serializable{
	
	@Id
	private String adminId;
	
	private String passsword;

	

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", passsword=" + passsword + "]";
	}
	
	
}
