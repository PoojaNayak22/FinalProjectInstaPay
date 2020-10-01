/*This is the model class for Login*/

package com.dxc.ipay.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Login implements Serializable {
	
	
     @Id //	indicates primary key in the database table of name Login

	private String userId;
	
	private String password;

	/*getters & setters methods for the above declared entities*/
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    /* toString method for the entities*/

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	
}
