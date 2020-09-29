/*This is the model class for Admin*/
package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Admin implements Serializable{
	
	@Id //indicates primary key in the database table of name Admin

	private String adminId;
	
	private String password;

	/*getters & setters methods for the above declared entities*/


	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPasssword() {
		return password;
	}

	public void setPasssword(String passsword) {
		this.password = passsword;
	}
	
    /* toString method for the entities*/

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + "]";
	}
	
	
}
