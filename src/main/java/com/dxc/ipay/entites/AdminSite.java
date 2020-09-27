/*This is the model class for AdminSite*/

package com.dxc.ipay.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class AdminSite {
	
	@Id //indicates primary key in the database table of name AdminSite

	private int userId;
	private String requestStatement;
	private String fundsDeposit;
	private String serviceProvider;
	private boolean approval;
	
	/*getters & setters methods for the above declared entities*/

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRequestStatement() {
		return requestStatement;
	}
	public void setRequestStatement(String requestStatement) {
		this.requestStatement = requestStatement;
	}
	public String getFundsDeposit() {
		return fundsDeposit;
	}
	public void setFundsDeposit(String fundsDeposit) {
		this.fundsDeposit = fundsDeposit;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	
    /* toString method for the entities*/

	@Override
	public String toString() {
		return "AdminSite [userId=" + userId + ", requestStatement=" + requestStatement + ", fundsDeposit="
				+ fundsDeposit + ", serviceProvider=" + serviceProvider + ", approval=" + approval + "]";
	}
	

}
